import java.util.Scanner;

public class UseCourse {
	static String courseInput;
	int courseNumberInput, creditInput;

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter course subject: ");
		courseInput = userInput.next();
		
		LabCourse(courseInput);
		
	}

}
