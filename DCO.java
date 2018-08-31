import java.util.*;
class test
{
int a,b;
Test()
System.out.print("Default constructor");
a=1;
b=2;
System.out.print("a="+a+"b="+b);
}
Test (int x,int y)
{
System.out.print("parameter constructor");
a=x;
b=y;
System.out.print("a="+a+"b="+b);
}
Test(int x)
{
System.out.print("single parameter");
a=x;
b=x;
System.out.print("a="+a+"b="+b);
}
Test(test t)
{
System.out.print("copy constructor");
a=t.a;
b=t.b;
System.out.print("a="+a+"b="+b);
}
}
class Demo
{
public static void main(String args[])
{
test t1=new test();
test t2=new test(10,20;);
test t3=new test(1000);
test t4=new test(t1);
}
}
