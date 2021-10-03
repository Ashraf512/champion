package com.champion.services.impl;

import com.champion.dto.RoundDto;
import com.champion.entities.Round;
import com.champion.repository.RoundRepository;
import com.champion.services.RoundService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RoundServiceImpl implements RoundService {

    @Autowired
    private RoundRepository roundRepository;

    @Override
    public List<RoundDto> listRounds() {
        Iterable<Round> irounds = roundRepository.findAll();
        List<Round> rounds = ( List<Round>) irounds;

        List<RoundDto> roundDtos = new ArrayList<>();
        rounds.forEach(round -> {
            roundDtos.add(new RoundDto().toDto(round));
        });

        return roundDtos;    }

    @Override
    public RoundDto addRound(RoundDto roundDto) {
        Round round = new Round();
        round.setId(roundDto.getId());
        round.setRoundName(roundDto.getRoundName());
        round.setLocation(roundDto.getLocation());
        round.setStartDate(roundDto.getStartDate());
        round.setEndDate(roundDto.getEndDate());
        round.setNumberOfRounds(roundDto.getNumberOfRounds());
        roundRepository.save(round);
        return roundDto;
    }
}
