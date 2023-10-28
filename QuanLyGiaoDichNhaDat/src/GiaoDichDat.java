import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
	//1.Attribute
	private char loaiDat;
	//2.GetSetMethod
	
	public char getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(char loaiDat) {
		this.loaiDat = loaiDat;
	}

	//3.Constructor
	public GiaoDichDat() {
		// TODO Auto-generated constructor stub
	}
	
	

	public GiaoDichDat(int ngay, int thang, int nam, String ma, float dienTich, 
			long donGia, char loaiDat) {
		super(ngay, thang, nam, ma, dienTich, donGia);
		this.loaiDat = loaiDat;
	}

	//4.Input output method
	//4.Input 
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		int nhap;
		do {
			System.out.println("Vui lòng chọn loại đất");
			System.out.println("1.Loại A");
			System.out.println("2.Loại B");
			System.out.println("3.Loại C");
			nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				this.loaiDat = 'A';
				break;
			case 2:
				this.loaiDat = 'B';
				break;
			case 3:
				this.loaiDat = 'C';
				break;
			default:
				break;
			}
		} while (nhap<1 || nhap > 3);
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Loại Đất: " + this.loaiDat);
	}
	//5.Business method
	@Override
	public void tinhTien() {
		switch (this.loaiDat) {
		case 'A':
			this.thanhTien = this.dienTich*this.donGia*1.5f;
			break;
		case 'B':
		case 'C':
			this.thanhTien = this.dienTich*this.donGia;
			break;
		default:
			System.out.println("Nhập sai loại đất");
			break;
		}
		
	}
}
