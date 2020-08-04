package com.capgemini.bean;

public class Team {
	public Team(String name, Player player) {
		super();
		this.name = name;
		this.player = player;
	}
	public Team() {
		super();
	}
	private String name;
	private Player player;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	

}
