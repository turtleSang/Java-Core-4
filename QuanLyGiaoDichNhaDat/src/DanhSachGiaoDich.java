import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class DanhSachGiaoDich {
	// 0.Constant
	final String NHATHUONG = "Thường";
	final String NHACAOCAP = "Cao Cấp";
	// 1.Attribute
	ArrayList<GiaoDichNhaDat> listGiaoDich;
	// 2.Get Set method

	public ArrayList<GiaoDichNhaDat> getListGiaoDich() {
		return listGiaoDich;
	}

	public void setListGiaoDich(ArrayList<GiaoDichNhaDat> listGiaoDich) {
		this.listGiaoDich = listGiaoDich;
	}

	// 3.Constructor
	public DanhSachGiaoDich() {
		this.listGiaoDich = new ArrayList<GiaoDichNhaDat>();
	}

	// 4.Input output method
	// 4.1 Input
	public void nhapList(Scanner scan) {
		boolean flag = true;
		do {
			System.out.println("Vui lòng lựa chọn nhập");
			System.out.println("1.Nhập giao dịch nhà");
			System.out.println("2.Nhập giao dịch đất");
			System.out.println("0.Thoát ra Menu");
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				GiaoDichNhaDat gdNha = new GiaoDichNha();
				gdNha.nhap(scan);
				this.listGiaoDich.add(gdNha);
				break;
			case 2:
				GiaoDichNhaDat gdDat = new GiaoDichDat();
				gdDat.nhap(scan);
				this.listGiaoDich.add(gdDat);
				break;
			case 0:
				flag = false;
				break;
			}

		} while (flag);
	}

	public void nhapDumy() {
		GiaoDichNhaDat gd = new GiaoDichDat(1, 9, 2013, "1", 50, 5000000, 'A');
		this.listGiaoDich.add(gd);
		gd = new GiaoDichDat(2, 9, 2013, "2", 75.5f, 6700000, 'B');
		this.listGiaoDich.add(gd);
		gd = new GiaoDichDat(2, 7, 2014, "3", 80.6f, 4500000, 'C');
		this.listGiaoDich.add(gd);

		gd = new GiaoDichNha(12, 1, 2018, "4", 45.5f, 9000000, NHACAOCAP, "123 A");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha(12, 9, 2013, "5", 45.5f, 9000000, NHATHUONG, "345 A");
		this.listGiaoDich.add(gd);
		gd = new GiaoDichNha(3, 9, 2013, "6", 45.5f, 9000000, NHACAOCAP, "369 A");
		this.listGiaoDich.add(gd);
	}

	// 4.2 Output
	public void xuatList() {
		for (GiaoDichNhaDat gd : listGiaoDich) {
			gd.xuat();
		}
	}

	// 5.Business method
	public void tinhTienList() {
		for (GiaoDichNhaDat gd : listGiaoDich) {
			gd.tinhTien();
		}
	}

	public String tinhTongTien() {
		float tongTien = 0;
		for (GiaoDichNhaDat gd : listGiaoDich) {
			tongTien += gd.getThanhTien();
		}
		String inTongTien = dinhDangTien(tongTien);
		return inTongTien;
	}

	public String dinhDangTien(Number soTien) {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
		return currencyVN.format(soTien);
	}

	public void tinhTongGiaoDichTheoLoai(Scanner scan) {
		boolean flag = true;
		do {
			int countGiaoDich = 0;
			System.out.println("Vui lòng lựa chọn tính tổng số lượng");
			System.out.println("1.Tính tổng giao dịch nhà");
			System.out.println("2.Tính tổng giao dịch đất");
			System.out.println("0.Thoát về menu");
			int nhap = Integer.parseInt(scan.nextLine());
			switch (nhap) {
			case 1:
				for (GiaoDichNhaDat gd : listGiaoDich) {
					if (gd instanceof GiaoDichNha) {
						countGiaoDich++;
					}
				}
				System.out.println("Tổng số lượng dịch nhà là: " + countGiaoDich);
				break;

			case 2:
				for (GiaoDichNhaDat gd : listGiaoDich) {
					if (gd instanceof GiaoDichDat) {
						countGiaoDich++;
					}
				}
				System.out.println("Tổng số lượng giao dịch nhà là: " + countGiaoDich);
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		} while (flag);
	}
	public void tinhTBTienGiaoDichDat() {
		float tongTienGiaoDichDat =0;
		float trungBinhThanhTienGiaoDich;
		int countGiaoDichDat = 0;
		for (GiaoDichNhaDat gd : listGiaoDich) {
			if (gd instanceof GiaoDichDat) {
				countGiaoDichDat++;
				tongTienGiaoDichDat+= gd.getThanhTien();
			}
		}
		trungBinhThanhTienGiaoDich = tongTienGiaoDichDat/countGiaoDichDat;
		System.out.println("Trung bình tiền giao dịch đất là: " + dinhDangTien(trungBinhThanhTienGiaoDich));
	}
	public void xuatGiaoDichThang92023() {
		System.out.println("Các giao dịch của tháng 09 năm 2013");
		for (GiaoDichNhaDat gd : listGiaoDich) {
			if (gd.getNamGiaoDich() == 2013 && gd.getThangGiaoDich() == 9 ) {
				gd.xuat();
			}
		}
	}
}
