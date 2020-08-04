package com.capgemini.service;

import com.capgemini.bean.Player;
import com.capgemini.bean.Team;

public class TeamBo {
	public Team createTeam(String data,Player[] PlayerList) {
		Team team=new Team();
		String[] data1=data.split(" ,");
		team.setName(data1[0]);
		for(Player player : PlayerList) {
			if(player.getName().equalsIgnoreCase(data1[1]))
				team.setPlayer(player);
		}
		return team;
		
		
		
	}
	

}
