package com.bcfy.stpt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bcfy.stpt.model.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author 王嘉乐
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-08-31 23:53:44
* @Entity com.bcfy.stpt.model.entity.Question
*/
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {
    /**
     * 查询题目列表（包括已被删除的数据）
     */
    @Select("select * from question where updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);
}


