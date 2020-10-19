

public class StudentDetail 
{
	
	static String collegeName = "SRM College"; //class variable 
	private int collegeId;//instance variable 
	private String stuName;
	private String dept;

	private float percentage;
	
	StudentDetail(int collegeId, String stuName, String dept) {
		super();
		this.collegeId = collegeId;
		this.stuName = stuName;
		this.dept = dept;
		
	}
	
	public void calPercentage(float[] marks, float maxMarks) {
		int len=marks.length; //local variable
		float sum=0;
		for(int i=0;i<len;i++) {
			sum+=marks[i];
		}
		
		this.percentage=(sum/(maxMarks*len))*100;
	}
	
	
	
	
	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		StudentDetail.collegeName = collegeName;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentDetail [collegeId=" + collegeId + ", stuName=" + stuName + ", dept=" + dept + "]";
	}
	
	
	

}
