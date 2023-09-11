package lesson_2.JavaOOP_lesson_2;

public class Main {
	public static void main(String[] args) {
		SuperHuman[] players = {
				new Human("Егор"),
				new Cat("Кица"),
				new Robot("R2D2")
		};
		Barriers[] barriers = { new RunRoad(500), new Wall(10), new RunRoad(200) };

		for (

		SuperHuman player : players) {
			boolean canPassAllBarriers = true;

			for (Barriers barrier : barriers) {
				if (!barrier.pass(player)) {
					canPassAllBarriers = false;
					break;
				}
			}

			if (canPassAllBarriers) {
				System.out.println(player + " прошел все препятствия");
			} else {
				System.out.println(player + " не смог пройти все препятствия");
			}
		}

	}
}