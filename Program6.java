//import stuff here!
import java.util.Scanner; 
//Your code here
public class program6{
    
  public static void main(String [] args){
      
final double pi = 3.14159;      
      
double rad;
double diameter;
double area;
double circumference;

 Scanner radius = new Scanner(System.in);
 
 System.out.println("Enter the radius of the circle");
 
 rad = radius.nextInt();
 
 diameter = rad*2;
 
 area = ((int)(pi*(rad)*rad*1000))/1000.0;
 
 circumference = ((int)(pi*diameter*1000))/1000.0;
 
 System.out.println("Your radius is:" + rad);
 
 System.out.println("Your diameter is:" + diameter);
 
 System.out.println("Your area is:" + area);
 
 System.out.println("Your circumference is:" + circumference);
      
      
      
  }
        
}
//Paste console output below:
/*
Enter the radius of the circle
4
Your radius is:4.0
Your diameter is:8.0
Your area is:50.265
Your circumference is:25.132

*/
