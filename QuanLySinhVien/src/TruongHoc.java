import java.util.ArrayList;

/*
 * Quản lý toàn bộ nghiệp vụ cho Trường Học
 * ngày tạo: 18/01/2023
 * Version 1.0
 * */
public class TruongHoc {
	// 1.Attribute
	private DanhSachSinhVien dssvToanTruong;

	// 2.Method get set
	public DanhSachSinhVien getDssvToanTruong() {
		return dssvToanTruong;
	}

	public void setDssvToanTruong(DanhSachSinhVien dssvToanTruong) {
		this.dssvToanTruong = dssvToanTruong;
	}

	// 3.Constructor
	public TruongHoc() {
		this.dssvToanTruong = new DanhSachSinhVien();
	}
	// 4.Input output method
	public void nhap() {
		SinhVien sv = new SinhVien("Lan", 9, 10f, 10f, 9f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Hùng", 2, 4.2f, 4, 5.3f);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Lan", 3, 7.2f, 4f, 9);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Yến", 4, 3.2f, 4, 4);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Toàn", 5, 9.2f, 9, 10);
		this.dssvToanTruong.themSinhVien(sv);
		
		sv = new SinhVien("Hữu", 6, 7, 7, 6);
		this.dssvToanTruong.themSinhVien(sv);
		
	}
	public void xuat() {
		this.dssvToanTruong.xuat();
	}
	// 5.Business handling method
	public void themSV(SinhVien sv) {
		this.dssvToanTruong.themSinhVien(sv);
	}
	public void tinhDTB() {
		this.dssvToanTruong.tinhDiemTb();
		this.dssvToanTruong.xepLoai();
	}
	public ArrayList<SinhVien> timDanhSachSVCoDiemTBCaoNhat() {
		return this.dssvToanTruong.timDssvDiemCaoNhatToiUu();
	}
	public ArrayList<SinhVien>timDanhSachSinhVienYeu() {
		return this.dssvToanTruong.timDanhSachSVYeu();
	}
	public void xuatHelper(ArrayList<SinhVien> list) {
		for (SinhVien sinhVien : list) {
			sinhVien.xuatSinhVien();
		}
	}
	public ArrayList<SinhVien> timSinhVienTheoTen(String tenSV) {
		return this.dssvToanTruong.timTheoTen(tenSV);
	}
	public SinhVien timSVTheoMa(int ma) {
		return dssvToanTruong.timSinhVienId(ma);
	}
	public boolean	xoaSVTheoMa(int ma) {
		return dssvToanTruong.xoaSinhVienTheoMa(ma);
	}
	private void xuatLine() {
		System.out.println("============================================================================");
	}
	private String formatCell(String paddLeft, String title, String paddRight) {
		return String.format(paddLeft, " ") + title + String.format(paddRight, " ");
	}
	private void xuatRoundHeader() {
		String paddString1 = "%3s";
		String paddString2 = "%4s";
		String paddString3 = "%5s";
		String paddString4 = "%6s";
		xuatLine();
		String text;
		text = "||" + formatCell(paddString1, "STT",paddString1);
		text += formatCell(paddString2, "MaSV", text);
		text += formatCell(paddString2, "Ten", paddString2);
		text += formatCell(paddString3,"Toan", paddString2);
		text += formatCell(paddString3,"Ly", paddString4);
		text += formatCell(paddString3,"Hoa", paddString3);
		text += formatCell(paddString3,"DiemTB", paddString3);
		text += formatCell(paddString3,"XepLoai", paddString3) + "||";
		System.out.println(text);
		xuatLine();		
	}
	private void xuatCellThuTu(int i) {
		String paddLeft ="%3s";
		String paddRight="%-6s";
		String text = "||" + String.format(paddLeft, " ") + String.format(paddRight, ""+i)+"||";
		System.out.print(text);
	}
	public void xuatTheoFormat(ArrayList<SinhVien> list){
		xuatRoundHeader();
		int i = 1;
		for (SinhVien sv : list) {
			xuatCellThuTu(i);
			sv.xuatRowSinhVien();
		}
	}
}
