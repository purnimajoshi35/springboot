package com.example.Lab1.md;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players",rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
