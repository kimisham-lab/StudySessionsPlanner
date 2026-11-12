package org.maktab.repository;

import org.maktab.model.StudySession;

import java.util.List;

public interface StudySessionRepository {
    List<StudySession> findAll();

    StudySession findById(Long id);

    void add(StudySession session);
}
