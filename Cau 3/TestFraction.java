// Test thu tu cac khoi catch 
import java.util.*;
public class TestFraction{
    public static void main(String[] args){
	     Scanner scanner = new Scanner(System.in);
         try{
			System.out.println("Numerator: ");
			int numer = scanner.nextInt();
			
			System.out.println("Demominator: ");
			int demo = scanner.nextInt() ;
			int resuft= numer/demo;
			System.out.printf(" \n Resuft : %d/ %d = %d", numer,demo,resuft);
			}
		
	    catch(InputMismatchException e){
            System.out.println("Invalid input !");
            throw e;
        }
		
        /* catch(IOException e){
            System.out.println("Some input/out error");
            
        }   */
		
        catch(Exception e){
            System.out.println("Some error");
        }
    }
}	