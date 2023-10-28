import java.util.Scanner;

/*
 * Quản lý nghiệp vụ liên quan đến sinh viên
 * Người tạo Thanh Sang
 * Ngày tạo: 16/01/2023
 * Version:1.0
 * */
public class SinhVien {
	// 1. Attribute
	private String tenSinhVien;
	private int maSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	private String xepLoai;
	// 2. Method get set

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	// 3. Method constructor method
	public SinhVien() {

	}

	public SinhVien(String tenSinhVien, int maSV, float diemToan, float diemLy, float diemHoa) {
		this.tenSinhVien = tenSinhVien;
		this.maSV = maSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	// 4. Method input output
	public void nhap(Scanner scan) {
		System.out.println("Nhập Tên Sinh viên");
		this.tenSinhVien = scan.nextLine();
		
		System.out.println("Nhập mã sinh viên");
		this.maSV =Integer.parseInt(scan.nextLine());
	
		System.out.println("Nhập điểm toán");
		this.diemToan = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập điểm lý");
		this.diemLy = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập điểm Hóa");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}
	public void xuatSinhVien() {
		System.out.println("Tên: " + this.tenSinhVien + "\t Mã Sinh Viên: " + this.maSV+
				"\t Điểm Toán: " + this.diemToan +"\t Điểm Lý " + this.diemLy+
				"\t Điểm Hóa: " + this.diemHoa+"\t Điểm Trung Bình: " + this.diemTB +
				"\t Xếp Loại: " + this.xepLoai);
	}
	// 5. Method business handling
	public void tinhDiemTrungBinh() {
		this.diemTB = (this.diemToan+this.diemLy+this.diemHoa)/3;
	}
	public void xepLoai() {
		if (this.diemTB>=9) {
			this.xepLoai = "Xuất sắc";
		} else  if (this.diemTB>=8) {
			this.xepLoai = "Giỏi";
		} else if (this.diemTB >= 7) {
			this.xepLoai = "Khá";
		}else if (this.diemTB >= 6) {
			this.xepLoai = "Trung Bình Khá";
		} else if (this.diemTB >= 5) {
			this.xepLoai = "Trung Bình";
		} else{
			this.xepLoai = "Yếu";
		}
	}
	private String formatNumCell(Number num) {
		String paddLeft ="%5s";
		String paddRight="%-8s";
		return String.format(paddLeft, " ") +String.format(paddRight, num) + "|";
	}
	private String formatTextCell(String text) {
		String paddLeft ="%-15s";
		return String.format(paddLeft," " + text);
	}
	public void xuatRowSinhVien () {
		String text;
		text = formatNumCell(this.maSV);
		text+= formatTextCell(this.tenSinhVien);
		text+= formatNumCell(this.diemToan);
		text+= formatNumCell(this.diemLy);
		text+= formatNumCell(this.diemHoa);
		double dtb = Math.round(this.diemTB*100.0)/100.0;
		text+= formatNumCell(dtb);
		text+= formatTextCell(this.xepLoai);
		System.out.println(text);
	}
}
