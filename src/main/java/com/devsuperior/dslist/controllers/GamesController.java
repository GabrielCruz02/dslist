package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.DTO.GamesMinDTO;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;
    @GetMapping
    public List<GamesMinDTO>findAll(){
        return gamesService.findAll();
    }
}
