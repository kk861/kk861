public class HelloJava{
public static void main(String[] args){
	/*
	System.out.println(args[0]);
	System.out.println(args[1]);
	System.out.println(args[2]);
	System.out.println(args.length);
	
	String action ="ni hao";
	String target ="shi jie";
	String s=action+target;
	System.out.println(s);
	*/
	/*if(args.length<2){
		System.out.println("input double number");
		return;
	}
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	int result=x+y;
	System.out.printf("%d+%d=%d%n",x,y,result);
	//System.out.println(""+x+"+"+y+"result is"+result);
	System.out.println(x+"+"+y+"result is"+result);
	System.out.print(x+"+"+y+"result is"+result);
	*/
	int i;
	int sum=0;
	int j=args.length;
    
    
    for(i=0;i<j;i++);
	{
		sum=sum+args[i];
	}
	System.out.printf("%d",sum/j);
    
}
