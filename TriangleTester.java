public class TriangleTester {
  public static void main(String[] args) {
  Triangle triangle1 = new Triangle(-2.0,-3.0,2.0,1.0,5.0,-2.0);
  
  System.out.println("Side Length 1: "+triangle1.getSide1());
  System.out.println("Side Length 2: "+triangle1.getSide2());
  System.out.println("Side Length 3: "+triangle1.getSide3());
  System.out.println("Angle Measure 1: "+triangle1.getAngle1());
  System.out.println("Angle Measure 2: "+triangle1.getAngle2());
  System.out.println("Angle Measure 3: "+triangle1.getAngle3());
  System.out.println("Perimeter: "+triangle1.getPerimeter());
  System.out.println("Area: "+triangle1.getArea());
 }

}

/*
 * Welcome to DrJava.  Working directory is C:\Users\aishw\Documents
> run TriangleTester
Side Length 1: 5.656854249492381 
Side Length 2: 4.242640687119285 
Side Length 3: 7.0710678118654755 
Angle Measure 1: 90.00000000000001 
Angle Measure 2: 53.130102354155994 
Angle Measure 3: 36.86989764584401 
Perimeter: 16.970562748477143 
Area: 12.000000000000007 
> run TriangleTester
*/