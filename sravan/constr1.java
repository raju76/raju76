import java.io.*;
class test
{
int a,b;
test()
{
a=100;
b=200;
}
test(int a1,int b1)
{
a=a1;
b=b1;
}
void show()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
}
class demo
{
public static void main(String argv[])
{
test p=new test();
test q=new test(15,30);
p.show();
q.show();
}
}
