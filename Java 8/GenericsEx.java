
class Arith<T> {
	T a;

	void Store(T a) {
		this.a = a;
	}

	T get() {
		return a;
	}

	public class GenericsEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Arith<Integer> obj = new Arith<Integer>();
			obj.Store(20);
			Arith<String> obj1 = new Arith<String>();
			obj1.Store("Sharath");
			System.out.println(obj.get());
			System.out.println(obj1.get());

		}

	}
}
