package neeraj.string;

public class Capacity {
	public static void main(String[] args) {
		
		StringBuffer n = new StringBuffer("Neeraj");
		
		System.out.println("Length = " + n.length());
		System.out.println("Capacity = " + n.capacity());
		
		System.out.println(n.append("abcdefghijklmnopqrstuvwxyz"));
		System.out.println("Length = " + n.length());
		System.out.println("Capacity = " + n.capacity());
		
		System.out.println(n.append("efg"));
		System.out.println("Length = " + n.length());
		System.out.println("Capacity = " + n.capacity());
	}

}
