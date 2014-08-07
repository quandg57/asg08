public class ExceptionB extends ExceptionA{
    public ExceptionB(String sms)
	{
	    super(sms);
	}
	public ExceptionB()
	{
	    super(" Exception is from ExceptionB");
	}
	public void  result(int a, int b) throws ExceptionA
	{
	     if(b==0)
		    throw new ExceptionA(" Loi mau = 0");
	}
}