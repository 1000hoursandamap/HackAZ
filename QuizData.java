import java.io.BufferedReader;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileReader;


public class QuizData 
{
	//Variables
	public int numRows, numColumns;
	String currentLine;
	int sum = 0;
	
	//Instantiates a 2D array called "data" of numRows and numColumns
	private double data [] [] = new double [numRows] [numColumns];
	
	
	//======================Constructor================================\\
	public QuizData(String filename)
	{
		try
		{
			//FileReader Object that takes the string NAMEFILE ^^^
			FileReader fr = new FileReader(filename);
			//BufferedReader Object 
			BufferedReader br = new BufferedReader (fr);
			
			//Creates a string
			String str = "";
			
			//Sets the first line of quiz to str
			str = br.readLine();
			
			//Puts the first line into a String array
			//Gets rid of the spaces in the first line
			String [] splitted1 = str.split("\\s+");
			
			//Parses the "11" into an int 11, sets that equal to numRows
			numRows = Integer.parseInt(splitted1 [0]);
			
			
			//Parses the "6" into an int 6, sets that equal to numColumns
			numColumns = Integer.parseInt(splitted1 [1]);
			
			//Makes a new data array of numRows x numColumns
			data = new double[numRows][numColumns];
			
			//currentsLine is the first line of the quiz file 
			currentLine = br.readLine().trim();
			
			//Companion variable 'i' keeping track of numRows
			int i = 0;
			while(currentLine != null && i < numRows)
			{
				currentLine = currentLine.trim();
				//This makes a String [] array 'splitted' of currentLine except with no spaces. 
				//So splitted [] = first line -- > {1st value, 2nd value,....}
				String [] splitted = currentLine.split("\\s+");
				
				//The nested for loop takes the value of splitted[j] and sets that equal to data[i][j];
				//Combined with the while loop, the 2D data array will have all elements filled in correctly
					for(int j = 0; j < numColumns; j++)
					{
						
						data [i] [j] = Double.parseDouble(splitted [j]);
					}
					
				i++;
				currentLine = br.readLine();
				
			}
			br.close();
		}
		catch(Exception exception)
		{
			System.out.print(exception);
		}
	}
	
	//====================toString========================\\
	public String toString()
	{
		//Prints out the 2D array
		String str = "";
		for(int i = 0; i < numRows; i++)
		{
			str += i;
			for(int j = 0; j < numColumns; j++)
			{
				str += " " + data[i][j];
			}
			str += "\n";
		}
		return str;
	}
	
	//=============quizAverage==============\\
	/* Computes the average of all quizzes
	 */
	public double quizAverage()
	{
		double avg = 0.0;
		double total = 0.0;
		int count = 0;
//		int totalElements = numColumns + numRows;
		
		DecimalFormat fmt = new DecimalFormat("0.##");
		for(int j = 0; j < numColumns; j++)
		{	
			for(int i = 0; i < numRows; i++)
			{
				count++;
				total = total + data[i][j];
			}
		}
		avg = total / count;
		return Double.parseDouble(fmt.format(avg));
	}
	
	public String quizStatistics()
	{
		String str = "";
		//======Student1======\\
		//Max1
		double max1 = data[0][0];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][0] > max1)
			{
				max1 = data[i][0];
			}
		}
		//Min1
		double min1 = data[0][0];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][0] < min1)
			{
				min1 = data[j][0];
			}
		}
		
		//Avg1
		double avg1 = 0.0;
		double total1 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total1 += data[x][0];
		}
		avg1 = total1 / numRows;
		
		//======Student2=====\\
		//Max2
		double max2 = data[0][1];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][1] > max2)
			{
				max2 = data[i][1];
			}
		}
		//Min2
		double min2 = data[0][1];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][1] < min2)
			{
				min2 = data[j][1];
			}
		}
		//Avg2
		double avg2 = 0.0;
		double total2 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total2 += data[x][1];
		}
		avg2 = total2 / numRows;
		
		
		//=====Student3====\\
		//Max3
		double max3 = data[0][2];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][2] > max3)
			{
				max3 = data[i][2];
			}
		}
		//Min3
		double min3 = data[0][2];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][2] < min3)
			{
				min3 = data[j][2];
			}
		}
		//Avg3
		double avg3 = 0.0;
		double total3 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total1 += data[x][2];
		}
		avg3 = total3 / numRows;
		
		//======Student4=====\\
		//Max4
		double max4 = data[0][3];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][3] > max4)
			{
				max4 = data[i][3];
			}
		}
		//Min4
		double min4 = data[0][3];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][3] < min4)
			{
				min4 = data[j][3];
			}
		}
		//Avg4
		double avg4 = 0.0;
		double total4 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total4 += data[x][3];
		}
		avg4 = total4 / numRows;
		
		//=====Student5=======\\
		//Max5
		double max5 = data[0][4];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][4] > max5)
			{
				max5 = data[i][4];
			}
		}
		//Min5
		double min5 = data[0][4];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][4] < min5)
			{
				min5 = data[j][4];
			}
		}
		//Avg5
		double avg5 = 0.0;
		double total5 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total5 += data[x][4];
		}
		avg5 = total5 / numRows;
		
		//=====Student6=======\\
		//Max6
		double max6 = data[0][5];
		for(int i = 0; i < numRows; i++)
		{
			if(data[i][5] > max6)
			{
				max6 = data[i][5];
			}
		}
		//Min1
		double min6 = data[0][5];
		for(int j = 0; j < numRows; j++)
		{
			if(data[j][5] < min6)
			{
				min6 = data[j][5];
			}
		}
		//Avg6
		double avg6 = 0.0;
		double total6 = 0.0;
		for(int x = 0; x < numRows; x++)
		{
			total6 += data[x][5];
		}
		avg6 = total6 / numRows;
		
		DecimalFormat fmt = new DecimalFormat("0.#");
		
					str=	 
						   "Quiz  High    Low   Average \n" + 
						   "====  ====   =====  ======= \n" + 
						   " 1    " + max1 + "   " + min1 + "   " + fmt.format(avg1) + "\n" +
						   " 2    " + max2 + "   " + min2 + "   " + fmt.format(avg2) + "\n" +
						   " 3    " + max3 + "   " + min3 + "   " + fmt.format(avg3) + "\n" +
						   " 4    " + max4 + "   " + min4 + "   " + fmt.format(avg4) + "\n" +
						   " 5    " + max5 + "   " + min5 + "   " + fmt.format(avg5) + "\n" +
						   " 6    " + max6 + "   " + min6 + "   " + fmt.format(avg6) + "\n";
		return str;
	}
	
	//======studentStatistics========\\
	public String studentStatistics()
	{
		//Creates a seperate array consisting of averages in each row :)
		double averages[] = new double[11];
		DecimalFormat fmt = new DecimalFormat("0.#");
		//Calculates the averages of each row and stores them to the averages array
		for(int i = 0; i < data.length; i++)
		{
			double total = 0.0;
			
			for(int g = 0; g < data[i].length; g++)
			{
				total += data[i][g];
			}
			double avg = total / 6.0;
			averages[i] = avg;
		}
		
		String myString = "";
		
		
		
		myString = "Student    Average\n" +
				   "=======    =======\n";
		
				   for(int j = 0; j < 11; j++)
				   {
					   myString += "  " + (j+1) + "        " + fmt.format(averages[j]) + "\n";
				   }
				   
		return myString;
	}
}

