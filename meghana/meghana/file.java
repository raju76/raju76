import java.io.*;
class FIStream
{
public static void main(String args[])
{
try
{
int i=0;
FileInputStream f=new FileInputStream("abc.txt");
while((i=f.read())!=-1)
{
System.out.print((char)i);
}
f.close();
}
catch(IOException e)
{
System.out.print(e);
}
}
}

