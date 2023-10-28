import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	private int data = 5;
	public int getData() {
		return this.data;
	}
	public int getData(int value) {
		return (data+1);
	}
	public int getData(int...value) {
		return (data +2);
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<>();
		list1.add("Hero");
		list1.add("From");
		list1.add("Hero");
		list1.add("Zero To Hero");
		list1.add("CyberSoft");
		
		List<String> list2 = new LinkedList<>();
		list2.add("Hero");
		list1.removeAll(list2);
		for (String temp : list1) {
			System.out.printf(temp, " ");
			System.out.println();
		}

	}

}
