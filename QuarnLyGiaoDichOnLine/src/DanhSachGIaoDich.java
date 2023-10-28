import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Quản lý danh sách các giao dịch
 * Người tạo: Thanh Sang
 * Version: 1.0
 * */
public class DanhSachGIaoDich {
	final int MOT_TY = 1000;
	
	// 1.Attribute
	private ArrayList<GiaoDich> listGiaoDich;
	private int tongSLGiaoDichVang;
	private int tongSLGiaoDichTienTe;
	private float trungBinhTTGiaoDichTienTe;

	// 2.Get Set method
	public float getTrungBinhGiaoDichTienTe() {
		return this.trungBinhTTGiaoDichTienTe;
	}
	public ArrayList<GiaoDich> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	public int getTongSLGiaoDichVang() {
		return tongSLGiaoDichVang;
	}

	public void setTongSLGiaoDichVang(int tongSLGiaoDichVang) {
		this.tongSLGiaoDichVang = tongSLGiaoDichVang;
	}

	public int getTongSLGiaoDichTienTe() {
		return tongSLGiaoDichTienTe;
	}

	public void setTongSLGiaoDichTienTe(int tongSLGiaoDichTienTe) {
		this.tongSLGiaoDichTienTe = tongSLGiaoDichTienTe;
	}

	// 3.Constructor
	public DanhSachGIaoDich() {
		this.listGiaoDich = new ArrayList<GiaoDich>();
	}

	public DanhSachGIaoDich(ArrayList<GiaoDich> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 4.Input output method
	public void nhap(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("Vui lòng chọn nhập");
			System.out.println("1. Nhập giao dịch vàng");
			System.out.println("2. Nhập giao dịch tiền tệ");
			System.out.println("0. Thoát về Menu");
			int nhap = Integer.parseInt(scan.nextLine());
			GiaoDich gd;
			switch (nhap) {
			case 1:
				gd = new GiaoDichVang();
				gd.nhap(scan);
				this.listGiaoDich.add(gd);
				break;
			case 2:
				gd = new GiaoDichTienTe();
				gd.nhap(scan);
				this.listGiaoDich.add(gd);
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng nhập 0, 1, 2");
				break;
			}
		} while (flag);
	}
	public void nhapDumy() {
		GiaoDich gd;
		gd = new GiaoDichVang(1, 1, 1, 2022, 1000, 10, "9999");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichVang(2, 5, 6, 2022, 1200, 15, "SJC");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichTienTe(3, 4, 5, 2022, 1100, 30, 23, 2);
		this.listGiaoDich.add(gd);
		gd = new GiaoDichTienTe(4, 6, 8, 2022, 900, 5, 12, 1);
		this.listGiaoDich.add(gd);
	}

	public void xuat() {
		for (GiaoDich giaoDich : this.listGiaoDich) {
			giaoDich.xuat();
		}
	}
	// 5.Business method
	public void tinhThanhTien() {
		for (GiaoDich gd : listGiaoDich) {
			gd.tinhTien();
		}
	}
	public void tinhTongSLGDVang() {
		this.tongSLGiaoDichVang = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichVang) {
				this.tongSLGiaoDichVang+= gd.getSoLuong();
			}
		}
	}
	public void tinhTongSLGDTienTe() {
		this.tongSLGiaoDichTienTe = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				this.tongSLGiaoDichTienTe+= gd.getSoLuong();
			}
		}
	}
	public void tinhTBThanhTienTT() {
		float thanhTien = 0;
		for (GiaoDich gd : this.listGiaoDich) {
			if (gd instanceof GiaoDichTienTe) {
				thanhTien  += gd.thanhTien;
			}
		}
		this.trungBinhTTGiaoDichTienTe = thanhTien/this.tongSLGiaoDichTienTe;
	}
	public void xuatGiaoDichTheoTieuChi() {
		System.out.println("Các giao dịch lớn hơn " + MOT_TY );
		for (GiaoDich gd : listGiaoDich) {
			if (gd.getDonGia() > MOT_TY) {
				gd.xuat();
			}
		}
	}
}
