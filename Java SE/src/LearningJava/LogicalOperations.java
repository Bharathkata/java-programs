package LearningJava;

public class LogicalOperations {
	 public static void main(String[] args) {

	        int marks = 75;
	        int attendance = 80;

	        System.out.println("Eligible to Pass: " + (marks >= 35 && attendance >= 75));
	        System.out.println("Can Write Exam: " + (marks >= 35 || attendance >= 75));
	        System.out.println("Not Failed: " + !(marks < 35));

	    }
}
