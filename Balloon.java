public class Balloon {
    private double volume;
/** makes initial volume equal to 0
  */
public Balloon () {
  volume = 0;
 }
/**adds @param amount of air to balloon volume
  */
public void addAir(double amount) {
   volume=volume+amount;
    }
/**calculates then gives you the radius
  */
public double getRadius() {
  return  
  }
/**calculates then gives you the surface area
  */
   public double getSurfaceArea() {
     return 4*3.14 *getRadius()*getRadius();
 }
}