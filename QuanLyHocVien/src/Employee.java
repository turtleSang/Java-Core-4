import java.util.Scanner;

/*
 * Mục đích: Xử lý nghiệp vụ cho lớp employee
 * người tạo Thanh Sang
 * ngày tạo 03/02/2023
 * version: 1.0
 * */
public class Employee extends Person {
	//1.Attribute
	private float soNgayLamViec;
	private int luongTheoNgay;
	//2.Get set method
	
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getLuongTheoNgay() {
		return luongTheoNgay;
	}

	public void setLuongTheoNgay(int luongTheoNgay) {
		this.luongTheoNgay = luongTheoNgay;
	}

	//3.Constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String hoTen, String diaChi, String ma, String email,
			float soNgayLam, int luongTheoNgay) {
		super(hoTen, diaChi, ma, email);
		this.soNgayLamViec = soNgayLam;
		this.luongTheoNgay = luongTheoNgay;
	}	
	//4.Input output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Lương theo ngày: ");
		this.luongTheoNgay = Integer.parseInt(scan.nextLine());
		System.out.print("Số ngày làm việc");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
	}
	public void xuat() {
		super.xuat();
		System.out.println("\t Lương theo ngày: " + this.luongTheoNgay
				+ " \t Số ngày làm việc: " + this.soNgayLamViec);
		
	}
	//5.Business method
	
}
