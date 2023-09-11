package lesson_2.JavaOOP_lesson_2;

public class Human extends Animal {
	public int canRun = 400;
	public int canJump = 3;
	public String name;

	public Human(String name) {
		super(name, 3, 400);
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
        return "Человек " + getName();
    }
}
