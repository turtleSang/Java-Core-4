import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		doMenu();

	}
	private static void inMenu() {
		System.out.println("Chọn Thực hiện");
		System.out.println("1.Thêm người vào");
		System.out.println("2. Xuất danh sách");
		System.out.println("3. Xóa theo mã");
		System.out.println("4. Sắp xếp theo tên");
		System.out.println("0. Thoát chương trình");	
	}
	private static void doMenu() {
		boolean flag = true;
		ListPerson list = new ListPerson();
		list.dumnyData();
		do {
			inMenu();
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 0:	
				flag = false;
				break;
			case 1: 
				list.nhap(scan);
				break;
			case 2: 
				list.xuat();
				break;
			case 3: 
				System.out.print("Vui lòng nhập mã muốn xóa: ");
				String ma = scan.nextLine();
				list.xoa(ma);
				break;
			case 4: 
				list.shortName();
				list.xuat();
				break;
			default:
				break;
			}
			
		} while (flag);
	}
	
}
