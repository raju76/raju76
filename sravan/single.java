import java.io.*;
class test
{
private int a=100;
void show()
{
System.out.println("value of a="+a);
}
}
class test1 extends test
{
private int b=200;
void display()
{
System.out.println("value of b="+b);
}
}
class demo
{
public static void main(String argv[])
{
test1 p=new test1();
p.show();
p.display();
}
}

