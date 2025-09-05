package com.bcfy.stpt.job.once;

import cn.hutool.core.collection.CollUtil;
import com.bcfy.stpt.esDao.QuestionEsDao;
import com.bcfy.stpt.model.dto.question.QuestionEsDto;
import com.bcfy.stpt.model.entity.Question;
import com.bcfy.stpt.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

//@Component
@Slf4j
public class FullSyncQuestionToES implements CommandLineRunner{

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionEsDao questionEsDao;

    @Override
    public void run(String... args) throws Exception {
        List<Question> questionList = questionService.list();
        if(CollUtil.isEmpty(questionList)){
            return;
        }
        // 转为question es dto
        List<QuestionEsDto> questionEsDtoList = questionList.stream().map(QuestionEsDto::objToDto).collect(Collectors.toList());
        // 分页批量 存储到 ES
        final int pageSize = 100;
        int total = questionEsDtoList.size();
        log.info("FullSyncQuestionToEs start, total {}", total);
        for(int i = 0 ; i < total ; i+=pageSize){
            int end = Math.min(i+pageSize, total);
            questionEsDao.saveAll(questionEsDtoList.subList(i, end));
        }
        log.info("FullSyncQuestionToEs end, total {}", total);
    }
}
