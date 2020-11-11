package com.cenfotec.MongoBasico.service;

import com.cenfotec.MongoBasico.domain.Journal;

import java.util.List;

public interface JournalService {
    public List<Journal> getAllJournals();
    public void saveJournal(Journal newJournal);
    public List<Journal> findJournalsByTitle(String title);
    public void deleteAllJournals();
}