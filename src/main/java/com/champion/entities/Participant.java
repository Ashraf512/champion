package com.champion.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Participant implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "country_code")
    private Country country;

}
