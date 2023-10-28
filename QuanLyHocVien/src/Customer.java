import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ cho Customer
 * người tạo: Thanh Sang
 * ngày tạo: 03/02/2023
 * */
public class Customer extends Person {
	//1.Attribute
	private String tenCongTy;
	private float triGiaHoaDon;
	private String danhGia;
	//2.Get set method
	
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public float getTriGiaHoaDon() {
		return triGiaHoaDon;
	}

	public void setTriGiaHoaDon(float triGiaHoaDon) {
		this.triGiaHoaDon = triGiaHoaDon;
	}

	public String getDanhGia() {
		return danhGia;
	}

	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}

	//3. Constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String hoTen, String diaChi, String ma, String email,
			String tenCty, float triGia, String danhGia) {
		super(hoTen, diaChi, ma, email);
		this.tenCongTy = tenCty;
		this.triGiaHoaDon = triGia;
		this.danhGia = danhGia;
	}
	//4.Input output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập tên công ty");
		this.tenCongTy = scan.nextLine();
		System.out.println("Nhập giá trị hóa đơn");
		this.triGiaHoaDon = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập Đánh giá");
		this.danhGia = scan.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("\t Tên công ty: " + this.tenCongTy + 
				"\t Giá trị hóa đơn: " + this.triGiaHoaDon +
				"\t Đánh giá: " +this.danhGia);
	
	}
	//5.Business
	

}
