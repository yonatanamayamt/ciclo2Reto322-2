package com.reto3.masterclass3.controller;

import com.reto3.masterclass3.entities.Client;
import com.reto3.masterclass3.entities.Reservation;
import com.reto3.masterclass3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }
@PostMapping("/save")
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
}
}
