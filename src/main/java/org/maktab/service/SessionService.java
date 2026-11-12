package org.maktab.service;

import org.maktab.model.StudySession;

import java.util.ArrayList;
import java.util.List;

public interface StudySessionService {
    List<StudySession> findAll();
    StudySession findById(Long id);
    void add(StudySession session);
}
