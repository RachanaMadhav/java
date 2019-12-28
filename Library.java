package abcd;

public class Library extends Student{
	public Library(int regno, String stdname, String group, int due) {
		super(regno, stdname, group);
		this.due = due;
	}
	

	protected int due;


}
