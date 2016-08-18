
public class Length {
	static String s;
	int storage(String s) {
	    return s.length() * 2;
	    	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Length a = new Length();
		System.out.println("a.s= "+a.s);
		Length b = new Length();
		a.s = "Hello, World!";
		System.out.println("a.s= "+a.s);
		System.out.println("b.s= "+b.s);
		System.out.println(a.storage(a.s));
		    
			

	}
}