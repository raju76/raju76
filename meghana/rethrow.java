import java.lang.*;
class multiException
{
public static void main(String arg[])
{
try
{
rethrow("first");
}
catch(FE|SE|TE e)
{
System.out.print(e);
}
}
static void rethrow(String s)throws FE,SE,TE
{
try
{
if(s.equals("first") throw new FE("first");
else
if(s.equals("second") throw new SE("second");
else
if(s.equals("third") throw new TE("third");
}
catch (exception e)
{
throw e;
}
}
static class FE extends Exception
{
public FE(String msg)
{
super(msg);
}
}
static class SE extends Exception
{
public SE(String msg)
{
super(msg);
}
}
static class TE extends Exception
{
public TE (String msg)
{
super(msg);
}
}
}

