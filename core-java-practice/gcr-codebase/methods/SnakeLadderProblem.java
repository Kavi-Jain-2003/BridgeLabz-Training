//Snake Ladder Problem
public class SnakeLadderProblem {
	static int position = 0;

	public static void main(String[] args) {
		int diceRolled = 0;
		while (position < 100) {
			int steps = rollTheDice();
			diceRolled++;
			System.out.println("Dice rolled: " + steps);
			int options = checkOptions();
			switch (options) {
				case 1:System.out.println("ladder");
					if (position + steps <= 100) {
						position += steps;
						
					} 
					break;

				case 2:System.out.println("snake");
					position -= steps;
					if (position < 0) {
						position = 0;
					}
					
					break;
				case 3:
					System.out.println("no play");
					break;
			}

			System.out.println("current position:" + position);
		}
		System.out.println("player won the game");
		System.out.println("dice rolled " + diceRolled + " no. of times");

	}

	public static int rollTheDice() {
		return (int) (Math.random() * 6) + 1;
	}

	public static int checkOptions() {
		return (int) (Math.random() * 3) + 1;

	}
}
