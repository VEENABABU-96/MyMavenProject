package collection;

	import java.util.ArrayList;

	public class Arraynon {
		public void genericArray()
		{
			ArrayList<String> a1 = new ArrayList();
			a1.add("hello");
			a1.add("world");
			a1.add("java");
			a1.add("veena");
			a1.add("ckl");
			System.out.println(a1);
			
			a1.remove(2);
			System.out.println(a1);
			
			int size=a1.size();
			System.out.println("Size is "+size);
			
			ArrayList<String> b1=new ArrayList();
			b1.addAll(a1);
			System.out.println("Value of b1" +b1);
			
			a1.removeAll(a1);
			System.out.println(a1);
			
			boolean d=b1.contains("veena");
			System.out.println("Present or not " +d);
			System.out.println(b1.get(2));
			
			//List<String> l1=new ArrayList();
		}
		public void nonGenericArray()
		{
			ArrayList a2=new ArrayList();
			a2.add(1);
			a2.add(1.2);
			a2.add("veena");
			System.out.println(a2);
			
		}

		public static void main(String[] args) {
			Arraynon obj = new Arraynon();
			obj.genericArray();
			obj.nonGenericArray();
			
		}

}
