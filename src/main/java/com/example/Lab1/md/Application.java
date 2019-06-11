package com.example.Lab1.md;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	@Autowired
	TeamRepository teamRepository;

	
	@PostConstruct
	public void init()
	{
        List<Team> list = new ArrayList<Team>();
        
        Set<Player> set = new HashSet<Player>();
        
        set.add(new Player("Big Easy", "Showman"));
      	set.add(new Player("Buckets", "Guard"));
      	set.add(new Player("Dizzy", "Guard"));
		
		Team team = new Team();
		
		
	
		team.setName("Harlem");
		team.setLocation("Globetrotters");
		team.setPlayers(set);
		list.add(team);
		
		team = new Team();
	  	
	  	team.setLocation("Washington");
	  	team.setName("Generals");
	  	team.setPlayers(null);
	  	list.add(team);
	  	
	  	
	  	teamRepository.saveAll(list);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
