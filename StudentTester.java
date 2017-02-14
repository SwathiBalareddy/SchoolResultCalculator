package Studentcoderanch;
import java.io.*;
import java.util.Scanner;
public class StudentTester {
	
	private static String filename = "C:\\Users\\sbalared\\Desktop";
	
	

	
	public static void main (String[] args)
	{
		File file = new File("C:\\myfileforJava\\Prog3410f.txt");
		Scanner inFile = null;
		
		try {
			inFile = new Scanner(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File1 not found");
			System.exit(0);			
		}
		
		Classroom classroom1 = new Classroom();
		int s = classroom1.getStudentNumber();
		Student[] student = new Student[s];
		System.out.println("Student Quiz1 Quiz2 Midterm Final Final% Grade");
		for(int count=1;count < s+1;count++)
		{
			int quiz1 = inFile.nextInt();
			int quiz2 = inFile.nextInt();
			int midTerm = inFile.nextInt();
			int Final = inFile.nextInt();
			
			student[count-1] = new Student(quiz1,quiz2,midTerm,Final);
			
			int studentNumberLength = (int)(Math.log10(s)+1);
			

			String space1 = "";
			             if (studentNumberLength == 1)
			             {
			              space1 = "      ";   
			                }
			             else if (studentNumberLength == 2)
			             {
			              space1 = "     ";  
			                }
			      
			      
			            
			            int quiz1Length = (int)(Math.log10(quiz1)+1);
			          String space2 = "";
			             if (quiz1Length == 1)
			             {
			              space2 = "      ";   
			                }
			             else if (quiz1Length == 2)
			             {
			               space2 = "     ";  
			                }
			           
			           
			           
			            int quiz2Length = (int)(Math.log10(quiz2)+1);
			          String space3 = "";
			             if (quiz2Length == 1)
			             {
			              space3 = "      ";   
			                }
			             else if (quiz2Length == 2)
			             {
			              space3 = "     ";  
			                }
			           
			                 
			           
			            int midTermLength = (int)(Math.log10(midTerm)+1);
			          String space4 = "";
			             if (midTermLength == 1)
			             {
			              space4 = "      ";   
			                }
			             else if (midTermLength == 2)
			             {
			              space4 = "     ";  
			                }
			             else if (midTermLength == 3)
			             {
			               space4 = "    ";  
			                }
			           
			                 
			          int FinalLength = (int)(Math.log10(Final)+1);
			          String space5 = "";
			             if (FinalLength == 1)
			             {
			              space5 = "      ";   
			                }
			             else if (FinalLength == 2)
			             {
			              space5 = "     ";  
			                }
			             else if (FinalLength == 3)
			             {
			               space5 = "    ";  
			                }
			                 
			          String space6 = "      ";
			           
			          String LetterGrade = student[count-1].getLetterGrade();
			          double FinalP = student[count-1].getFinalPercentage();
			        
			          
			        System.out.println( count + space1+quiz1 + space2 + quiz2 + space3 + midTerm + space4 + 
			        Final + space5 + FinalP + space6 + LetterGrade);
			            
			    
			        }
			         
			        //Closing external file  
			        inFile.close();
			    }    
			}
			 
