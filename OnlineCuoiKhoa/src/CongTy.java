import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * Mục dích: tạo ra lớp công ty quản lý các nghiệp vụ liên quan
 * */
public class CongTy {
	// 1.Attribute
	private String tenCongTy;
	private String maSoThue;
	private float doanhThuThang;
	private DanhSachNhanSu objList;

	// 2.Get set
	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public float getDoanhThuThang() {
		return doanhThuThang;
	}

	public void setDoanhThuThang(float doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}

	public DanhSachNhanSu getObjList() {
		return objList;
	}

	public void setObjList(DanhSachNhanSu objList) {
		this.objList = objList;
	}

	// 3.Constructor
	public CongTy() {
		this.objList = new DanhSachNhanSu();
	}

	// 4.Get Set method
	public void nhap(Scanner scan) {
		System.out.print("Nhập thông tin công ty: ");
		this.tenCongTy = scan.nextLine();
		System.out.print("Nhập mã số thuế: ");
		this.maSoThue = scan.nextLine();
		System.out.print("Nhập doanh thu tháng: ");
	}

	public void xuat() {
		System.out.println("****Thông tin công ty*****");
		System.out.println("Tên công ty: " + this.tenCongTy);
		System.out.println("Mã số thuế: " + this.maSoThue);
		System.out.println("Doanh thu tháng: " + this.doanhThuThang);
		System.out.println("**************************************");
		this.objList.xuat();
	}

	public void dumyDataCty() {
		this.tenCongTy = "TNHH";
		this.maSoThue = "123";
		this.doanhThuThang = 100000;
	}

	public void dumyData() {
		NhanSu ns;
		ns = new NhanVienThuong("1", "Nguyen", "0123", 24.5f);
		this.objList.them(ns);
		ns = new NhanVienThuong("2", "Thanh", "0345", 25f);
		this.objList.them(ns);
		ns = new NhanVienThuong("3", "Sang", "0891", 24);
		this.objList.them(ns);
		ns = new NhanVienThuong("4", "Đỗ", "0345", 25f);
		this.objList.them(ns);
		ns = new NhanVienThuong("5", "Hoài", "0123", 23.5f);
		this.objList.them(ns);
		ns = new NhanVienThuong("6", "Minh", "0345", 24);
		this.objList.them(ns);

		ns = new TruongPhong("7", "Tuan", "068", 25);
		this.objList.them(ns);
		ns = new TruongPhong("8", "Thai", "0752", 26);
		this.objList.them(ns);
		ns = new TruongPhong("9", "Ha", "0952", 23.5f);
		this.objList.them(ns);

		ns = new GiamDoc("10", "Hoang", "067", 25.5f, 20);
		this.objList.them(ns);
		ns = new GiamDoc("11", "Thanh", "081", 26, 19.6f);
		this.objList.them(ns);
	}

	// 5.Business method
	public void tinhLuong() {
		this.objList.tinhLuong();
	}

	// Thêm nhân sự
	/*
	 * Phân bổ nhân viên về trưởng phòng Bước 1: Duyệt danh sách và kiểm tra nếu là
	 * nhân viên thường Bước 2: Show ra danh sách trưởng phòng(Tên và mã) Bước 3: Có
	 * muốn phân bổ hay không chọn Y để phân bổ và N để đi tiếp Bước 4: Nếu N đi
	 * tiếp đến nhân viên tiếp theo Bước 5: Nếu Y yêu cầu nhập mã trưởng phòng
	 * đãliệt kê ở trên Bước 6: Kiểm tra mã nhập vào bước 5 có nằm trong danh sách
	 * mã trưởng phòng bước 2 hay không Bước 7: Nếu có lấy trưởng phòng với mã đã
	 * chọn bước 5 -> lấy ra obj trưởng phòng Bước 8: set trưởng phòng ở bước 7 ở
	 * nhân viên đang duyệt Bước 9: nếu không thì lặp lại bước 5 Bước 10: Tăng số
	 * lượng nhân viên dưới quền cho Trưởng phòng đó
	 */
	public void lietKeDanhSachTruongPhong() {
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				ns.xuatMaVaTen();
			}
		}
	}

	public TruongPhong timTruongPhongTheoMa(String ma) {
		TruongPhong tp = null;
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns instanceof TruongPhong) {
				if (ns.getMaSo().compareToIgnoreCase(ma) == 0) {
					tp = (TruongPhong) ns;
				}
			}
		}
		return tp;
	}

	public ArrayList<TruongPhong> layDanhSachTruongPhong() {
		ArrayList<TruongPhong> listTruongPhong = new ArrayList<TruongPhong>();
		for (NhanSu item : this.objList.getListNhanSu()) {
			if (item instanceof TruongPhong) {
				listTruongPhong.add((TruongPhong) item);
			}
		}
		return listTruongPhong;
	}

	public void phanBoNhanVienThuong() {
		Scanner scan = new Scanner(System.in);
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				System.out.println("Đang phân bổ cho nhân viên");
				ns.xuatMaVaTen();
				phanBoChoMotNhanSu(scan, ns);
			}
		}
	}

	private void ShowMaVaTenTruongPhong() {
		System.out.println("******Danh Sách trưởng phòng******");
		ArrayList<TruongPhong> list = layDanhSachTruongPhong();
		for (TruongPhong tp : list) {
			tp.xuatMaVaTen();
		}
		System.out.println("**********************************");
	}

	private TruongPhong chonTruongPhong(Scanner scan) {
		TruongPhong tp = null;
		do {
			// Bước 6: Kiểm tra mã có nằm trong danh sách hay không
			System.out.println("Vui lòng chọn mã trưởng phòng đã liệt kê");
			String chonMa = scan.nextLine();
			tp = timTruongPhongTheoMa(chonMa);
		} while (tp == null);
		return tp;
	}

	private void phanBoChoMotNhanSu(Scanner scan, NhanSu ns) {
		ShowMaVaTenTruongPhong();
		boolean flag = true;
		do {
			System.out.println("Chọn 1 để Phân bổ");
			System.out.println("Chọn 2 để đi tới nhân viên tiếp theo");
			int chon = Integer.parseInt(scan.nextLine());
			if (chon == 1 || chon == 2) {
				if (chon == 1) {// Bước 5:
					TruongPhong tp = chonTruongPhong(scan);
					((NhanVienThuong) ns).setTruongPhong(tp);
					tp.tangSoLuongNhanVien();
				}
				flag = false;
			} else {
				System.out.println("Chỉ được chọn 1 hoặc 2");
			}

		} while (flag);
	}

	// Thêm nhân sự
	public void themNhanSu(Scanner scan) {
		System.out.println("**********Thêm Nhân sự***********");
		ArrayList<NhanVienThuong> list = this.objList.nhap(scan);
		for (NhanVienThuong nv : list) {
			phanBoChoMotNhanSu(scan, nv);
		}
	}

	// Xóa nhân sự
	public boolean xoaNhanSu(Scanner scan) {
		boolean deleted = false;
		System.out.println("===========Xóa Nhân Sự==========");
		System.out.println("Vui lòng nhập mã nhân sự cần xóa");
		String ma = scan.nextLine();
		NhanSu nsXoa = timNhanSuTheoMa(ma);
		if (nsXoa != null) {
			// Trưởng phòng
			if (nsXoa instanceof TruongPhong) {
				deleted = xoaTruongPhong((TruongPhong) nsXoa);
			} else if (nsXoa instanceof NhanVienThuong) {
				deleted = xoaNhanVienThuong((NhanVienThuong)nsXoa);
			} else {
				this.objList.getListNhanSu().remove(nsXoa);
			}

		} else {
			System.out.println("Mã nhân sự vừa nhập không có trong danh sách");
		}

		return deleted;
	}

	public NhanSu timNhanSuTheoMa(String ma) {
		NhanSu nhanSu = null;
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns.getMaSo().equalsIgnoreCase(ma)) {
				nhanSu = ns;
				break;
			}
		}
		return nhanSu;
	}
	//Xóa Trưởng phòng
	public boolean xoaTruongPhong(TruongPhong tp) {
		boolean delected = false;
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				TruongPhong tPhongNVThuong = ((NhanVienThuong) ns).getTruongPhong();
				if (tPhongNVThuong != null) {
					if (tp.getMaSo().equalsIgnoreCase(tPhongNVThuong.getMaSo())) {
						((NhanVienThuong) ns).setTruongPhong(null);
						delected = true;
					}
				}
			}
		}
		this.objList.getListNhanSu().remove(tp);
		return delected;
	}
	public boolean xoaNhanVienThuong(NhanVienThuong nvt) {
		boolean delected = false;
		TruongPhong tp = nvt.getTruongPhong();
		if (tp != null) {
			tp.giamSoLuongNhanVien();
		}
		this.objList.getListNhanSu().remove(nvt);
		delected = true;
		return delected;
	}
	//Tìm nhân viên thường có lương cao nhất
	public ArrayList<NhanVienThuong> lietKeDSNVTLuongCaoNhat() {
		ArrayList<NhanVienThuong> listCaoNhat = new ArrayList<NhanVienThuong>();
		if (checkNVT()) {
			ArrayList<NhanVienThuong> list = listDSNVT();
			NhanVienThuong max = timNVTCoLuongCaoNhat(list);
			for (NhanVienThuong nvt : list) {
				if (nvt.getLuong()==max.getLuong()) {
					listCaoNhat.add(nvt);
				}
			}
		} else {
			return null;
		}
		
		return listCaoNhat;
	}
	private boolean checkNVT() {
		for (NhanSu item : this.objList.getListNhanSu()) {
			if (item instanceof NhanVienThuong) {
				return true;
			}
		}
		return false;
	}
	private ArrayList<NhanVienThuong> listDSNVT() {
		ArrayList<NhanVienThuong> listNVT = new ArrayList<NhanVienThuong>();		
		for (NhanSu ns : this.objList.getListNhanSu()) {
			if (ns instanceof NhanVienThuong) {
				listNVT.add((NhanVienThuong)ns);
			}
		}
		return listNVT;
	}
	private NhanVienThuong timNVTCoLuongCaoNhat(ArrayList<NhanVienThuong> list) {
		NhanVienThuong max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getLuong() > max.getLuong()) {
				max = list.get(i);
			}
		}
		return max;
	}
	//Sắp xếp nhân sự theo tên;
	private void sapXepTheoTen(ArrayList<NhanSu> list) {
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).getHoTen().compareToIgnoreCase(list.get(j).getHoTen())>0) {
					Collections.swap(list, i, j);
				}
			}
		}
	}
	public void sortName() {
		sapXepTheoTen(this.objList.getListNhanSu());
	}
	
}
