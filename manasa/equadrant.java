class test
{
public static void main(String args[])
{
int x=20,y=30;
if((x                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  >0)&&(y>0))
{
System.out.println("1st quadrant");
}
else
if((x<0)&&(y>0))
{
System.out.println("2nd quadrant");
}
else
if((x>0)&&(y<0))
{
System.out.println("3rd quadrant");
}
else 
if((x>0)&&(y<0))
{
System.out.println("4th quadrant");
}
else
if((x>0)&&(y==0))
{
System.out.println("+ve x-axis");
}
else
if((x==0)&&(y>0))
{
System.out.println("+ve y-axis");
}
else
if((x<0)&&(y==0))
{
System.out.println("-ve x-axis");
}
else
if((x==0)&&(y<0))
{
System.out.println("-ve y-axis");
}
else
{
System.out.println("origin");
}
}
}
