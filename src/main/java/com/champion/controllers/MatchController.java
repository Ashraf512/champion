package com.champion.controllers;

import com.champion.dto.MatchDto;
import com.champion.dto.ParticipantDTO;
import com.champion.services.MatchService;
import com.champion.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = ("/match-controller"))
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping(value = "/all-matches")
    public ResponseEntity<List<MatchDto>> listMatches(){

        return ResponseEntity.ok(matchService.listMatches());
    }
}
