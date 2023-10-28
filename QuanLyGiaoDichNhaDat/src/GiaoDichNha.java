import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {
	//0. Hằng số
	final String NHATHUONG = "Thường";
	final String NHACAOCAP = "Cao Cấp";
	//1.Attribute
	private String diaChi;
	private String loaiNha;	
	//2.Get set methods
	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	//3.Constructor
	public GiaoDichNha() {
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNha(int ngay, int thang, int nam, String ma, float dienTich, long donGia, 
			String loai, String diaChi) {
		super(ngay, thang, nam, ma, dienTich, donGia);
		this.loaiNha = loai;
		this.diaChi = diaChi;
	}
	//4. Input output methods
	//4.1 Input
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.print("Nhập địa chỉ: ");
		this.diaChi = scan.nextLine();
		int nhap;
		do {
			System.out.println("Vui lòng chọn loại nhà");
			System.out.println("1. Nhà Thường");
			System.out.println("2. Nhà Cao Cấp");
			nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				this.loaiNha = NHATHUONG;
				break;
			case 2:
				this.loaiNha = NHACAOCAP;
			default:
				break;
			}
		} while (nhap<1 || nhap >2);
	}
	//4.2 Output methods
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại nhà: " + this.loaiNha + "\t Địa chỉ: " +this.diaChi);
	}
	//5. Business Methods
	//Thành tiền
	@Override
	public void tinhTien() {
		if (this.loaiNha.equalsIgnoreCase(NHACAOCAP)) {
			this.thanhTien = this.dienTich*this.donGia;
		} else {
			this.thanhTien = this.dienTich*this.donGia*0.9f;
		}
	}
}
