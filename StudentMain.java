

public class StudentMain {

	public static void main(String[] args) 

        {
		
		
		StudentDetail sd = new StudentDetail(767382,"Aman","IT");
		float marks[] = {98,78,82,95,99,91,89};
		float maxMarks=100;
		sd.calPercentage(marks,maxMarks);
		System.out.println(sd.getPercentage());
		

	}

}
