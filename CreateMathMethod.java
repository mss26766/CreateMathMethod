import java.util.Scanner;

public class CreateMathMethod{
	Scanner keyboard = new Scanner(System.in);
public static void main(String [] args){
output(pow(p()));
output(f(x())+g(y()));
output(Sqrt(s())+ abs(a())+ f(x())+ g(y()));
}
public static void output(int x){
System.out.println(x);}
public static int f(int x){
return x;
}
public static int g(int y){
return y;
}
public static int p(){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the base number");
return keyboard.nextInt();
}
public static int s(){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a number to square root");
return keyboard.nextInt();
}
public static int a(){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter number to find the absolute value");
return keyboard.nextInt();
}
public static int pow(double p){
return (int) (p*p*p*p*p*p*p*p*p*p);
}
public static int x(){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a number for x");
return keyboard.nextInt();
}
public static int y(){
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter another number for y");
return keyboard.nextInt();
}
public static int Sqrt(int s){
double c;
double squareroot = s/2;
do{c=squareroot;
squareroot=(c+(s/c))/2;}
while ((c-squareroot)!=0);
return (int) s;
}
public static int abs(int a){
if (a<0){
a=(a/-1);}
return a;}

}
