import java.util.Scanner;
import java.util.Random;
public class java1030{
public static void main(String[] args){
	/*int year=Integer.parseInt(args[0]);
	
	if(year%4==0&&year%100!=0){
		System.out.println(year+"is leapyear");
		boolean isLeapYear=true;
	}
	else if(year%400==0){
		System.out.println(year+"is leapyeae");
		boolean isLeapYear=true;
	}*/
	/*int n=Integer.parseInt(args[0]);
	switch(n){
	case 7:
		System.out.println("sunday");
	break;
	default:
		System.out.println("cannot understand");
	}
	*/
	// int j,k;
	// int sum=0;
	// int n=1;
	// for(j=1;j<6;j++)
	// {
		// for(k=1;k<j;k++){
			// n=n*k;
		    
		// }
		
		// sum=sum+n;
	// }
	// System.out.println(sum);
// }
// 
Random random=new Random();
Scanner scanner=new Scanner(System.in);
int n=random.nextInt(100);
int times=5;
for(int i=1;i<=times;i++){
	int x=scanner.nextInt();
	if(x==n){
		System.out.println("number is true");
		return;
	}else if(x<n){
		System.out.println("<");
	}else{
		System.out.println(">");
	}
}
	System.out.print("over");


}
}




