package com.champion.dto;

import com.champion.entities.Country;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;


@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CountryDto {
    private String code;
    private String countryName;


    public CountryDto toDto(Country country) {
        this.code = country.getCode();
        this.countryName = country.getCountryName();
        return this;
    }
    public Country toDomain(CountryDto countryDto) {
        Country country = new Country();
        country.setCode(countryDto.getCode());
        country.setCountryName(countryDto.getCountryName());
        return country;
    }
}