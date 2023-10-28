import java.util.Scanner;

/*
 * Mục đích: Quản lý chuyến xe ngoại thành
 * Người tạo: Thanh Sang 
 * Verison: 1.0
 * */
public class ChuyenXeNgoaiThanh extends ChuyenXe {
	//1.Attribute
	private String noiDen;
	private float soNgayDiDuoc;
	//2.Get set method
	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public float getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(float soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	//3.Constructor
	public ChuyenXeNgoaiThanh() {
		super();
	}

	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, float doanhThu, 
			String noiDen, float ngayDiDuoc) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = ngayDiDuoc;
	}
	
	//4.Input output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Vui lòng nhập số ngày đi dược");
		this.soNgayDiDuoc = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập nơi đến");
		this.noiDen = scan.nextLine();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Nơi đến: "+this.noiDen + "\t Số ngày đi được: " + this.soNgayDiDuoc);
	}
	//5.Business method
	

}
