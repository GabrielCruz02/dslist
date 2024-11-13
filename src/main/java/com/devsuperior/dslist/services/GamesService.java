package com.devsuperior.dslist.services;

import com.devsuperior.dslist.DTO.GamesMinDTO;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GamesMinDTO> findAll(){
        List<Games> result = gamesRepository.findAll();
        return result.stream().map(x -> new GamesMinDTO(x)).toList();
    }
}
