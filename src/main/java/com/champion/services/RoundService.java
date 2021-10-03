package com.champion.services;

import com.champion.dto.ParticipantDTO;
import com.champion.dto.RoundDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoundService {

    List<RoundDto> listRounds();

    RoundDto addRound (RoundDto roundDto);

}
