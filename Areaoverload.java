import java.util.*;
class Area1{
void area(int x){
System.out.println("the area of the square is "+x*x+" sq units");
}
void area(int x, int y){
System.out.println("the area of the rectangle is "+x*y+" sq units");
}
void area(double x){
double z = 3.14 * x * x;
System.out.println("the area of the circle is "+z+" sq units");
}
}
class Areaoverload{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Area1 obj = new Area1();
System.out.println("enter the side of square");
int side = sc.nextInt();
obj.area(side);
System.out.println("enter the radius of circle");
double r = sc.nextDouble();
obj.area(r);
System.out.println("enter the length and breadth of rectangle");
int l = sc.nextInt();
int b = sc.nextInt();
obj.area(l,b);

}
}
