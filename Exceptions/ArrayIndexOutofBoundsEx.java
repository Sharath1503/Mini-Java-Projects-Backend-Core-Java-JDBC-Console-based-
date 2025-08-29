
public class ArrayIndexOutofBoundsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			int a[]= {1,2,3};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 e.printStackTrace();
			
		}
	}

}
