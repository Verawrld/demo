package com.example.demo.controller;

import com.example.demo.models.Tournament;
import com.example.demo.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

    @Autowired
    private TournamentRepository tournamentRepository;

    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tournament getTournamentById(@PathVariable Long id) {
        return tournamentRepository.findById(id).orElse(null);
    }
}