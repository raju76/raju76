class Student
{
int rno;
String name;
Student(int rno,String name)
{
this.rno=rno;
this.name=name;
}
void display()
{
System.out.println(rno+""+name);
}
public static void main(String args[])
{
Student s1=new Student(1,"sangeetha");
Student s2=new Student(2,"savargnitha");
s1.display();
s2.display();
}
}
