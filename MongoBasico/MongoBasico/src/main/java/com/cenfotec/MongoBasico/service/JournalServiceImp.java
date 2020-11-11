package com.cenfotec.MongoBasico.service;

import java.util.List;

import com.cenfotec.MongoBasico.domain.Journal;
import com.cenfotec.MongoBasico.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cenfotec.MongoBasico.domain.Journal;
import com.cenfotec.MongoBasico.repository.JournalRepository;
@Service
public class JournalServiceImp implements JournalService {
    @Autowired
    JournalRepository journalRepo;
    @Override
    public List<Journal> getAllJournals() {
        return journalRepo.findAll();
    }
    @Override
    public void saveJournal(Journal newJournal) {
        journalRepo.save(newJournal);
    }
    @Override
    public List<Journal> findJournalsByTitle(String title) {
        return journalRepo.findByTitleLike(title);
    }
    @Override
    public void deleteAllJournals() {
        journalRepo.deleteAll();
    }
}

