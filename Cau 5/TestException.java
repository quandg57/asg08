// cau 5, nem ngoai le
public class TestException{
    public void someMethod() throws Exception
	{
	     someMethod2();
	}
	public void someMethod2() throws Exception 
	{
	     throw new Exception();
	}
	public static void main(String [] args)
	{
	    TestException t = new TestException();
	    try{
			 
			 t.someMethod();
		   }
		catch(Exception e){
            e.printStackTrace();
        }
    }
}	
		 