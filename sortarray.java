
public class sortarray {
	public static void main(String[] args)
	{
		int arr[]= {0,1,0,1,1,0,1};
		int countzero=0;
		int a;
		int b;
		//int size=arr.length;
		for(a=0;a<arr.length;a++)
		{
			if (arr[a]==0)
				countzero=countzero+1;
			
		}
		 for(b=0;b<arr.length;b++)
		 {
			if(b<countzero) 
			{
				System.out.println("0");
				
			}
			else
			{
				System.out.println("1");
			}
		 }
			
		
				
	}

}
