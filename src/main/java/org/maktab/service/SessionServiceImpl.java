package org.maktab.service;

import org.maktab.model.StudySession;
import org.maktab.repository.StudySessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudySessionServiceImpl implements StudySessionService {
   private final StudySessionRepository studySessionRepository;

    public StudySessionServiceImpl(StudySessionRepository studySessionRepository) {
        this.studySessionRepository = studySessionRepository;
    }


    @Override
    public List<StudySession> findAll() {
        return studySessionRepository.findAll();
    }

    @Override
    public StudySession findById(Long id) {
        return studySessionRepository.findById(id);
    }

    @Override
    public void add(StudySession session) {
        studySessionRepository.add(session);
    }
}
