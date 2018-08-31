class Test
{
double area (double r)
{
return(3.14*r*r);
}
double area(double b,double h)
{
return(0.5*b*h);
}
}
class demo
{
public static void main(String argv[])
{
Test p=new Test();
double r=10.0,b=15.0,ht=20.0;
System.out.println("area of circle="+p.area(r));
System.out.println("area of triangle="+p.area(b,ht));
}
}

