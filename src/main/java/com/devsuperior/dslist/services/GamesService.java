package com.devsuperior.dslist.services;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GamesMinDTO;
import com.devsuperior.dslist.entities.Games;
import com.devsuperior.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Games result = gamesRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GamesMinDTO> findAll(){
        List<Games> result = gamesRepository.findAll();
        return result.stream().map(x -> new GamesMinDTO(x)).toList();
    }
}
