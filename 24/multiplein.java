import java.lang.*;
class student
{
int rno;
void getno(int r)
{
rno=r;
}
void putno()
{
System.out.print("rollno="+rno);
}
}
class test extends student
{
int m1,m2;
void getmarks(int a,int b)
{
m1=a;
m2=b;
}
void putmarks()
{
System.out.print("marksm1="+m1+"m2="+m2);
}
}
interface sports
{
int sw=6;
void puts();
}
class result extends test implements sports
{
int total;
void puts()
{
System.out.print("sports marks="+sw);
}
void display()
{
total=m1+m2+sw;
putno();
putmarks();
puts();
System.out.print("total scorce="+total);
}
}
class hybrid
{
public static void main(String args[])
{
result r=new result();
r.getno(101);
r.getmarks(70,90);
r.display();
}
}
