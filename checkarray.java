
public class checkarray {
	public static void main(String[] args) {
		int a[]= {6,9,5,7,8};
		int target=Integer.parseInt(args[0]);
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i] == target)
			{
			System.out.print("element found:"+i);
			break;
			}
		}
	}

}
