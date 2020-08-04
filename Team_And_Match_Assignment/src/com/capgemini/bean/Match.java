package com.capgemini.bean;

public class Match {
	
	private String date;
	private Team teamOne;
	private Team teamTwo;
	private String venue;
	private Team team;
	public Match(String date, Team teamOne, Team teamTwo, String venue, Team team) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.team = team;
	}
	public Match() {
		// TODO Auto-generated constructor stub
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Team getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(Team teamOne) {
		this.teamOne = teamOne;
	}
	public Team getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(Team teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Match [date=" + date + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", venue=" + venue + ", team="
				+ team + "]";
	}
	
	

}
