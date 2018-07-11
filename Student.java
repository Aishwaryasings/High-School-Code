/**
 * Created by PeriodOne on 10/21/16.
 */

public class Student
{
    private String name;
    private double totalQuizScore;
    private double numofQuiz;

    
    public Student(String name1)
    {
        this.name = name1;
        totalQuizScore = 0;
        numofQuiz = 0;
    }
    
/** gets name of student
  * return gets value of name out
  */
    public String getName()
    {
        return name;
    }
    
    /** adds up the sum of all the quizzes, counts number of quizzes you've taken
      * param (I think?) score is the score for 1 quiz
      */
    public void addQuiz(int score)
    {
         totalQuizScore += score;
         numofQuiz = numofQuiz+1;
    }
    
   /** returns value of total score from above
     */
    public double getTotalScore()
    {
        return totalQuizScore; 
    }
    
    /** returns value of average score by dividing the 2 values you got from addQuiz
      */
    public double getAverageScore()
    {
        return totalQuizScore / numofQuiz;
    }
}
