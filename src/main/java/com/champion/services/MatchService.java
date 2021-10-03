
package com.champion.services;


import com.champion.dto.MatchDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

	 List<MatchDto> listMatches();


}

