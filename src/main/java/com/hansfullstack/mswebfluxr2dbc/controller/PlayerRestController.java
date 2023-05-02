package com.hansfullstack.mswebfluxr2dbc.controller;

import com.hansfullstack.mswebfluxr2dbc.model.Player;
import com.hansfullstack.mswebfluxr2dbc.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerRestController {

    @Autowired
    private PlayerRepository repository;

    @PostMapping("/add")
    Mono<Player> addPlayer (@RequestBody Player player) {
        return repository.save(player);
    }

    @GetMapping("/all")
    Flux<Player> getAllPlayers () {
        return repository.findAll();
    }

}
