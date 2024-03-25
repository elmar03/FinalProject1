package com.company.finalproject1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
@Table(name = "car")
public class CarEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long carId;
    private String carBrand;
    private String carModel;
    private String carColour;
    private Integer carNumber;
    private Integer carYear;
    private String carSize;


    @OneToOne(mappedBy = "carEntity")
    private DriverEntity driverEntity;

    // Nubar 252



}
