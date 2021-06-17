package JavaPart1Assignments;

public class ObjectArrayPlayers {
	public static void main(String[] args) {
		Object player1[] = new Object[6];
		player1[0] = "Sachin";
		player1[1] = 46;
		player1[2] = "Inida";
		player1[3] = "4/24/1974";
		player1[4] = 'M';
		player1[5] = 120.00;

		Object player2[] = new Object[6];
		player2[0] = "Dhoni";
		player2[1] = 37;
		player2[2] = "Inida";
		player2[3] = "7/7/1981";
		player2[4] = 'M';
		player2[5] = 140.00;

		System.out.println("---------------------------------");
		for (int playercounter = 0; playercounter < player1.length; playercounter++) {
			System.out.println(player1[playercounter]);
		}
		System.out.println("---------------------------------");
		for (int playercounter2 = 0; playercounter2 < player2.length; playercounter2++) {
			System.out.println(player2[playercounter2]);
		}
	}

}
