package TyssSeleniumClass;

public class Apend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,0,0,1,2,0,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=0)
				{
					int temp= a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}

	}

}
