package com.bcfy.stpt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bcfy.stpt.model.entity.QuestionBank;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 王嘉乐
* @description 针对表【question_bank(题库)】的数据库操作Mapper
* @createDate 2025-08-31 23:53:44
* @Entity com.bcfy.stpt.model.entity.QuestionBank
*/
@Mapper
public interface QuestionBankMapper extends BaseMapper<QuestionBank> {

}




