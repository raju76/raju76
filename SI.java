class Abc
{
void read()
{
System.out.println("from super class");
}
}
class xyz extends Abc
{
void display()
{
System.out.println("from sub class");
}
}
class Single
{
public static void main(String args[])
{
xyz x=new xyz();
x.display();
x.read();
}
}

