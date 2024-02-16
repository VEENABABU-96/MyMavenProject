package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraygenInte {
	public void genericInt()
	{
		ArrayList<Integer> a1 =new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
	    System.out.println(a1);
	
		a1.remove(3);
	    System.out.println(a1);
	
		int c=a1.size();
		System.out.println("Collection size is "  + c);
		
		ArrayList<Integer> b1=new ArrayList();
		b1.addAll(a1);
		System.out.println("value of b1 "+ b1);
		
		a1.removeAll(a1);
		System.out.println(a1);
		
		boolean d = b1.contains(10);
		System.out.println("" +d);
		
		System.out.println(b1.get(2));
		}
	
	public void genericList()
	{
		List<String> s1 = new ArrayList();
		s1.add("Hello");
		s1.add("Welcome");
		s1.add("To");
		s1.add("The");
		s1.add("Java");
		s1.add("World");
		s1.add("Veena");
		System.out.println(s1);
		
		s1.remove(4);
		System.out.println(s1);
		
		int c = s1.size();
		System.out.println("size of List is "+c);
		
		List<String> b1 = new ArrayList(); 
		b1.addAll(s1);
		System.out.println("Added another array "+b1);
		
		s1.removeAll(s1);
		System.out.println(s1);
		
		boolean check = b1.contains("Java");
		System.out.println(" " +check);
		System.out.println(b1.get(5));
	}

	
	

	public static void main(String[] args) {
		ArraygenInte objArraygenInte = new ArraygenInte();
		objArraygenInte.genericInt();
		objArraygenInte.genericList();
	}

}
