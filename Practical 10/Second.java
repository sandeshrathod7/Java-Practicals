class Student{
 	static int noOfStudents=0;
	String name,regNo;

	Student(String name,String regNo){
		this.name=name;
		this.regNo=regNo;
		noOfStudents++;
	}

	void details(){
		System.out.print("Name: "+name+" , "+"regNo: "+regNo+" , ");
	}
}

class ClgStudent extends Student{
	int mark;      

        ClgStudent(String name,String regNo,int mark){
		super(name,regNo);
		this.mark=mark;
	}

	public static void main(String[] args){

		ClgStudent s1=new ClgStudent("Bhushan","2024BIT016",70);
		System.out.println("total student:"+Student.noOfStudents);
		s1.details();
		System.out.println("mark:"+s1.mark);

		ClgStudent s2=new ClgStudent("Alok","2024BIT004",75);
		System.out.println("total student:"+Student.noOfStudents);
		s2.details();
	

	}
	
	


}