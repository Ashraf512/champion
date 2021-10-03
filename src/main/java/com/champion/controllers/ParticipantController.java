package com.champion.controllers;

import com.champion.dto.ParticipantDTO;
import com.champion.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "participant-controller")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping(value = "all-participants")
    public ResponseEntity<List<ParticipantDTO>> listParticipants(){
        return ResponseEntity.ok(participantService.listParticipants());
    }

    @PostMapping(value = "add-participant")
    public ResponseEntity<ParticipantDTO>addParticipant( @RequestBody @Valid ParticipantDTO participantDTO){
        return ResponseEntity.ok(participantService.addParticipant(participantDTO));
    }

}
