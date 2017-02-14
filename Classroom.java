package Studentcoderanch;

import java.io.*;
import java.util.Scanner;

public class Classroom
{
	public int numberofStudents;
	
	public int getStudentNumber()
	{
		File file = new File("C:\\myfileforJava\\Prog3410f.txt");
		Scanner two = null;
		try 
			{
				two = new Scanner(file);
			}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		
		int lines=0;
		while(two.hasNextLine())
		{
			lines++;
			two.nextLine();
		}
		two.close();
		numberofStudents=lines;
		return lines;
		
	}
}
