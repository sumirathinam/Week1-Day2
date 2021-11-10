package week1.day2;

public class UpperCaseIndexEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
String str="welcome";
char charArray[]=str.toCharArray();
for(int i=0;i<charArray.length;i++)
{
 if(i%2!=0)
 {
	 char uppercase = Character.toUpperCase(charArray[i]); 
	 System.out.print(uppercase);
	 
 
 System.out.print(" ");
 }
 else
 {
	 System.out.print(charArray[i] + " ");
 }

 }

	}

}
