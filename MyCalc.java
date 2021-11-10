package week1.day2;

public class MyCalc {
	
	public void SumCalc(int a,int b,int c)	
	{

	int sum=a+b+c;
	System.out.println("Sum is : " +sum);
	}
	
	public void SubCalc(int x,int y)
	{
		int sub=x-y;
		System.out.println("Remainder is : " +sub);
	}
	
	public void MultiCalc(double r,double s)
	{
		double multi =r*s;
		System.out.println("Product is : " +multi);
			
	}
	
	public void DivCalc(float num1,float num2)
	{
		float div =num1/num2;
		
		System.out.println("Quotient is : " +div);
	}
	
	public static void main(String[] args) {
		
	
		MyCalc cal =new MyCalc();
		cal.SumCalc(25, 35, 45);		
		cal.SubCalc(350, 280);
		cal.MultiCalc(654, 987);
		cal.DivCalc(567, 60);
		// TODO Auto-generated method stub

	}

}
