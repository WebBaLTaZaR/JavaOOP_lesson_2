package lesson_2.JavaOOP_lesson_2;

public abstract class SuperHuman {
	public String name;
	public  int canRun = 0;
	public  int canJump = 0;

	public SuperHuman(String name, int canJump, int canRun) {
		this.name = name;
		this.canJump = canJump;
		this.canRun = canRun;
	}
	public String getName(){
		return name;
	}
	public int getCanRun(){
		return canRun;
	}
	public int getCanJump(){
		return canJump;
	}
}
