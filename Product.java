import java.util.Scanner;
public class Product {
String pcode, pname; int price;
Product(String pcode_get, String pname_get, int price_get) {
pcode = pcode_get; pname = pname_get; this.price = price_get;
}
void compare(Product p1,Product p2){
if (price <= p1.price && price <= p2.price)
System.out.println("Lowest product ID is : " + pcode);
if (p2.price <= price && p2.price <= price)
System.out.println("Lowest product ID is : " + p2.pcode);
if (p1.price <= p2.price && p1.price <= price)
System.out.println("Lowest product ID is : " + p1.pcode);
}}
class Product_details{
public static void main(String[] args) {
Product p_1 = new Product("A123", "TV", 2);
Product p_2 = new Product("B123", "RADIO", 21);
Product p_3 = new Product("C123", "DVD", 3);
p_1.compare(p_2,p_3);}
}
