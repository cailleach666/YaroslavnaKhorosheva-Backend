package com.example.server.controller;

import com.example.server.entity.GoatDto;
import com.example.server.service.GoatService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
public class GoatController {
    private final GoatService goatService;
    public GoatController(GoatService goatService){
        this.goatService = goatService;
    }
    @GetMapping("/goats")
    public List<GoatDto> getGoats(){
        return goatService.getAllGoats();
    }
    @GetMapping("/goatstest")
    public List<GoatDto> getGoatsTest(){
        return goatService.getAllGoats();
    }
    @PostMapping("/goat")
    public void addGoat(@RequestBody GoatDto goat){
        goatService.addGoat(goat);
    }
    @GetMapping("/goat/{id}")
    public GoatDto getGoat(@PathVariable long id) {
        return goatService.getGoat(id);
    }

    @DeleteMapping("/goat/{id}")
    public void deleteGoat(@PathVariable long id){
        goatService.deleteGoat(id);
    }
}
