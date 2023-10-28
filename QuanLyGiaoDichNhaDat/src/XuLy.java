import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachGiaoDich list = new DanhSachGiaoDich();
		list.nhapDumy();
		list.tinhTienList();
		doMenu(list);
	}
	public static void inMenu() {
		System.out.println("Vui lòng lựa chọn");
		System.out.println("1.Xuất danh sách giao dịch");
		System.out.println("2.Nhập giao dịch");
		System.out.println("3.Tính tổng tiền tất cả giao dịch");
		System.out.println("4.Tính tổng số lượng theo loại");
		System.out.println("5.Tính trung bình tiền giao dịch đất");
		System.out.println("6.Xuất giao dịch tháng 09/2013");
		System.out.println("0. Thoát chương trình");
	}

	public static void doMenu(DanhSachGiaoDich list) {
		boolean flag = true;
		do {
			inMenu();
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				list.xuatList();
				break;
			case 2:
				list.nhapList(scan);
				list.tinhTienList();
				break;
			case 3:
				System.out.println("Tổng tiền tất cả giao dịch là" + list.tinhTongTien()); 
				break;
			case 4:
				list.tinhTongGiaoDichTheoLoai(scan);
				break;
			case 5:
				list.tinhTBTienGiaoDichDat();
				break;
			case 6:
				list.xuatGiaoDichThang92023();
				break;
			case 0:
				flag= false;
				break;
			default:
				break;
			}
		} while (flag);
	}
}
