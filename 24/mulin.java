import java.lang.*;
interface developer
{
void display();
}
interface manager
{
void show();
}
class employe
{
void display()
{
System.out.print("hai");
}
void show()
{
System.out.print("multiple inheritance");
}
}
class m1test
{
public static void main(String args[])
{
employe e=new employe();
e.display();
e.show();
}
}
