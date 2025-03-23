package com.example.repository;

import com.example.models.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByStartDate(LocalDate startDate);

    List<Tournament> findByLocationContaining(String location);
}