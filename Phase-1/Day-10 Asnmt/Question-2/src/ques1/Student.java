package ques1;

public abstract class Student {
	String name;
	String address; 
	abstract void getPercentage( );
	public Student(){
		this.name = "Eswar";
		this.address = "India";
	}
}
 class ScienceStudent extends Student{
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	@Override
	void getPercentage() {
		double per = ((this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/3);
		System.out.println("Marks Percentage is : "+per+"%\n");
		System.out.println("****************************");
	}
	public ScienceStudent(String name,String address, int phmarks, int chemarks, int mathmarks){
		this.name = name;
		this.address = address;
		this.phisicsMarks = phmarks;
		this.chemistryMarks = chemarks;
		this.mathsMarks = mathmarks;
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+address);
		System.out.println("phisics Marks is : "+phmarks);
		System.out.println("chemistry Marks is : "+chemarks);
		System.out.println("maths Marks is : "+mathmarks);
		
	}
}
 class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	@Override
	void getPercentage() {
		double per = ((this.historyMarks+this.civicsMarks)/2);
		System.out.println("Marks Percentage is : "+per+"%\n");
		System.out.println("****************************");
	}
	public HistoryStudent(String name,String address, int hsmarks, int civmarks){
		this.name = name;
		this.address = address;
		this.historyMarks = hsmarks;
		this.civicsMarks = civmarks;
		System.out.println("Name is : "+name);
		System.out.println("Address is : "+address);
		System.out.println("history Marks is : "+hsmarks);
		System.out.println("civics Marks is : "+civmarks);
		
	}
	
}
