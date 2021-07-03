package com.prasad.learning.conferencedemo.repositories;

import com.prasad.learning.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
