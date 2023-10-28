class GFG{
	protected void getData() {
		System.out.println("Inside CyberSoft");
	}
}
class GeeksforGeeks extends GFG{
	protected void getData() {
		System.out.println("InsideCyber");
	}
}


public class Test3 {
	public static void main(String[] args) {
		GFG ojb = new GeeksforGeeks();
		ojb.getData();

	}

}
