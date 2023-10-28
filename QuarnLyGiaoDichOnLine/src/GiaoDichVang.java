import java.util.Scanner;

/*Mục đích: quản lý các giao dịch vàng
 * người tạo: Thanh Sang
 * ngày tạo: 30/01/2023
 * version:1.0
 * */
public class GiaoDichVang extends GiaoDich {
	//1.Attribute
	private String loaiVang;
	//2.Get set method
	
	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	//3.Constructor
	public GiaoDichVang() {
		// TODO Auto-generated constructor stub
	}
	
	
	public GiaoDichVang(int maGiaoDich, int ngay, int thang, int nam, float donGia, int soLuong,
			String loai) {
		super(maGiaoDich, ngay, thang, nam, donGia, soLuong);
		this.loaiVang = loai;
	}

	//4.Input output
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập loại vàng");
		this.loaiVang = scan.nextLine();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại Vàng" + this.loaiVang + "\t Thành Tiền: " + this.thanhTien);
	}
	//5.Business method
	@Override
	public void tinhTien() {
		this.thanhTien = this.soLuong*this.donGia;
	}

}
