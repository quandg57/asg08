// viet ham main
public class Main{
    public static void main(String[] args){
	    ExceptionB ex = new ExceptionB();
		int a=3;
		int b=0;
		try{
		    ex.result(a, b);
		}
		catch(ExceptionA e)
		{
		    System.out.println(e.getMessage());
		}
	}
}