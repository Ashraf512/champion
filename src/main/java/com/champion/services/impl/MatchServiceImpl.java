package com.champion.services.impl;

import com.champion.dto.MatchDto;
import com.champion.dto.ParticipantDTO;
import com.champion.entities.Match;
import com.champion.entities.Participant;
import com.champion.repository.MatchRepository;
import com.champion.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Override
    public List<MatchDto> listMatches() {
        Iterable<Match> matchess = matchRepository.findAll();
        List<Match> matches = ( List<Match>) matchess;

        List<MatchDto> matchesDtos = new ArrayList<>();
        matches.forEach(match -> {
            matchesDtos.add(new MatchDto().convertEntityToDto(match));
        });

        return matchesDtos;
    }


}
