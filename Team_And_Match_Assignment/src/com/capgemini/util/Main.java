package com.capgemini.util;

import java.util.Scanner;

import com.capgemini.bean.Match;
import com.capgemini.bean.Player;
import com.capgemini.bean.Team;
import com.capgemini.service.MatchBo;
import com.capgemini.service.PlayerBo;
import com.capgemini.service.TeamBo;

public class Main {
	public static void name(String[] args) {
		PlayerBo player = new PlayerBo();
		MatchBo match=new MatchBo();
		TeamBo team=new TeamBo();
		
		Player[] playerList = new Player[11];
		Team[] teamList = new Team[8];
		Match[] matchList = new Match[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the player count:");
		int number = sc.nextInt();
		for(int i=1,k=0;i<=number;i++,k++) {
			System.out.println("Enter player "+ i + " details");
			String details=sc.next();
			playerList[k]=player.createPlayer(details);
		}
		
		
		System.out.println("Enter team count:");
		int number1 = sc.nextInt();
		for(int i=1,k=0;i<=number1;i++,k++) {
			System.out.println("Enter team "+ i + " details");
			String details = sc.next();
			teamList[k] = team.createTeam(details, playerList);
		}
		
		System.out.println("Enter match count:");
		int number2 = sc.nextInt();
		for(int i=1,k=0;i<=number2;i++,k++) {
			System.out.println("Enter match "+ i + " details");
			String details = sc.next();
			matchList[k] = match.createMatch(details, teamList);
		}
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Find Team");
			System.out.println("2. Find all matches in a specific venues");
			System.out.println("Type 1 or 2");
			System.out.println("Enter your choice");
			int number3 = sc.nextInt();
			switch(number3) {
			case 1:
				System.out.println("Enter Match Date");
				String date = sc.next();
				match.findTeam(date, matchList);
				break;
			case 2:
				System.out.println("Enter team name:");
				break;
				
			default:
				System.out.println("Do you want to continue? Type Yes or No ");
				String choice = sc.next();
				if(choice.equals("Yes")) {
					continue;
				}
				else {
					System.out.println("Exit");
					break;
				}
			}
		}
	  }
			
		
}
