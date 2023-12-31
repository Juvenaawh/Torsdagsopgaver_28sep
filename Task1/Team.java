import java.util.ArrayList;
// 1.b Create an entity class called Team.

class Team{
	
	// 1.c Add a private instance variable a.k.a attribute to Team to hold the team name.
	private String teamName;
	// 1.d Add another private instance variable to hold the Teams rank (some number).
	private int teamRank;
	// 1.e Add yet another private instance variable to hold the names of players in the team.
	// private String [] teamPlayerNames = new String [2];

	// 1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name. 
	// Make sure the parameter value is assigned to the mathcing instance variable.
	public Team(String teamName){
		this.teamName = teamName;
	}

	// 1.h In the Team class add a method called setRank that takes a number and assigns it to the rank attribute.
	public void setRank(int rank){
	this.teamRank = rank;
	}

	/*public void addPlayer(String player, int i){
		players[i] = players;
	}*/

	// 1.j In the Team class add a toString method that returns a String formated like this:
	public String toString(){
		String msg = "Team: " + this.teamName + ", " + "Rank: " + this.teamRank;
		return msg;
	}
}