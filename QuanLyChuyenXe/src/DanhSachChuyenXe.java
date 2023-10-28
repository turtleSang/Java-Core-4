import java.util.ArrayList;
import java.util.Scanner;

/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến chuyến xe
 * Người tạo: Thanh Sang
 * Version: 1.0
 * */
public class DanhSachChuyenXe {
	//1.Attribute
	private ArrayList<ChuyenXe> listChuyenXe;
	private float tongDoanhThu;
	private float doanhThuNoi;
	private float doanhThuNgoai;
	//2.Get set method	
	public void setListChuyenXe(ArrayList<ChuyenXe> list) {
		this.listChuyenXe = list;
	}
	public ArrayList<ChuyenXe> getListChuyenXe() {
		return listChuyenXe;
	}
	public float getTongDoanhThu() {
		return this.tongDoanhThu;
	}
	public float getDoanhThuNoi() {
		return this.doanhThuNoi;
	}
	public float getDoanhThuNgoai() {
		return this.doanhThuNgoai;
	}
	//3.Constructor
	public DanhSachChuyenXe() {
		this.listChuyenXe = new ArrayList<ChuyenXe>();
	}
	//4.Input output method
	public void nhap(Scanner scan) {
		boolean flag = true;
		ChuyenXe chuyenXe;
		do {
			System.out.println("1.Nhập chuyến xe nội thành");
			System.out.println("2.Nhập chuyến xe ngoại thành");
			System.out.println("0.Thoát");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				chuyenXe = new ChuyenXeNoiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 2:
				chuyenXe = new ChuyenXeNgoaiThanh();
				chuyenXe.nhap(scan);
				this.listChuyenXe.add(chuyenXe);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
	public void xuat() {
		for (ChuyenXe chuyenXe : listChuyenXe) {
			chuyenXe.xuat();
		}
	}
	//5.Business method
	//5.1 Tong doanh thu
	public void tinhTongDoanhThu() {
		float tongDoanhThu = 0;
		for (ChuyenXe chuyenXe : listChuyenXe) {
			tongDoanhThu += chuyenXe.doanhThu;
		}
		this.tongDoanhThu = tongDoanhThu;
	}
	public void tinhDoanhThuNoi() {
		float doanhThuNoi = 0;
		for (ChuyenXe cx : listChuyenXe) {
			if (cx instanceof ChuyenXeNoiThanh) {// Kiểm tra chuyến xe từ lớp nào
				doanhThuNoi+= cx.getdoanhThu();
			}
		}
		this.doanhThuNoi = doanhThuNoi;
	}
	public void tinhDoanhThuNgoai() {
		float doanhThuNgoai = 0;
		for (ChuyenXe chuyenXe : listChuyenXe) {
			if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
				doanhThuNgoai += chuyenXe.getdoanhThu();
			}
		}
		this.doanhThuNgoai = doanhThuNgoai;
	}
	public void dumyData() {
		ChuyenXe chuyenXe;
		chuyenXe = new ChuyenXeNoiThanh("1", "Noi1", "02", 1200, "Số 12", 35);
		listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNoiThanh("2", "Noi2", "03", 1100, "Số 14", 5.6f);
		listChuyenXe.add(chuyenXe);
		
		chuyenXe = new ChuyenXeNgoaiThanh("3", "Ngoai1", "05", 2000, "Bình Thuận", 2);
		listChuyenXe.add(chuyenXe);		
		chuyenXe = new ChuyenXeNgoaiThanh("4", "Ngoai2", "07", 3000, "Nha Trang", 2);
		listChuyenXe.add(chuyenXe);
		chuyenXe = new ChuyenXeNgoaiThanh("5", "Ngoai3", "09", 1500, "Bình Thuận", 1.5f);
		listChuyenXe.add(chuyenXe);	
	}
	public float tinhDTCXBinhThuan() {
		float doanhThu = 0;
		for (ChuyenXe cx : listChuyenXe) {
			if (cx instanceof ChuyenXeNgoaiThanh) {
				ChuyenXeNgoaiThanh ngoai = ((ChuyenXeNgoaiThanh)cx);
				if (ngoai.getNoiDen().equalsIgnoreCase("Bình Thuận")) {
					doanhThu+= ngoai.getdoanhThu();
				}
			}
		}
		return doanhThu;
	}
}
