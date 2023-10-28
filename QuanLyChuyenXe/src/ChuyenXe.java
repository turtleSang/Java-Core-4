import java.util.Scanner;

/*
 * Mục đích: lớp cha quản lý chuyến xe
 * Người tạo: Thanh Sang
 * Version: 1.0
 * */
public class ChuyenXe {
	//1. Attribute
//	+ String: maSoChuyen
//	+ String: hoTenTaiXe
//	+ String: soXe
//	+ Float: Doanh Thu
	protected String maSoChuyen;
	protected String hoTenTaiXe;
	protected String soXe;
	protected float doanhThu;
	//2. Get set Method
	
	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	public void setHoTenTaiXe(String hoTenTaiXe) {
		this.hoTenTaiXe = hoTenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public float getdoanhThu() {
		return doanhThu;
	}

	public void setdoanhThu(float doanhThu) {
		this.doanhThu = doanhThu;
	}

	//3. Constructor
	public ChuyenXe() {
		// TODO Auto-generated constructor stub
	}

	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu) {
		this.maSoChuyen = maSoChuyen;
		this.hoTenTaiXe = hoTenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	//4. Input output method
	public void nhap(Scanner scan) {
		System.out.println("Nhập mã số Chuyến");
		this.maSoChuyen= scan.nextLine();
		System.out.println("Nhập họ tên tài xế");
		this.hoTenTaiXe= scan.nextLine();
		System.out.println("Nhập số xe");
		this.soXe= scan.nextLine();
		System.out.println("Nhập doanh thu");
		this.doanhThu= Float.parseFloat(scan.nextLine());
		
	}
	public void xuat() {
		System.out.print("Mã số Chuyến: " + this.maSoChuyen +
				"\t Họ tên tài xế: " + this.hoTenTaiXe +
				"\t Số xe: " +this.soXe +
				"\t Doanh thu: " + this.doanhThu);
	}
	//5. Business method

}
