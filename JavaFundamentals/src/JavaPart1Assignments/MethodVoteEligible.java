package JavaPart1Assignments;

import java.util.Scanner;

public class MethodVoteEligible {
	public static void main(String[] args) {
		
		int age1 = 10;
		MethodVoteEligible objVoteEligble = new MethodVoteEligible();
		String eligble = objVoteEligble.voteEligble(age1);
		System.out.println(eligble);
		
		int age2 = 22;
		String eligble1 = objVoteEligble.voteEligble(age2);
		System.out.println(eligble1);
		
		int age3 = 18;
		String eligble2 = objVoteEligble.voteEligble(age3);
		System.out.println(eligble2);
		
	}
	
	public String voteEligble(int age) {
		if (age >= 18 ) {
			return "age "+ age+ " is eligble to vote";
		} else
			return "age "+ age+ " not eligble to vote";
	}

}
