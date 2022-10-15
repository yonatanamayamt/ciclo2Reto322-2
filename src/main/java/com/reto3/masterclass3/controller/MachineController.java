package com.reto3.masterclass3.controller;

import com.reto3.masterclass3.entities.Machine;
import com.reto3.masterclass3.entities.Product;
import com.reto3.masterclass3.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Machine")
public class MachineController {
    @Autowired
    private MachineService machineService;
    @GetMapping("/all")
    public List<Machine> getAll(){
        return machineService.getAll();
    }
@PostMapping("/save")
@ResponseStatus(HttpStatus.CREATED)
    public Machine save(@RequestBody Machine p){
        return machineService.save(p);
}
}
