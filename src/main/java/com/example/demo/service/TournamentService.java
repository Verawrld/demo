package com.example.demo.service;

import com.example.demo.models.Tournament;
import com.example.demo.repository.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;

    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    public Tournament addTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> searchTournamentsByLocation(String location) {
        return tournamentRepository.findByLocationContaining(location);
    }
}