package lesson_2.JavaOOP_lesson_2;

public class Cat extends Animal {

	public int canRun = 200;
	public int canJump = 2;
	public String name;

	public Cat(String name) {
		super(name, 2, 200);
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
        return "Кот " + getName();
    }
}
