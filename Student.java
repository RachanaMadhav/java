package abcd;
public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	public Student(){
		regno=1234;
		stdname="Ganesh";
		group="ECE";
	}
	public void display(){
		System.out.println(regno+stdname+group);
		System.out.println("this is super class");
	}
	public Student(int regno,String stdname,String group){
		this.regno=regno;
		this.stdname=stdname;
		this.group=group;
	}
}
