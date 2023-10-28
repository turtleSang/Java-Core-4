import java.util.Scanner;

/*
 * Mục đích: Quản lý nghiệp vụ lớp cha về nhân sự
 * ....
 * */
public class NhanSu {
	//1.Attribute
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected double luong;
	//2.Get Set method
	public double getLuong() {
		return this.luong;
	}
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	//3.Constructor
	public NhanSu() {
		// TODO Auto-generated constructor stub
	}
	public NhanSu(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		
	}
	//4.Input output
	public void nhap(Scanner scan) {
		System.out.println("===============================Thêm nhân sự=============================");
		System.out.print("Vui lòng nhập mã số");
		this.maSo = scan.nextLine();
		System.out.print("Vui lòng nhập họ tên");
		this.hoTen = scan.nextLine();
		System.out.print("Vui lòng nhập số điện thoại");
		this.soDienThoai = scan.nextLine();
		System.out.print("Vui lòng nhập số ngày làm việc");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		System.out.println("================================Đã thêm thành công======================");
	}
	public void xuat() {
		System.out.print("Mã số: " + this.maSo);
		System.out.print("\t Họ tên: " + this.hoTen);
		System.out.print("\t Số điện thoại: " + this.soDienThoai);
		System.out.print("\t Số ngày làm việc: " + this.soNgayLamViec);
		
	}
	//5.Business
	public void tinhLuong() {
		this.luong = 0;
	}
	
	public void xuatMaVaTen() {
		System.out.print("Mã: " + this.maSo);
		System.out.println("\t Tên: " + this.hoTen);
	}
}
