import java.util.ArrayList;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		//adding elements to list
		a1.add("Sharath");
		a1.add("lavan");
		a1.add("Somu");
		a1.add("a");
		a1.add("b");
		a1.add("c");
		a1.add("d");
		a1.add("e");
		a1.add("f");
		a1.add("g");
		a1.add("h");
		a1.add("i");
		System.out.println(a1);
		// adding element to the particular index
				a1.add(2, "Venkat");

				// printing the elements
				for (Object name : a1) {
					System.out.println(name);
				}
					
				ArrayList<String> a2 = new ArrayList<String>();
					a2.add("element1");
					a2.add("element2");
					a2.addAll(0,a1);
					System.out.println(a2);
					
					//removing elements from collection using element name and index
					
					a1.remove(1);
					a1.remove("lavan");
					System.out.println("After removing data:"+a1);
					
					//removing a1 data from a2
					
					a2.removeAll(a1);
					System.out.println("After removing v1 from v2:"+a2);
					
					//updating data
					a1.set(4, "Eswar");
					System.out.println("After updating: "+a1);
					
					//retrieving data
					System.out.println(a1.get(4));
	}

}
