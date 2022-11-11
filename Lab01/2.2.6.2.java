import java.util.Scanner;  
public class SecondDegree  
{  
public static void main(String[] Strings)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of a: ");  
double a = input.nextDouble();  
System.out.print("Enter the value of b: ");  
double b = input.nextDouble();  
System.out.print("Enter the value of c: ");  
double c = input.nextDouble();  
double d= b * b - 4.0 * a * c;  

 if (d == 0.0)   
{  
double r1 = -b / (2.0 * a);  
System.out.println("Nghiem la " + r1);  
}   
else if (d <0.0)
{  
System.out.println("Vo nghiem");  
}  
else if (d> 0.0 && a!=0)   {

double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
System.out.println("Nghiem la " + r1 + " va  " + r2);  

}   
else if (a==0){
		System.out.println("Nghiem la " + -c/b);
}
} 
} 
 