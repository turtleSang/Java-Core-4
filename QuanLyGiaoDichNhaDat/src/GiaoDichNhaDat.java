import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Mục đích quản lý giao dịch nhà đất
 * Người tạo: Thanh Sang
 * Version: 1.0
 * */
public class GiaoDichNhaDat extends NgayGiaoDich {
	//1. Attribute
	protected String maGiaoDich;
	protected float dienTich;
	protected long donGia;
	protected float thanhTien;
	
	//2. Get set method
	
	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public float getDienTich() {
		return dienTich;
	}

	public void setDienTich(float dienTich) {
		this.dienTich = dienTich;
	}

	public long getDonGia() {
		return donGia;
	}

	public void setDonGia(long donGia) {
		this.donGia = donGia;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	//3.Constructor
	public GiaoDichNhaDat() {
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNhaDat(int ngay, int thang, int nam, String ma, float dienTich, long donGia) {
		super(ngay, thang, nam);
		this.maGiaoDich = ma;
		this.dienTich = dienTich;
		this.donGia = donGia;
	}
	//4.Input output method
	//4.1 input Method
	public void nhap(Scanner scan) {
		System.out.print("Nhập mã giao dịch: ");
		this.maGiaoDich = scan.nextLine();
		super.nhapNamGiaoDich(scan);
		super.nhapThangGiaoDich(scan);
		super.nhapNgayGiaoDich(scan);
		System.out.print("Nhập diện tích: ");
		this.dienTich = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập đơn giá: ");
		this.donGia = Long.parseLong(scan.nextLine());
	}
	//4.2 Output
	public void xuat() {
		System.out.print("Mã giao dịch: " + this.maGiaoDich +
				"\t Ngày giao dịch: " + super.xuatTextNgayGiaoDich() +
				"\t Diện tích: " + this.dienTich + 
				"\t Đơn giá: " + dinhDangTien(this.donGia)+
				"\t Thành Tiền: " + dinhDangTien(this.thanhTien));
	}
	//5. Business method
	public String dinhDangTien(Number soTien) {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		return currencyVN.format(soTien);
	}
	public void tinhTien() {
		this.thanhTien = 0;
	}
}
