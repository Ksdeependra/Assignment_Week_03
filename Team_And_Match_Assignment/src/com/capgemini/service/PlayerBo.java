package com.capgemini.service;

import com.capgemini.bean.Player;

public class PlayerBo {
	public Player createPlayer(String data) {
		Player player=new Player();
		String[] playerData=data.split(" ,");
		player.setCountry(playerData[0]);
		player.setName(playerData[1]);
		player.setSkill(playerData[2]);
		return player;
		
		
		
		
		
		
		
		
		
	}
	
	

}
