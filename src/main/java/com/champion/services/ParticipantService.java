
package com.champion.services;


import com.champion.dto.ParticipantDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParticipantService  {
   // public Branch save(Branch branch);

	 List<ParticipantDTO> listParticipants();

	 ParticipantDTO addParticipant (ParticipantDTO participantDTO);

}

