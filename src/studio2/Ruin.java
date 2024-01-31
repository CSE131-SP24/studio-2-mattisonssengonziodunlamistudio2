package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount = 5;
	
		for (int totalSimulations = 1; totalSimulations<8; totalSimulations++) {
		while ((0<startAmount) &&(startAmount<10)) 
		{
			double winChance = .8;
			if (Math.random()<winChance)
					{startAmount++;
					}
			else {startAmount--;
					}
		}
		System.out.print("Simulation " + totalSimulations +" : ");
		if (startAmount>9)
				{ System.out.println("Win!");
				}
			
		if (startAmount<1) 
				{System.out.println("Lose");
				}
		}
	}

	private static Object totalSimulations(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
