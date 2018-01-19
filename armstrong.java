
public class armstrong {
public static void main(String[] args) {
	int c=0,a,temp;
	int n= Integer.parseInt(args[0]);
	temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if(temp==c)
		System.out.print("armstrong number");
	else
		System.out.print("not armstrong number");
	
	}
}

