class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int max=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}

	

}
