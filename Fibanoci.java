import java.util.Scanner;
public class Fibanoci {
	public static void main(String[] args) {
		System.out.println("enter the count :");//for input of count
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt(); 
		int n1=0,n2=1,n3; //first and second values
		System.out.print(n1+" "+n2); //to print 1st and 2nd values
		for(int i=2;i<=count;i++) //no of times to repeat the loop
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		scan.close();
		
	}

}
