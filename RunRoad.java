package lesson_2.JavaOOP_lesson_2;

public class RunRoad extends Barriers {
	private int length;

	public RunRoad(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void run(int length, SuperHuman[] players) {
		for (SuperHuman player : players) {
			if (length > player.getCanRun()) {
				System.out.println(player.getName() + " не смог пробежать");
			} else {
				System.out.println(player.getName() + " пробежал " + length + " метров");
			}
		}
	}

	@Override
	public void jump(int heigh, SuperHuman[] players) {

	}

	@Override
	public boolean pass(SuperHuman player) {
		if (player.getCanRun() >= getLength()) {
			return true;
		} else {
			return false;
		}
	}
}
