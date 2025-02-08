package com.mipagina.halls_service.controller;

import com.mipagina.halls_service.dto.HallDTO;
import com.mipagina.halls_service.model.Halls;
import com.mipagina.halls_service.service.IHallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/halls")
public class HallController {

    @Autowired
    private IHallsService hallsService;

    @PostMapping("/create")
    public String createHall(@RequestBody Halls halls){
        hallsService.saveHall(halls);
        return "Hall created successfully";
    }

    @GetMapping("/bring_all")
    public List<Halls> getAllHalls(){
        return hallsService.listHalls();
    }

        @GetMapping("/bringHall/{idHall}")
    public Halls getHall(@PathVariable Long idHall){
        return hallsService.getHall(idHall);
    }

    @PutMapping("/edit/{idHall}")
    public String editHall(@PathVariable Long idHall,
                           @RequestBody Halls halls){
        hallsService.updateHall(idHall,halls);
        return "Hall edited successfully";
    }

    @DeleteMapping("/delete/{idHall}")
    public String deleteHall(@PathVariable Long idHall){
        hallsService.deleteHall(idHall);
        return "Hall deleted successfully";
    }

    @GetMapping("/tables/{idHall}")
    public HallDTO getTableHall(@PathVariable Long idHall){
        return hallsService.getTablesHall(idHall);
    }

}
