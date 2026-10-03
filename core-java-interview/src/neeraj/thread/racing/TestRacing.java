package neeraj.thread.racing;

public class TestRacing {

	public static void main(String[] args) {

		Racing t1 = new Racing("Neeraj");

		Racing t2 = new Racing("Mewada");

		t1.start();
		t2.start();
	}

	/*
	 * Sir,
	 * 
	 * jab multiple threads same shared data ko ek saath access ya modify karte hain
	 * aur result unke execution timing par depend karta hai, us situation ko race
	 * condition kehte hain.
	 */
}
