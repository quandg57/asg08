// Loi o contructor
public class Fraction{
    private int num,dem;
	public Fraction(int n, int d) throws Exception 
	{
	    if(d==0) throw new Exception();
		num = n;
		dem = d;
	}
}
	    