import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Quản lý danh sách nhân sự
 * */
public class DanhSachNhanSu {
	// 1.Attribute
	ArrayList<NhanSu> listNhanSu;
	// 2.Get set
	
	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	// 3.Constructor
	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}
	// 4.Get Set method
	public  ArrayList<NhanVienThuong> nhap(Scanner scan) {
		boolean flag = true;
		ArrayList<NhanVienThuong> listNhanVienMoi = new ArrayList<NhanVienThuong>();
		NhanSu nv = null;
		do {
			inMenu();
			System.out.println("Mời chọn");
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 0:	
				flag = false;
				break;
			case 1:	
				nv = new NhanVienThuong();
				nv.nhap(scan);
				nv.tinhLuong();
				this.listNhanSu.add((NhanVienThuong)nv);
				break;
			case 2:	
				nv = new TruongPhong();
				nv.nhap(scan);
				nv.tinhLuong();				
				break;
			case 3:	
				nv = new GiamDoc();
				nv.nhap(scan);
				nv.tinhLuong();
				break;

			default: 
				System.out.println("Vui lòng nhập từ 0 - 3");
				break;
			}
		} while (flag);
		return listNhanVienMoi;
		
	}
	private void inMenu() {
		System.out.println("1.Nhập nhân viên thường");
		System.out.println("2.Nhập Trưởng phòng");
		System.out.println("3.Nhập Giám đốc");
		System.out.println("0.Thoát về menu Chính");
	}
	public void xuat() {
		for (NhanSu ns : this.listNhanSu) {
			ns.xuat();
		}
	}
	// 5.Business method
	public void tinhLuong() {
		for (NhanSu ns : listNhanSu) {
			ns.tinhLuong();
		}
	}
	public void them(NhanSu ns) {
		this.listNhanSu.add(ns);
	}

}
