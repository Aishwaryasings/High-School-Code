public class Year {
  private int year;
  
  /** gives you the year
   * param year1 is the year you want
   */
  public Year (int year1) {
    year = year1;
  }
  
  /** tells you if this is leap year
    * @return true if it is a leap year and false if it isn't
    */
  public boolean isLeapYear () {
     if (year > 1582) {
        if (year%4 == 0 && year%100 != 0)
            return true;
        else if (year%400 == 0)
            return true;
        else
            return false;
        }

        else {
            if (year%4 == 0)
                return false;
            else
                return true;
        }
    }
  
  public static void main (String[] args)
    {
        Year year1 = new Year(1800);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false ");
        year1 = new Year(1900);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected:false ");
        year1 = new Year(1994);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false");
        year1 = new Year(1998);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false ");
        year1 = new Year(1999);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false");
        year1 = new Year(2000);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: true");
        year1 = new Year(2001);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false");
        year1 = new Year(2004);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: true");
        year1 = new Year(2100);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected:false ");
        year1 = new Year(4);
        System.out.println(year1.isLeapYear());
        System.out.println("Expected: false");
        
        
        
        }
}

/*
 * Welcome to DrJava.  Working directory is C:\Users\aishw\Documents
> run Year
false 
Expected: false  
false 
Expected:false  
false 
Expected: false 
false 
Expected: false  
false 
Expected: false 
true 
Expected: true 
false 
Expected: false 
true 
Expected: true 
false 
Expected:false  
false 
Expected: false 
> 
*/
  