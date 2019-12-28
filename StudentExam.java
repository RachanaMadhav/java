package abcd;

public class StudentExam extends Library {
		private int sub1;
		private int sub2;
		public StudentExam(int regno,String stdname,String group,int due,int sub1,int sub2){
			super(regno,stdname,group,due);
			this.sub1=sub1;
			this.sub2=sub2;
		}
		public void output(){
		int total=sub1+sub2;
		System.out.println(regno+stdname+group+total+due);
		}
		public void display(){
			System.out.println("this is frm subclass");
		}
		
		public static void main(String[] args) {
			StudentExam details=new StudentExam(123,"asdf","ECE",5,23,34);
			Student student=new Student();
			Student student1=new Student(234,"Wali","Degree");
			details.display();
			details.output();
			student.display();
			student1.display();
			student1=details;
			student1.display();
		}
}
	

