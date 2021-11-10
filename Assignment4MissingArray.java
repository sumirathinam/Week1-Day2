package week1.day2;
import java.util.Arrays;

public class Assignment4MissingArray {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,6,7,8};
		int lenthArray=num.length;
		System.out.println("Ascending Order of the Numbers: ");
	for(int i=0;i<lenthArray;i++)
		{
			
			System.out.println( " " +num[i]);
			
		}
		
        for(int j=num[0];j<=lenthArray;j++)
        {
        	if(j!=num[j])
        	{
        		System.out.println("Missing Number : "+num[j]);
        		break;
        	}
        }
	}

}
