package org.maktab.repository;

import org.maktab.model.StudySession;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudySessionRepositoryImpl implements StudySessionRepository {
    private static final List<StudySession> studySessions = new ArrayList<>();

    static {
        studySessions.add(new StudySession(1L, 1L, 60, "Algebra"));
        studySessions.add(new StudySession(2L, 1L, 45, "Calculus"));
        studySessions.add(new StudySession(3L, 2L, 50, "Mechanics"));
        studySessions.add(new StudySession(4L, 3L, 90, "Java Programming"));
    }

    @Override
    public List<StudySession> findAll() {
        return studySessions;
    }

    @Override
    public StudySession findById(Long id) {
        return studySessions.stream()
                .filter(session -> session.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public void add(StudySession session) {
        studySessions.add(session);
    }
}
