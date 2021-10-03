package com.champion.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Data
@Entity
public class Country implements Serializable {
    @Id
    private String code;
    private String countryName;
}
