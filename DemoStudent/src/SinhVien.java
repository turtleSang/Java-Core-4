/*
 * Xử lý các nghiệp vụ liên quan đến sinh viên
 * Người tạo: ThanhSang
 * Ngày tạo: 20/04/2020
 * Version: 1.0
 * */
public class SinhVien {
	private String hoTen;	
	private String soDienThoai;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	
	
	
	//Get, set methods
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String ten) {
		this.hoTen = ten;
	}
	//Lấy dữ liệu private ra
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDt) {
		this.soDienThoai = soDt;
	}
	
	
	//Phương thức khởi tạo mặc định không tham số:
	public SinhVien() {
		
		
	}
	public SinhVien(String ten, String soDt) {
		this.hoTen = ten;
		this.soDienThoai =soDt;
	}
	//Lấy dữ liệu điểm Toán
	public float getDiemToan() {
		return this.diemToan;
	}
	//Xuất dữ liệu điểm Toán
	public void setToan(float toan) {
		this.diemToan = toan;
	}
	public float getDiemLy() {
		return this.diemLy;
	}
	public void setDiemLy(float ly) {
		this.diemLy = ly;
	}
	public float getDiemHoa() {
		return this.diemHoa;
	}
	public void setDiemHoa(float hoa) {
		this.diemHoa = hoa;
	}
	
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan+this.diemLy+this.diemHoa)/3;
	}
	public float getDiemTB() {
		return this.diemTB;
	}
}
