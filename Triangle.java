import java.lang.Math;
class Triangle {
  private double x1, y1, x2, y2, x3, y3;
  
  
  public Triangle (double a1, double b1, double a2, double b2, double a3, double b3){
    this.x1 = a1;
     this.y1 = b1;
      this.x2 = a2;
       this.y2 = b2;
        this.x3 = a3;
         this.y3 = b3;
  }
  
  /**uses distance formula to get the length of 1 side, does the same for the next 2
    */
  public double getSide1 (){
    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
  }
  
  public double getSide2 (){
    return Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
  }
  
   public double getSide3 (){
    return Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
  }
   
   /**uses law of cosines to get the measure of 1 angle, does the same for the next 2
    */
   public double getAngle1 (){
     return Math.toDegrees(Math.acos((getSide1()*getSide1() + getSide2()*getSide2() - getSide3()*getSide3())/(2*getSide1()*getSide2())));
   }
   
   public double getAngle2 (){
     return Math.toDegrees(Math.acos((getSide2()*getSide2() + getSide3()*getSide3() - getSide1()*getSide1())/(2*getSide2()*getSide3())));
   }
   
   public double getAngle3 (){
     return Math.toDegrees(Math.acos((getSide1()*getSide1() + getSide3()*getSide3() - getSide2()*getSide2())/(2*getSide1()*getSide3())));
   }
   /**adds up the 3 sides to get the perimeter
    */
   public double getPerimeter(){
     return (Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)))+ (Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3)))+
       (Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)));
   }
   
   /**uses heron's formula to get the area using the getSide methods
    */   
   public double getArea(){
    double s = (getSide1()+getSide2()+getSide3())/2.0;
    return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
}
}