package lesson_2.JavaOOP_lesson_2;

public class Wall extends Barriers {
	private int heigh;

	public Wall(int heigh) {
		this.heigh = heigh;
	}

	public int getHeight() {
		return heigh;
	}

	@Override
	public void jump(int height, SuperHuman[] players) {
		for (SuperHuman player : players) {
			if (height > player.getCanJump()) {
				System.out.println(player.getName() + " не смог перепрыгнуть");
			} else {
				System.out.println(player.getName() + " перепрыгнул " + height + " метров");
			}
		}
	}

	@Override
	public void run(int length, SuperHuman[] players) {
	}

	@Override
	public boolean pass(SuperHuman player) {
		if (player.getCanJump() >= getHeight()) {
			return true;
		} else {
			return false;
		}
	}
}
