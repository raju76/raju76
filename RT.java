class MultiException
{
public static void main(String args[])
{
try
{
rethrow ("third");
}
catch(FE|SE|TE e)
{
System.out.println(e);
}
}
static void rethrow(String s)throws FE,SE,TE
{
try
{
if(s.equals("first"))throw new FE("first");
else
if(s.equals("second"))throw new SE("second");
else
throw new TE("third");
}
catch(Throwable e)
{
throw e;
}
}
static class FE extends Throwable
{
public FE(String msg)
{
super(msg);
}
}
static class SE extends Throwable
{
public SE(String msg)
{
super(msg);
}
}
static class TE extends Throwable
{
public TE(String msg)
{
super(msg);
}
}
}



