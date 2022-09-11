package com.javabites.learn.aws.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="vehicle")
@Data
public class VehicleEntity {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="vin")
    private String vinNumber;

    @Column(name="type")
    private String type;

    @Column(name="model")
    private String model;

    @Column(name="make")
    private String make;

    @Column(name="mode_year")
    private String year;

    @Column(name="created_on", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdOn;

    @Column(name="created_by")
    private String createdUser;

}
