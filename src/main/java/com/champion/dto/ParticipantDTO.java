package com.champion.dto;

import com.champion.entities.Participant;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import javax.validation.constraints.NotNull;


import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ParticipantDTO {
    private Integer id;
    @NotNull(message = "First Name is Required")
    private String firstName;
    @NotNull(message = "Last Name is Required")
    private String lastName;

    private String email;

    @NotNull(message = "Gender is Required")
    private String gender;

    @NotNull(message = "Date is Required")
    private Date dateOfBirth;
    private CountryDto country;


    public ParticipantDTO convertEntityToDto(Participant participant) {
        this.id = participant.getId();
        this.firstName = participant.getFirstName();
        this.lastName = participant.getLastName();
        this.gender = participant.getGender();
        this.dateOfBirth = participant.getDateOfBirth();
        this.email = participant.getEmail();
        this.setCountry(new CountryDto().toDto(participant.getCountry()));

        return this;
    }

    public Participant convertDtoToEntity(ParticipantDTO participantDTO ) {
        var participant = new Participant();
        participant.setId(this.id);
        participant.setFirstName(this.firstName);
        participant.setLastName(this.lastName);
        participant.setGender(this.getGender());
        participant.setEmail(this.getEmail());
        participant.setDateOfBirth(this.dateOfBirth);
        participant.setCountry(new CountryDto().toDomain(participantDTO.getCountry()));
        return participant;
    }


}
