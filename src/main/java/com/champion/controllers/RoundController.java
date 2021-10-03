package com.champion.controllers;

import com.champion.dto.ParticipantDTO;
import com.champion.dto.RoundDto;
import com.champion.services.ParticipantService;
import com.champion.services.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "round-controller")
public class RoundController {

    @Autowired
    private RoundService roundService;

    @GetMapping(value = "all-participants")
    public ResponseEntity<List<RoundDto>> listParticipants(){
        return ResponseEntity.ok(roundService.listRounds());
    }
    @PostMapping(value = "create-round")
    public ResponseEntity<RoundDto> listParticipants(@Valid @RequestBody RoundDto roundDto){
        return ResponseEntity.ok(roundService.addRound(roundDto));
    }


}
