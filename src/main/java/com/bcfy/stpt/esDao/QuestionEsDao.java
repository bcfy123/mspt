package com.bcfy.stpt.esDao;

import com.bcfy.stpt.model.dto.question.QuestionEsDto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDto, Long> {
}
