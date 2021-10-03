package com.champion.dto;

import com.champion.entities.Match;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;


@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class MatchDto {
    private Integer id;
    private RegistrationDto firstRegistrationId;
    private RegistrationDto secondRegistrationId;
    private Integer round;

    public MatchDto convertEntityToDto(Match match) {
        this.id = match.getId();
        this.setFirstRegistrationId(new RegistrationDto().toDto(match.getFirstRegistrationId()));
        this.setSecondRegistrationId(new RegistrationDto().toDto(match.getSecondRegistrationId()));
        return this;
    }

    public Match convertDtoToEntity(MatchDto matchDto ) {
        var match = new Match();
        match.setId(this.id);
        match.setFirstRegistrationId(new RegistrationDto().toDomain(matchDto.getFirstRegistrationId()));
        match.setSecondRegistrationId(new RegistrationDto().toDomain(matchDto.getSecondRegistrationId()));

        return match;
    }
}
