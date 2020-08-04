package com.capgemini.service;

import com.capgemini.bean.Match;
import com.capgemini.bean.Team;

public class MatchBo {
	public Match createMatch(String data, Team[] teamList) {
		String matchInfo[]=data.split(" , ");
		Match match = new Match();
		match.setDate(matchInfo[0]);
		for(Team team:teamList)
			if(team.getName().equalsIgnoreCase(matchInfo[1]))
				match.setTeamOne(team);
		for(Team team:teamList)
			if(team.getName().equalsIgnoreCase(matchInfo[2]))
				match.setTeamTwo(team);
		match.setVenue(matchInfo[3]);
		return match;
	}
		
		public Team findTeam(String matchDate, Match[] matchList) {
			
			for(Match match: matchList) {
				if(match.getDate().equals(matchDate)) {
				 System.out.println(match.getTeamOne());
				 System.out.println(match.getTeamTwo());
				}
			}
			return null;
	
	}
		public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
			for(Match match: matchList) {
				if(match.getTeam().equals(teamName)) {
					System.out.println(match.getTeam());
					continue;
		}

    }
}
}
