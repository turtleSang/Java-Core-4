import java.util.ArrayList;

public class CongTy {
	// 
	private final long LUONGCOBAN = 6000000;
	//1. Attribute
	private DanhSachNhanVien listNVCongTy;
	//2. Get set method
	public DanhSachNhanVien getListNVCongTy() {
		return listNVCongTy;
	}
	public void setListNVCongTy(DanhSachNhanVien listNVCongTy) {
		this.listNVCongTy = listNVCongTy;
	}
	//3. Constructor
	public CongTy() {
		thietLapDefault();
	}
	public void thietLapDefault() {
		this.listNVCongTy = new DanhSachNhanVien();
	}
	//4. Input output method
		//4.1 Input methods
		public void nhapListCongTy(NhanVien nv) {
			this.listNVCongTy.themNhanVien(nv);
		}
		public void nhapListNhanVienSample() {
			NhanVien nv = new NhanVien(1, "Hung", "03/06/2000", "3 Truong Son",1.5F, LUONGCOBAN);
			this.listNVCongTy.themNhanVien(nv);
			nv = new NhanVien(2, "Lan", "03/01/2003", "3 CMT8",1.9F, LUONGCOBAN);
			this.listNVCongTy.themNhanVien(nv);
			nv = new NhanVien(3, "Minh", "03/09/2000", "3 Lao Cai",1.2F, LUONGCOBAN);
			this.listNVCongTy.themNhanVien(nv);
			nv = new NhanVien(4, "Vien", "03/09/2006", "3 Lao Cai",1.9F, LUONGCOBAN);
			this.listNVCongTy.themNhanVien(nv);
		}
		//4.2 Output methods
		public void xuatLine() {
			System.out.println("======================================================================================================================");
		}
		public String formatCell(String paddLeft, String text, String paddRight) {
			return String.format(paddLeft, " ")+ text + String.format(paddRight, " ");
		}
		public void xuatFormatHeader() {
			String padd1 = "%1s";
			String padd2 = "%2s";
			String padd3 = "%3s";
			String padd4 = "%4s";
			String padd6 = "%6s";
			xuatLine();
			String text = "||" + formatCell(padd3, "STT", padd3) + "|";
			text += formatCell(padd3, "Mã NV", padd3) + "|";
			text += formatCell(padd6, "Tên", padd6) + "|";
			text += formatCell(padd3, "Ngày sinh", padd3) + "|";
			text+= formatCell(padd4, "Địa chỉ", padd4) +"|";
			text += formatCell(padd3, "Hệ Số", padd3)+"|";
			text += formatCell(padd1, "Lương cơ bản", padd2)+"|";
			text += formatCell(padd2, "Lương tháng", padd2)+"||";
			System.out.println(text);
			xuatLine();			
			
		}
		public void xuatCellThuTu(int i) {
			String paddLeft = "%3s";
			String paddRight = "%-5s";
			String text ="||"+ String.format(paddLeft, " ") + i + String.format(paddRight, " ") +"|";
			System.out.print(text);
		}
		public void xuatTheoForMat() {
			xuatFormatHeader();
			for (int i = 0; i < this.listNVCongTy.getListNV().size() ; i++) {
				xuatCellThuTu(i+1);
				this.listNVCongTy.getListNV().get(i).xuatDongNhanVien();
			}
			//Xuất tổng lương
			xuatLine();
			String text = String.format("%50s", "Tong Luong");
			String text2 = String.format("%48s", "|");
			int tongLuong = (int) tinhTongLuongNhanVien();
			
			String text3 = String.format("%15s", tongLuong);
			System.out.println("||" + text + text2 + text3 + "||");
			xuatLine();
		}
	//5. Business method
		public void tinhLuongNhanVien() {
			this.listNVCongTy.tinhLuongListNV();
		}
		public ArrayList<NhanVien> timListCongtyCoLuongCaoNhat(){
			return this.listNVCongTy.timNhanVienCoLuongCaoNhat();
		}
		public double tinhTongLuongNhanVien() {
			return this.listNVCongTy.tinhTongLuongNhanVien();
		}
		public void xuatListNhanVienLuongCao(ArrayList<NhanVien> list) {
			xuatFormatHeader();
			for (int i = 0; i < list.size(); i++) {
				xuatCellThuTu(i+1);
				list.get(i).xuatDongNhanVien();
			}
			xuatLine();
		}
	

}
