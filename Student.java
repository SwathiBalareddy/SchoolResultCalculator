package Studentcoderanch;

public class Student 
{

	private int Quiz1;
    private int Quiz2;
    private int MidTerm;
    private int Final;
     
    private double FinalP;
    private String LetterGrade;
     

	public Student(int q1,int q2, int mt, int f)
	{
		Quiz1 = q1;
		Quiz2 = q2;
		MidTerm = mt; 
		Final = f;
		
	}
	

public double makeFinalGrade()
    {
     double quizCombined = (Quiz1+Quiz2+MidTerm+Final)/4;
     double fWeighted = Math.round(quizCombined);
     return fWeighted;
 
    }
     
    public String makeLetterGrade()
    {
      if (FinalP >= 90)
      {
        LetterGrade = "A";  
        }
      else if (FinalP >= 90)
      {
       LetterGrade = "B";     
        }  
       else if (FinalP >= 90)
      {
       LetterGrade = "C";     
        }  
      else if (FinalP >= 90)
      {
       LetterGrade = "D";     
        } 
      else
      {
       LetterGrade = "F";     
        }
	return LetterGrade;
    }
     
     
    public double getFinalPercentage()
    {
    	FinalP = makeFinalGrade();
    	return(FinalP);
    }
     
     
    public String getLetterGrade()
    {
       LetterGrade= makeLetterGrade();
      return(LetterGrade);
    }
    }
 

 