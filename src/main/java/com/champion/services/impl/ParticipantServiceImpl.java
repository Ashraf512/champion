
package com.champion.services.impl;

import com.champion.dto.CountryDto;
import com.champion.dto.ParticipantDTO;
import com.champion.entities.Participant;
import com.champion.repository.ParticipantRepository;
import com.champion.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public List<ParticipantDTO> listParticipants() {
        Iterable<Participant> partitcs = participantRepository.findAll();
        List<Participant> participants = ( List<Participant>) partitcs;

        List<ParticipantDTO> paticipitsDtos = new ArrayList<>();
        participants.forEach(participant -> {
            paticipitsDtos.add(new ParticipantDTO().convertEntityToDto(participant));
        });

        return paticipitsDtos;
    }

    @Override
    public ParticipantDTO addParticipant(ParticipantDTO participantDTO) {
        Participant participant = new Participant();
        participant.setId(participantDTO.getId());
        participant.setFirstName(participantDTO.getFirstName());
        participant.setLastName(participantDTO.getLastName());
        participant.setGender(participantDTO.getGender());
        if (participantDTO.getCountry() != null)
            participant.setCountry(new CountryDto().toDomain(participantDTO.getCountry()));
        participantRepository.save(participant);
        return null;
    }
}
