package mypack;
public class test
{
public void display()
{
System.out.println("involing methods using package empt");
}
}
Import mypack test;
class demo
{
public static void main(String args[])
{
test p=new test();
p.display();
}
}
