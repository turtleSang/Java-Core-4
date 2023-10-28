/*
 * Mục đích: QLNV cho lớp nhân viên thường
 * */
public class NhanVienThuong extends NhanSu {
	//Constant
	final int LUONGNGAY = 100;
	//1.Attribute
	private TruongPhong truongPhong;
	//2.Get Set method
	
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	//3.Constructor
	public NhanVienThuong() {
		this.truongPhong = null;//Chưa được phân bổ
	}

	public NhanVienThuong(String maSo, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maSo, hoTen, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
	}
	//4.Input output method

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		if (this.truongPhong != null) {
			System.out.println("\t Lương: " + this.luong +
					"\t Mã Trưởng phòng: " + this.truongPhong.getMaSo()
					+ "\t Tên Trưởng phòng: " + this.truongPhong.getHoTen());
		}else {
			System.out.println("\t Lương: " + this.luong +"\t Chưa phân bổ");
		}
	}
	
	//5.Business method
	@Override
	public void tinhLuong() {
		this.luong = LUONGNGAY*this.soNgayLamViec;
	}
	

}
