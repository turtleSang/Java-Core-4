import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//Khởi tạo đối tượng
		//Cách 1
//		HinhChuNhat hcn = new HinhChuNhat();
//		hcn.nhap(scan);
//		hcn.tinhChuVi();
//		hcn.tinhDienTich();
//		hcn.xuat();
		//Cách 2
		System.out.println("Nhập chiều dài");
		float cDai = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập chiều rộng");
		float cRong = Float.parseFloat(scan.nextLine());
		HinhChuNhat hcn = new HinhChuNhat(cDai, cRong);
		hcn.tinhChuVi();
		hcn.getDienThich();
		hcn.xuat();
	}
	
}
