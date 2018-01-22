
public class prime {
		
		public static void main(String[] args) {
			int i,j,c;
					int n =Integer.parseInt(args[0]);
			for(i=2;i<n-1;i++) {
				c=0;
				for(j=2;j<i;j++) {
					if(i%j==0) {
						c=1;
						break;
					}
					}
					if(c==0)
						
				System.out.print(i+" ");
					
					}
				}
			}



