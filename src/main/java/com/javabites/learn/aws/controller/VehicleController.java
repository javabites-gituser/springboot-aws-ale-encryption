package com.javabites.learn.aws.controller;

import com.javabites.learn.aws.dao.entity.VehicleEntity;
import com.javabites.learn.aws.dao.repositories.VehicleRepository;
import com.javabites.learn.aws.model.Vehicle;
import com.javabites.learn.aws.model.VehicleSaveResponse;
import com.javabites.learn.aws.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/rest/v1/vehicle")
public class VehicleController {

    @Autowired
    VehicleService service;

    @PutMapping
    public VehicleSaveResponse saveVehicle(@RequestBody Vehicle vehicle){

        VehicleSaveResponse response = service.process(vehicle);

        return response;
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable("id") Long id){

        Vehicle response = service.fetchVehicle(id);

        return response;
    }


}
