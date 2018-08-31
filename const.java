 import java.io.*;
class test
 {
int n1,n2;
void assign(int x,int y)
{
n1=x;
n2=y;
}
int sum()
{
return (n1+n2);
}
}
class demo
{
public static void main(String argv[])
{
test p=new test();
p.assign(15,30);
System.out.println("sum="+p.sum());
}
} 
