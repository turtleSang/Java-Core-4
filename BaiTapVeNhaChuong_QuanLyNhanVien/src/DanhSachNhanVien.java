import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	
	// 1.Attributes
	private ArrayList<NhanVien> listNV;

	// 2.Get Set methods
	public void setListNV(ArrayList<NhanVien> listNV) {
		this.listNV = listNV;
	}

	public ArrayList<NhanVien> getListNV() {
		return this.listNV;
	}

	// 3.ConStructors
	public DanhSachNhanVien() {
		thietlapDefault();
	}

	private void thietlapDefault() {
		this.listNV = new ArrayList<NhanVien>();
	}
	// 4.Input output methods
		//4.1 Input Method
		public void nhapNhanVien(Scanner scan) {
			for (NhanVien nv : listNV) {
				nv.nhapNV(scan);
			}
		}
		public void themNhanVien(NhanVien nv) {
			this.listNV.add(nv);
		}
		
		//4.2 OutPut list NhanVien
		public void xuatListNhanVien() {
			for (NhanVien nhanVien : listNV) {
				nhanVien.xuatDongNhanVien();
			}
		}
		
	// 5.Business methods
		public void tinhLuongListNV() {
			for (NhanVien nv : listNV) {
				nv.tinhLuongNhanVien();
			}
		}
		public double tinhTongLuongNhanVien() {
			double tongLuongNhanVien = 0;
			for (NhanVien nv : listNV) {
				tongLuongNhanVien+= nv.getLuongThang();
			}
			return tongLuongNhanVien;
		}
		public ArrayList<NhanVien> timNhanVienCoLuongCaoNhat(){
			ArrayList<NhanVien> listNhanVienLuongMax = new ArrayList<NhanVien>();
			if (this.listNV.size()>0) {
				NhanVien nhanVienMaxLuong = this.listNV.get(0);
				int indexMax = 0;
				for (int i = 0; i < this.listNV.size(); i++) {
					if (this.listNV.get(i).getLuongThang() > nhanVienMaxLuong.getLuongThang()) {
						nhanVienMaxLuong = this.listNV.get(i);
						indexMax = i;
					}
				}
				this.listNV.add(nhanVienMaxLuong);
				for (int i = indexMax+1; i < this.listNV.size(); i++) {
					if (this.listNV.get(i).getLuongThang() == nhanVienMaxLuong.getLuongThang()) {
						listNhanVienLuongMax.add(this.listNV.get(i));
					}
				}
				
			}else {
				System.out.println("Danh sach null");
			}
			return listNhanVienLuongMax;
		}
}
