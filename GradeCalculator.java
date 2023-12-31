package cognifyz_level_1;

import java.util.Scanner;

public class GradeCalculator {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []grade = new int[100];

        System.out.print("Enter the number of grades:- ");
        int numGrades = scan.nextInt();

        if (numGrades <= 0) {
            System.out.println("invalid number of grades.");
            return;
        }
        
        for(int i=0;i<numGrades;i++) {
        	System.out.print("Enter Grade "+(i+1)+" :-");
        	grade[i]=scan.nextInt();
        }
        
        int sum = 0;
        for(int i=0;i<numGrades;i++) {
        	sum =sum + grade[i];
        }
        double average = sum /numGrades;
        
        System.out.print("The average of grades ");
        for(int i=0;i<numGrades;i++) {
        	System.out.print(grade[i]+" ");
        }
        System.out.println(" is "+average);
        scan.close();

	}

}
