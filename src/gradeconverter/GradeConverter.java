/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradeconverter;

/**
 *
 * @author shhua8751
 */

import java.util.*;
public class GradeConverter {

    public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
        double type;         

	do
	{
	    System.out.println("MAIN MENU");
	    System.out.println("=========");
	    System.out.println("1. Convert to a Level grade");
	    System.out.println("2. Convert to a Letter grade");
	    System.out.println("3. Exit \n");
	    System.out.println("Please enter your selection: ");
	    type=sc.nextInt();

	    if (type == 1) percentageToAlpha(); // This should equal to one
	    if (type == 2) percentageToLevel();
	}
	while (type != 3); //This should be !=
    }

    // Conversion function percentage to Alpha
    public static void percentageToAlpha ()
    {
	double grade;  
	String alphaGrade = null;
	String messageOut;

	System.out.println("Please enter the numeric grade: "); 
	grade=sc.nextInt();

	if ((grade < 50) && (grade >= 0)) {  // This should be less than 50 and greater than 0
		alphaGrade="F";
	}else if ((grade >= 50) && (grade <=52))
	{
		alphaGrade = "D-";
	}else if ((grade >= 53) && (grade <=56))
	{
		alphaGrade = "D";
	}else if ((grade >= 57) && (grade <=59))
	{
		alphaGrade = "D+";
	}else if ((grade >= 60) && (grade <=62))  
	{
		alphaGrade = "C-";
	}else if ((grade >= 63) && (grade <=66))
	{
		alphaGrade = "C";
	}else if ((grade >= 67) && (grade <=69))
	{
		alphaGrade = "C+";
	}else if ((grade >= 70) && (grade <=72))
	{
		alphaGrade = "B-";
	}else if ((grade >= 73) && (grade <=76))
	{
		alphaGrade = "B";
	}else if ((grade >= 77) && (grade <=79))
	{
		alphaGrade = "B+";
	}else if ((grade >= 80) && (grade <=84))
	{
		alphaGrade = "A-";
	}else if ((grade >= 85) && (grade <=89))
	{
		alphaGrade = "A";
	}else if ((grade >= 90) && (grade <=100))
	{
		alphaGrade = "A+";
	}else if ((grade < 0) || (grade > 100))//Missing a condition
        {
                alphaGrade = "Error - invalid mark, try again!";
	}

	messageOut=(grade + "% = " + alphaGrade);
	System.out.println(messageOut);
    }

    // Conversion function percentage to level
    public static void percentageToLevel ()

    {
	int grade=0;
	String levelGrade="";
	String messageOut;

	System.out.println("Please enter the numeric grade: ");
	grade=sc.nextInt();

	if ((grade < 50) &&(grade >= 0)) { // This should be greater than 0 at the same time
		levelGrade="R";
	}else if ((grade >= 50) && (grade <=52))
	{
		levelGrade="L1-";
	}else if ((grade >= 53) && (grade <=56))
	{
		levelGrade="L1";
	}else if ((grade >= 57) && (grade <=59))
	{
		levelGrade="L1+";
	}else if ((grade >= 60) && (grade <=62))
	{
		levelGrade="L2-";
	}else if ((grade >= 63) && (grade <=66)) //Missing a equal sign
	{
		levelGrade="L2";
	}else if ((grade >= 67) && (grade <=69))
	{
		levelGrade="L2+";
	}else if ((grade >= 70) && (grade <=72))
	{
		levelGrade="L3-";
	}else if ((grade >= 73) && (grade <=76))
	{
		levelGrade="L4";                   
	}else if ((grade >= 77) && (grade <=79))
	{
		levelGrade="L3+";
	}else if ((grade >= 80) && (grade <=84))
	{
		levelGrade="L4-";
	}else if ((grade >= 85) && (grade <=89))
	{
		levelGrade="L4";
	}else if ((grade >= 90) && (grade <=100))   
	{
		levelGrade="L4+";
	}else if ((grade < 0) ||(grade>100) ){ //Missing a condition.
		levelGrade="Error - invalid mark, try again!";
	}

	messageOut=(grade + "% = " + levelGrade);  //Should be levelgrade.
	System.out.println(messageOut);
    }

}