package com.champion.dto;

import com.champion.entities.Registration;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;


@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RegistrationDto {
    private Integer id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registrationDate;

    public RegistrationDto toDto(Registration registration) {
        this.id = registration.getId();
        this.registrationDate = registration.getRegistrationDate();
        return this;
    }

    public Registration toDomain(RegistrationDto registrationDto) {
        Registration registration = new Registration();
        registration.setId(registrationDto.getId());
        registration.setRegistrationDate(registrationDto.getRegistrationDate());
        return registration;
    }
}
