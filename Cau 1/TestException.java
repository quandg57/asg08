// Cau 1: Lam vi du bat ngoai le o lop co so 
import java.util.*;

class ExceptionA extends Exception{

}
class ExceptionB extends ExceptionA{

}
class ExceptionC extends ExceptionB{

}

public class TestException {
   public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
      try{
	     int n = scan.nextInt();
		 if(n==0) 
		    throw new ExceptionB();
		 else throw new ExceptionC();
	  }
	  catch(ExceptionA e){
	     e.getMessage();
	  }
   }
}