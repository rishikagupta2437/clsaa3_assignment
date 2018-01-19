
public class reverse {
	public static void main(String[] args) {
		int a,b=0,c;
		
		int n=Integer.parseInt(args[0]);
		c=n;
		while(n>0) {
			a=n%10;
			b=(b*10)+a;
			n=n/10;
			
		}
			System.out.println("reverse number is"+b);
			

}
}