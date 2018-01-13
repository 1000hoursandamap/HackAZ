/*-------------------------------------------------------------------------
// AUTHOR: Oscar Veloria Jr.


// FILENAME: Assignment8.java
// SPECIFICATION: The assignment reads a text file, parses the strings into an array of tokens with double values
 * 				  The program calculates the quiz averages and student statistics and displays them.
// FOR: CSE 110- M/W/F 9:40-10:30 AM, homework #8
// TIME SPENT: 8 hours
//----------------------------------------------------------------------*/ 

/*//====================Objective===============================\\
 *  Read student quiz scores from a file, compute statistics, 
 *  return student quiz scores after dropping the lowest score. 
 * 
 * -> Quiz.txt is an input file. 
 * 
 * -> QuizData.java is a class that will contain a 2D array
 * 		-An integer to keep track of number of students enrolled in class
 * 		-An integer to keep track of number of quizzes for each student
 -----------------------------------------------------------------------------*/
import java.text.DecimalFormat;
import java.io.*;

public class Assignment8 
{
	public static void main(String [] args)
	{
		//instantiate a QuizData object by passing the file name
	    QuizData cmp = new QuizData("quiz");

	    DecimalFormat averageFormat = new DecimalFormat( "0.00" );

	    System.out.println(cmp.toString()); // it prints the scores for all stdudents

	    //print the average of quiz scores, no quiz is dropped
	    System.out.println("\nAverage of all quizzes (no quizzes dropped) = "
	                          + averageFormat.format( cmp.quizAverage( ) ) );

	    System.out.println("\nStatistics for each quiz " );
	    System.out.println(cmp.quizStatistics( ));

	    System.out.println("\nA Statistics for each student" );
	    System.out.println( cmp.studentStatistics( ) );
	}
}
