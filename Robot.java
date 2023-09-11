package lesson_2.JavaOOP_lesson_2;

public class Robot extends SuperHuman {

	public int canRun = 500;
	public int canJump = 5;
	public String name;

	public Robot(String name) {
		super(name, 5, 500);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getCanRun() {
		return canRun;
	}

	public int getCanJump() {
		return canJump;
	}
	@Override
    public String toString() {
        return "Робот " + getName();
    }
}
