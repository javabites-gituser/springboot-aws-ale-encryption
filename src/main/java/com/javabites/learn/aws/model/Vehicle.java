package com.javabites.learn.aws.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
public class Vehicle {
    private String vinNumber;
    private String type;
    private String model;
    private String make;
    private String year;

}