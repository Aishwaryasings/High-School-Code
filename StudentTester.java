public class StudentTester {
      public static void main(String[] args) {

        Student student1 = new Student("Aishwarya"); 
/** puts you induvidual quiz numbers in 
  */
        student1.addQuiz(100);
        student1.addQuiz(90); 
        student1.addQuiz(80); 

        System.out.println("Expected result: Aishwarya - Actual Name: " + student1.getName()); 
        System.out.println("Expected result: 270 - Actual Total Score: " + student1.getTotalScore()); 
        System.out.println("Expected result: 90 - Actual Average Score: " + student1.getAverageScore()); 

    }
}

/** Welcome to DrJava.  Working directory is C:\Users\aishw\Documents
> run StudentTester
Expected result: Aishwarya - Actual Name: Aishwarya 
Expected result: 270 - Actual Total Score: 270.0 
Expected result: 90 - Actual Average Score: 90.0 
> 
*/