import java.util.Scanner;

/*
 * Người tạo: Thanh Sang
 * ngày tạo: 16/01/2023
 * verion: 1 
 * */
public class HinhChuNhat {
	// Attribute
	private float chieuDai;
	private float chieuRong;
	private float chuVi;
	private float dienTich;

	// Method get set
	public float getChieuDai() {
		return this.chieuDai;
	}

	public void setChieuDai(float cDai) {
		this.chieuDai = cDai;
	}

	public float getChieuRong() {
		return this.chieuRong;
	}

	public void setChieuRong(float cRong) {
		this.chieuRong = cRong;
	}

	public float getChuVi() {
		return this.chuVi;
	}

	public float getDienThich() {
		return this.dienTich;
	}

	// Method initialization
	public HinhChuNhat() {
		
	}
	public  HinhChuNhat(float cDai, float cRong) {
		this.chieuDai = cDai;
		this.chieuRong = cRong;
	}
	// Method import and export
	public void nhap(Scanner scan) {
		System.out.println("Nhập Chiêu Dài");
		this.chieuDai = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập Chiêu Rộng");
		this.chieuRong = Float.parseFloat(scan.nextLine());
	}
	public void xuat() {
		System.out.println("Hình Chữ nhật(" + this.chieuDai + ";" + this.chieuRong +
				") - ChuVi: " + this.chuVi + " ; Diện thích: " + this.dienTich);
	}
	// Method business handling
	public void tinhChuVi() {
		this.chuVi = (this.chieuDai+this.chieuRong)*2;
	}
	public void tinhDienTich() {
		this.dienTich = this.chieuDai*this.chieuRong;
	}

}
