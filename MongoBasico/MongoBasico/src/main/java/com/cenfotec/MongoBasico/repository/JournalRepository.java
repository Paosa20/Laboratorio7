package com.cenfotec.MongoBasico.repository;

import com.cenfotec.MongoBasico.domain.Journal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JournalRepository extends MongoRepository<Journal, String> {
    public List<Journal> findByTitleLike(String word);
}
