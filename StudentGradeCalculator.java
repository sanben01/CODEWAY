import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
         
		int eng, phy, chem, math, comp; 
	    float total, average, percentage;
	    Scanner sc=new Scanner(System.in);
	    
	    
//	    Input marks of all five subjects 
	    System.out.println("Enter marks of five subjects:");
	    System.out.print("Enter marks of English subjects:");
	    eng=sc.nextInt();
	    System.out.print("Enter marks of physics subjects:");
	    phy=sc.nextInt();
	    System.out.print("Enter marks of chemistry subjects:");
	    chem=sc.nextInt();
	    System.out.print("Enter marks of maths subjects:");
	    math=sc.nextInt();
	    System.out.print("Enter marks of computers subjects:");
	    comp=sc.nextInt();

//	    Calculate total, average and percentage
	    total = eng + phy + chem + math + comp;
	    average = (float) (total / 5.0);
	    percentage = (float) ((total / 500.0) * 100);
	    
	    
//	    Print all results
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);
	    
//	    Calculate Grade
	    if(average >= 90) {
	    	System.out.println("Grade is A+");
	    }else if(average >= 80) {
	    	System.out.println("Grade is A");
	    }else if(average >= 65) {
	    	System.out.println("Grade is B");
	    }else if(average >= 40) {
	    	System.out.println("Grade is C");
	    }else {
	    	System.out.println("Grade is F");
	    }
	    
	}

}
