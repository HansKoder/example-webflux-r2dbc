package com.hansfullstack.mswebfluxr2dbc.repository;

import com.hansfullstack.mswebfluxr2dbc.model.Player;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface PlayerRepository extends R2dbcRepository<Player, Integer> {
}
