//Snake Ladder Problem
public class SnakeLadderProblem {
	static int positionFirstPlayer = 0;
	static int positionSecondPlayer = 0;
	static int diceRolled = 0;
	static int currentPosition = 0;

	public static void main(String[] args) {
		boolean isPlayer1Turn = true;
		while (positionFirstPlayer < 100 && positionSecondPlayer < 100) {
			System.out.println("---------------");
			if (isPlayer1Turn) {
				System.out.println("player 1 turn");
				boolean extraTurn = playGame(1, positionFirstPlayer);
				positionFirstPlayer = currentPosition;
				if (!extraTurn) {
					isPlayer1Turn = false;
				}
			} else {
				System.out.println("player 2 turn");
				boolean extraTurn = playGame(2, positionSecondPlayer);
				positionSecondPlayer = currentPosition;
				if (!extraTurn) {
					isPlayer1Turn = true;
				}
			}
		}
		if (positionFirstPlayer == 100) {
			System.out.println("player 1 is winner");
		} else {
			System.out.println("player 2 is winner");
		}
		System.out.println("total dice rolled:" + diceRolled);

	}

	public static boolean playGame(int player, int playerPosition) {
		int steps = rollTheDice();
		diceRolled++;

		System.out.println("Dice rolled: " + steps);
		int options = checkOptions();
		switch (options) {
			case 1:
				System.out.println("ladder");
				if (playerPosition + steps <= 100) {
					playerPosition += steps;
				}
				System.out.println("Player " + player + " Position: " + playerPosition);
				currentPosition = playerPosition;
				return true;

			case 2:
				System.out.println("snake");
				playerPosition -= steps;
				if (playerPosition < 0) {
					playerPosition = 0;
				}
				currentPosition = playerPosition; //update for snake
				System.out.println("Player " + player + " Position: " + playerPosition);
				break;

			case 3: // NO PLAY
				System.out.println("no play");
				currentPosition = playerPosition; //update for no play
				System.out.println("Player " + player + " Position: " + playerPosition);
				break;
		}

		System.out.println("current playerPosition:" + playerPosition);
		return false;
	}

	public static int rollTheDice() {
		return (int) (Math.random() * 6) + 1;
	}

	public static int checkOptions() {
		return (int) (Math.random() * 3) + 1;

	}
}
