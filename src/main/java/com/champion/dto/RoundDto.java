package com.champion.dto;

import com.champion.entities.Round;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RoundDto {
    private Integer id;
    private String RoundName;
    private String location;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    private Integer numberOfRounds;

    public RoundDto toDto(Round round) {
        this.id = round.getId();
        this.RoundName = round.getRoundName();
        this.location = round.getLocation();
        this.startDate= round.getStartDate();
        this.endDate= round.getEndDate();
        this.numberOfRounds= round.getNumberOfRounds();
        return this;
    }

    public Round toDomain(RoundDto roundDto) {
        Round round = new Round();
        round.setId(roundDto.getId());
        round.setRoundName(roundDto.getRoundName());
        round.setLocation(roundDto.getLocation());
        round.setStartDate(roundDto.getStartDate());
        round.setEndDate(roundDto.getEndDate());
        round.setNumberOfRounds(roundDto.getNumberOfRounds());
        return round;
    }

}
