package datatype;

public class JavaTypeCastingAndPromotion
{

	public static void main(String[] args)
	{
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
		System.out.println("Value store in byte variable  c is: "+c);
		
		
		byte d;
		int e=120;
		d = (byte)e;
		System.out.println("Value store in byte variable  d is: "+d);
		
		
		byte x;
		int y=150;       
		x = (byte)y;
		System.out.println("Value store in byte variable  x is: "+x);
		
      /*  Range of byte = -128,127,126-----0------125,126,127.
        
          byte has a width of 8 bits = 2^8.
          
		  2^8 = 0 to 255.
		      = 256
		  after typecasting the value is = +150-256 = -106 ans
	  */
		
		
		byte m;
		int n=400;        //400-256=144;   144-256=-112;
		m = (byte)n;       
		System.out.println("Value store in byte variable  m is: "+m);
		
        
		byte p;
		int q=-150;      //-150+256=106;
		p = (byte)q;
		System.out.println("Value store in byte variable  p is: "+p);
		

	}
	

}
