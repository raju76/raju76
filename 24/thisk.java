import java.lang.*;
class employe
{
int id;
String name;
employe (int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println("id="+id);
System.out.println("name="+name);
}
public static void main(String args[])
{
employe e=new employe(101,"name");
e.display();
}
}