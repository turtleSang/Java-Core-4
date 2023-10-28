import java.util.Scanner;

/*
 * Mục đích: Quản lý chuyến xe nội thành
 * Người tạo:
 * Version:1.0
 * */
public class ChuyenXeNoiThanh extends ChuyenXe {
	//1.Attribute
	private String soTuyen;
	private float soKm;
	//2. get set methods
	
	public String getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}

	public float getSoKm() {
		return soKm;
	}

	public void setSoKm(float soKm) {
		this.soKm = soKm;
	}
	//3.Constructor
	public ChuyenXeNoiThanh() {
		super();
	}
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, 
			String soTuyen, float soKm) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	//4.Input Output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập số tuyến");
		this.soTuyen = scan.nextLine();
		System.out.println("Nhập số km");
		this.soKm = Float.parseFloat(scan.nextLine());
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Số tuyến: " + this.soTuyen + "\t Số km: " + this.soKm);
	}
	
	//5.Business method

}
