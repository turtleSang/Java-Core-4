import java.util.ArrayList;
import java.util.Scanner;

/*Tạo ra để quản lý nhiều sinh viên
 * Người tạo : Thanh Sang
 * ngày tạo: 16/01/2023
 * Version 1.0
 * */
public class DanhSachSinhVien {
	// 1.Attribute
	private ArrayList<SinhVien> listSV;

	// 2.Get Set method

	/**
	 * @return the listSV
	 */
	public ArrayList<SinhVien> getListSV() {
		return listSV;
	}

	/**
	 * @param listSV the listSV to set
	 */
	public void setListSV(ArrayList<SinhVien> listSV) {
		this.listSV = listSV;
	}

	// 3. Constructor methods
	public DanhSachSinhVien() {
		thietLapDefault();
	}

	private void thietLapDefault() {
		this.listSV = new ArrayList<SinhVien>();
	}

	// 4. Input output methods
	public void nhap(Scanner scan) {
		for (SinhVien sv : this.listSV) {
			sv.nhap(scan);
		}
	}

	public void themSinhVien(SinhVien sv) {
		this.listSV.add(sv);
	}

	public void xuat() {
		for (SinhVien sv : listSV) {
			sv.xuatSinhVien();
		}
	}

	// 5. Business methods
	public void tinhDiemTb() {
		for (SinhVien sv : this.listSV) {
			sv.tinhDiemTrungBinh();
		}
	}

	public void xepLoai() {
		for (SinhVien sv : this.listSV) {
			sv.xepLoai();
		}
	}

	public ArrayList<SinhVien> timDssvDiemCaoNhat() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = this.listSV.get(0);
			for (SinhVien svCurent : listSV) {
				if (svCurent.getDiemTB() > svMax.getDiemTB()) {
					svMax = svCurent;
				}
			}
			for (SinhVien svCurent : listSV) {
				if (svCurent.getDiemTB() == svMax.getDiemTB()) {
					list.add(svCurent);
				}
			}
		}
		return list;
	}

	public ArrayList<SinhVien> timDssvDiemCaoNhatToiUu() {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			SinhVien svMax = listSV.get(0);
			int indexMax = 0;
			for (int i = 0; i < this.listSV.size(); i++) {
				if (this.listSV.get(i).getDiemTB() > svMax.getDiemTB()) {
					svMax = this.listSV.get(i);
					indexMax = i;
				}
			}
			listSV.add(svMax);
			for (int i = indexMax + 1; i < this.listSV.size(); i++) {
				if (this.listSV.get(i).getDiemTB() == svMax.getDiemTB()) {
					list.add(this.listSV.get(i));
				}
			}
		}
		return list;
	}

	public ArrayList<SinhVien> timDanhSachSVYeu() {
		ArrayList<SinhVien> listYeu = new ArrayList<SinhVien>();
		if (this.listSV.size() > 0) {
			for (SinhVien sinhVien : this.listSV) {
				if (sinhVien.getXepLoai() == "Yếu") {
					listYeu.add(sinhVien);
				}
			}
		}
		return listYeu;
	}

	public ArrayList<SinhVien> timTheoTen(String tenSV) {
		ArrayList<SinhVien> list = new ArrayList<SinhVien>();
		for (SinhVien sv : this.listSV) {
			if (sv.getTenSinhVien().equalsIgnoreCase(tenSV)) {
				list.add(sv);
			}
		}
		return list;
	}

	public SinhVien timSinhVienId(int ma) {
		SinhVien sv = null;// Chưa tìm thấy
		for (SinhVien sv1 : listSV) {
			if (sv1.getMaSV() == ma) {
				sv = sv1;
				break;
			}
		}
		return sv;
	}
	public boolean xoaSinhVienTheoMa(int ma) {
		boolean flag = false;
		for (SinhVien sv : listSV) {
			if (sv.getMaSV() == ma) {
				this.listSV.remove(sv);
				flag = true;
				break;
			}
		}
		return flag;
	}
}
