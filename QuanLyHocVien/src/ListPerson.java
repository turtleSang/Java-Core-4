import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * Mục đích Quản lý nghiệp vụ cho danh sach
 * người tạo: Thanh Sang
 * ngày tạo: 26/04/2020
 * Version: 1.0
 * */
public class ListPerson {
	//1.Attribute
	private ArrayList<Person> list;
	//2.Get set method
	
	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}

	//3. Constructor
	public ListPerson() {
		list = new ArrayList<Person>();
	}
	//4. Input output method
	private void inMenu() {
		System.out.println("Vui lòng chọn");
		System.out.println("1. Nhập student");
		System.out.println("2. Nhập employee");
		System.out.println("3. Nhập customer");
		System.out.println("0. Thoát lại menu chính");
	}
	public void dumnyData() {
		Person item = new Student("Nhung", "123A", "1", "123@", 10, 9, 8);
		this.list.add(item);
		item = new Employee("Hung", "456B", "2", "ABC@", 24.5f, 600000);
		this.list.add(item);
		item = new Customer("Minh", "789C", "3", "xyz@", "TNHH", 20.6f, "Good");
		this.list.add(item);
	}
	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			inMenu();
			Person person;
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 0:
				flag = false;
				break;
			case 1:
				person = new Student();
				person.nhap(scan);
				list.add(person);
				break;
			case 2: 
				person = new Employee();
				person.nhap(scan);
				list.add(person);
				break;
			case 3:
				person = new Customer();
				person.nhap(scan);
				list.add(person);
				break;
			default:
				break;
			}
		} while (flag);
	}
	public void xuat() {
		for (Person item : list) {
			item.xuat();
		}
	}
	//5. Business method
	public void xoa(String ma) {
		for (int i = 0; i < this.list.size(); i++) {
			if (this.list.get(i).ma.equals(ma)) {
				this.list.remove(i);
				System.out.println("Đã xóa thành công");
			}
		}
	}
	private void interChangeShort(ArrayList<Person> _list) {
		int i,j;
		for (i = 0; i < _list.size() -1;i ++) {
			for ( j = i+1; j < _list.size(); j++) {
				Person personI = _list.get(i);
				Person personJ = _list.get(j);
				if (personJ.getHoTen().compareToIgnoreCase(personI.getHoTen())<0 ) {
					Collections.swap(_list, i, j);
				}
			}
		}
	}
	public void shortName() {
		interChangeShort(this.list);
	}
}
