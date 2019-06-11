package com.example.Lab1.md;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String location;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private Set<Player> players;
	
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Team(String name, String location, Set<Player> players) {
		super();
		this.name = name;
		this.location = location;
		this.players = players;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
    
	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", location=" + location + ", players=" + players + "]";
	}
	
	
	
	

}
