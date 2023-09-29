// 1.a Create a class Main with a main method.

class Main{
	
	public static void main(String [] args){

		// 1.g From the main method in the Main class, create an instance of the Team class (instantiate the Team class).
		Team teamOne = new Team("Miami Dolphins");
		teamOne.setRank(1);
		// 1.k From the main method, create 5 more Team instances and print them.
		Team teamTwo = new Team("Dallas Cowboys");
		teamTwo.setRank(2);
		Team teamThree = new Team("Kansas City Chiefs");
		teamThree.setRank(3);
		Team teamFour = new Team("New York Jets");
		teamFour.setRank(4);
		Team teamFive = new Team("Minnesota Vikings");
		teamFive.setRank(5);

		System.out.println(teamOne);
		System.out.println(teamTwo);
		System.out.println(teamThree);
		System.out.println(teamFour);
		System.out.println(teamFive);

		// 1.i From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice.
		//teamOne.setRank(5);
	}
}