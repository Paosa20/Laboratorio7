package com.cenfotec.MongoApi.service;

import com.cenfotec.MongoApi.domain.Professional;
import com.cenfotec.MongoApi.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessionalServiceImp implements ProfessionalService {

    @Autowired
    ProfessionalRepository professionalRepo;

    @Override
    public void saveProfessional(Professional newProfessional) {
        professionalRepo.save(newProfessional);
    }
}

