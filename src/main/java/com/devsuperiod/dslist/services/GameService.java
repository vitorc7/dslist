package com.devsuperiod.dslist.services;

import com.devsuperiod.dslist.dto.GameMinDTO;
import com.devsuperiod.dslist.entities.Game;
import com.devsuperiod.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dtoList = result.stream().map(x -> new GameMinDTO(x)).toList();
        // You can do something with dtoList if needed
        return dtoList;
    }
}
