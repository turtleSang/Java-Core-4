import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachChuyenXe listChuyenXe = new DanhSachChuyenXe();
		listChuyenXe.dumyData();
		listChuyenXe.xuat();
		float doanhThu = listChuyenXe.tinhDTCXBinhThuan();
		System.out.println("Doanh thu Bình Thuận = " + doanhThu);
	}

}
