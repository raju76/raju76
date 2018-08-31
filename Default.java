import java.util.*;
class test
{
int a,b;
test()
{
System.out.print("default constructor");
a=10;
b=20;
System.out.print("value of a="+a+"b="+b);
}
}
class Default
{
public static void main(String args[])
{
test t=new test();
}
}

