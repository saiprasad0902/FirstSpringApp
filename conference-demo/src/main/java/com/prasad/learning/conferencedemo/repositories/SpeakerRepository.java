package com.prasad.learning.conferencedemo.repositories;

import com.prasad.learning.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
