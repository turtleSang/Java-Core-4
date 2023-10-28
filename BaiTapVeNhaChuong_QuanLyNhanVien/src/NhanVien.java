import java.util.Scanner;

public class NhanVien {
	// 1.Attribute
	private int maNV;
	private String tenNV;
	private String ngaySinh;
	private String diaChi;
	private float heSoLuong;
	private long luongCoBan;
	private float luongThang;
	// 2.Get Set methods
	
	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public long getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(long luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public float getLuongThang() {
		return luongThang;
	}

	// 3.Constructor methods
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int ma, String ten, String ngaySinh, String diaChi, float heSo, long luongCoBan) {
		this.maNV = ma;
		this.tenNV = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.heSoLuong = heSo;
		this.luongCoBan = luongCoBan;
	}
	// 4.Input Output methods
		//4.1 Input methods
		public void nhapNV(Scanner scan) {
		System.out.println("Vui lòng nhập Mã nhân viên");
		this.maNV = Integer.parseInt(scan.nextLine());
		System.out.println("Vui lòng nhập tên Nhân viên");
		this.tenNV = scan.nextLine();
		System.out.println("Vui lòng nhập ngày sinh của nhân viên");
		this.ngaySinh = scan.nextLine();
		System.out.println("Vui lòng nhập địa chỉ nhân viên");
		this.diaChi = scan.nextLine();
		System.out.println("Vui lòng nhập hệ số lương");
		this.heSoLuong = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập lương cơ bản");
		this.luongCoBan = Long.parseLong(scan.nextLine());
	}

	// 4.2 Output methods
	private String formatNumCell(Number num) {
		String paddLeft = "%5s";
		String paddRight = "%-6s";
		return String.format(paddLeft, " ") + String.format(paddRight, num);
	}
	private String formatTextCell(String text) {
		
		String paddright = "%-15s";
 		return String.format(paddright, text);
	}
	private String formatSoTien(Number num) {
		String paddLeft = "%15s";
		return String.format(paddLeft, num);
	}
	public void xuatDongNhanVien() {
		String text;
		text = formatNumCell(this.maNV) +"|";
		text += formatTextCell(this.tenNV) + "|";
		text += formatTextCell(this.ngaySinh) + "|";
		text += formatTextCell(this.diaChi) + "|";
		text += formatNumCell(this.heSoLuong)+"|";
		text += formatSoTien(this.luongCoBan) + "|";
		int luong =(int) this.luongThang;
		text += formatSoTien(luong) + "||";
		System.out.println(text);
	}
	// 5.Business methods
	// 5.1 Tính lương nhân viên
	public void tinhLuongNhanVien() {
		this.luongThang = this.heSoLuong * this.luongCoBan;
	}
}
