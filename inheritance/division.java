import java.util.Scanner;
class a
{
    float a,b,d,e,f,g,h;
	void input(int x,int y)
	{
	 a=x;
	 b=y;
	}
	void process()
	{
		d=a+b;
		e=a-b;
		f=a*b;
		g=a/b;
		h=a%b;
	}
     void show()
     {
     	System.out.print("The summation is="+d);
     	System.out.print("The subtraction is="+e);
     	System.out.print("The multiplication is="+f);
     	System.out.print("The division is ="+g);
     	System.out.print("The modulus is="+h);
     }
 }
 class maths 
 {
 	public static void main(String args[])
 	{
 		Scanner in=new Scanner(System.in);
 		System.out.println("Enetr the first nummber");
 		x=in.nextInt();
 		System.out.print("Enter the Second number");
 		y=in.nextInt();
 		a N=new a();
 		N.input(x,y);
 		N.process();
 		N.show();
 	}
 }
