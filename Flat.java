import java.util.Arrays;

public class Flat{ 
public static int[] flatt (int [] [] array1) {
int num = 0;
int [] array2 = new int [array1[0].length*array1.length];
for (int i = 0; i <array1.length; i++) {
for (int j = 0; j<array1[0].length; j++) {
array2[num] = array1[i][j];
num++;
}
}
return array2;
}

public static void main (String [] args) {
int [] [] array3 = { {3,4,5,6}, {6,7,8,9}};
System.out.println(Arrays.toString(flatt(array3)));
}
}

/**Welcome to DrJava.  Working directory is C:\Users\aishw\Documents
> run Flat
[3, 4, 5, 6, 6, 7, 8, 9] 
> 
*/
  