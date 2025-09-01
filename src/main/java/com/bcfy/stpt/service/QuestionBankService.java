package com.bcfy.stpt.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bcfy.stpt.model.dto.questionBank.QuestionBankQueryRequest;
import com.bcfy.stpt.model.entity.QuestionBank;
import com.bcfy.stpt.model.vo.QuestionBankVO;

import javax.servlet.http.HttpServletRequest;

public interface QuestionBankService extends IService<QuestionBank> {

    /**
     * 校验 (针对 增加和 修改) 数据 合法性
     * @param questionBank
     * @param add
     */
    void validQuestionBank(QuestionBank questionBank, boolean add);

    /**
     * 获取题库封装
     *
     * @param questionBank
     * @param request
     * @return
     */
    QuestionBankVO getQuestionBankVO(QuestionBank questionBank, HttpServletRequest request);


    /**
     * 获取查询题库的查询条件
     * @param questionBankQueryRequest
     * @return
     */
    Wrapper<QuestionBank> getQueryWrapper(QuestionBankQueryRequest questionBankQueryRequest);


    /**
     * 获取查询题库的 封装版 分页
     * @param questionBankPage
     * @param request
     * @return
     */
    Page<QuestionBankVO> getQuestionBankVOPage(Page<QuestionBank> questionBankPage, HttpServletRequest request);
}
