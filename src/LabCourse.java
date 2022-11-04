

public class LabCourse extends CollegeCourse {
	private final int LAB_FEE = 50;
	static String labInput;
	
	
	
	public LabCourse(String lab) {
		super();
		if (getLabInput().equals("BIO") || getLabInput().equals("CHM") ||getLabInput().equals("CIS") ||getLabInput().equals("PHY")) {
			 display();
			 CollegeCourse.additionalCharge += LAB_FEE;
		}
		else {
			CollegeCourse.course = labInput;
		}
	}

	public String getLabInput() {return labInput;}

	public void setLabInput(String labInput) {LabCourse.labInput = labInput;}
	public void display(){
		System.out.println("There is an additional charge of $" + LAB_FEE);
	}

}
