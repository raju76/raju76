import java.util.*;
class Complex
{
double re,im;
Complex(double r,double i)
{
re=r;
im=i;
}
Complex(Complex c)
{
System.out.print("copy constructor called");
re=c.re;
im=c.im;
}
class Copy
{
public static void main(String args[])
{
Complex c1=new complex(10,15);
Complex c2=new complex(c1);
Complex c3=c2;
}
}
}
