package com.carsapi.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.DTO.CarDTO;

@RestController
@RequestMapping("/car")
public class CarController {

    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        System.out.println(req);
        System.out.println("Modelo: " + req.modelo());
        System.out.println("Fabricante: " + req.fabricante());
    }

}
