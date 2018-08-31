import java.lang.*;
abstract class vechile
{
abstract void speed();
}
class Bike extends vechile
{
void speed()
{
System.out.print("speed limit is 40km/wt");
}
public static void main(String args[])
{
vechile a=new Bike();
a.speed();
}
}

