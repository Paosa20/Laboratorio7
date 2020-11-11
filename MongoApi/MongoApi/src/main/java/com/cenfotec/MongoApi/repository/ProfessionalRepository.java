package com.cenfotec.MongoApi.repository;

import com.cenfotec.MongoApi.domain.Professional;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProfessionalRepository extends MongoRepository<Professional, String> {
    public List< Professional > findByName(String name);
}