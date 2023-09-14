class cpu{
double price=9000;
void display_1(){
Processor obj_2=new Processor();
obj_2.display_2();
}
class Processor{
int no_of_cores=6;
String pross_manufact="intel";
void display_2(){
System.out.println("Processor manufacturer:" + pross_manufact);
System.out.println("No of cores:" + no_of_cores);
System.out.println("Price:" + price);
}
}
static class RAM{
String memory="32 GB RAM";
String mmry_manufact="samsung";
void display(){
System.out.println("Memory manufacturer:" + mmry_manufact);
System.out.println("Memory:" + memory);
}
}
}
class CPU{
public static void main(String args[]){
cpu obj1=new cpu();
obj1.display_1();
cpu.RAM obj=new cpu.RAM();
obj.display();
}
}
