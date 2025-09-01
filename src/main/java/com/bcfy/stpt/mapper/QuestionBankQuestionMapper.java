package com.bcfy.stpt.mapper;

import com.bcfy.stpt.model.entity.QuestionBankQuestion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 王嘉乐
* @description 针对表【question_bank_question(题库题目)】的数据库操作Mapper
* @createDate 2025-08-31 23:53:44
* @Entity com.bcfy.stpt.model.entity.QuestionBankQuestion
*/
@Mapper
public interface QuestionBankQuestionMapper extends BaseMapper<QuestionBankQuestion> {

}




