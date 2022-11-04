
public class CollegeCourse {
	protected static String course;
	private int courseNumber, credits, totalCost;
	private final int COST_PER_CREDIT = 120;
	public static int additionalCharge = 0;
	
	public String getCourse() {return course;}

	public void setCourse(String course) {this.course = course;}

	public int getCourseNumber() {return courseNumber;}

	public void setCourseNumber(int courseNumber) {this.courseNumber = courseNumber;}

	public int getCredits() {return credits;}

	public void setCredits(int credits) {this.credits = credits;}
	
	public int getTotalCost() {return totalCost;}

	public void setTotalCost(int totalCost) {this.totalCost = totalCost * COST_PER_CREDIT + additionalCharge;}

	public void collegeCourse(String course, int courseNumber, int credits) {
		CollegeCourse.course = course;
		this.courseNumber = courseNumber;
		this.credits = credits;
	}
	
	public void display() {
		System.out.println("The course is " + getCourse() + getCourseNumber() + ". \n"
				+ "This course has "+ getCredits() + " credits, for a total cost of: $" + totalCost);
	}
	
	
}
