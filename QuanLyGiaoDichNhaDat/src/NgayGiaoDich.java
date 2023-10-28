import java.util.Scanner;

/*
 * Mục đích kiểm tra ngày tháng năm giao dịch nhập vào có hợp lệ không
 * Người tạo: Thanh Sang
 * Version: 1.0
 * */
public class NgayGiaoDich {
	//1. Attribute
	protected int ngayGiaoDich;
	protected int thangGiaoDich;
	protected int namGiaoDich;
	//2. Get set method
	public int getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(int ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public int getThangGiaoDich() {
		return thangGiaoDich;
	}

	public void setThangGiaoDich(int thangGiaoDich) {
		this.thangGiaoDich = thangGiaoDich;
	}

	public int getNamGiaoDich() {
		return namGiaoDich;
	}

	public void setNamGiaoDich(int namGiaoDich) {
		this.namGiaoDich = namGiaoDich;
	}
	//3.Constructor
	public NgayGiaoDich() {
		// TODO Auto-generated constructor stub
	}
	public NgayGiaoDich(int ngay, int thang, int nam) { 
		this.ngayGiaoDich = ngay;
		this.thangGiaoDich = thang;
		this.namGiaoDich = nam;
	}
	//4.input output methods
		//4.1 input
	public void nhapNamGiaoDich(Scanner scan) {
		System.out.print("Vui lòng nhập năm giao dịch: ");
		this.namGiaoDich = Integer.parseInt(scan.nextLine());
	}
	public void nhapThangGiaoDich(Scanner scan) {
		do {
			System.out.print("Vui lòng nhập tháng giao dịch (Từ 1 ->12): ");
			this.thangGiaoDich = Integer.parseInt(scan.nextLine());
		} while (this.thangGiaoDich<1 || this.thangGiaoDich>12);
	}
	public boolean checkNamNhuan(int nam) {
		if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
			return true;
		} else {
			return false;
		}		
	}
	public void nhapNgayGiaoDich(Scanner scan) {
		switch (this.thangGiaoDich) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			do {
				System.out.print("Vui lòng nhập ngày giao dịch (từ ngày 1 - 31): ");
				this.ngayGiaoDich = Integer.parseInt(scan.nextLine());
			} while (this.ngayGiaoDich<1 || this.ngayGiaoDich>31);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			do {
				System.out.print("Vui lòng nhập ngày giao dịch (từ ngày 1 - 30): ");
				this.ngayGiaoDich = Integer.parseInt(scan.nextLine());
			} while (this.ngayGiaoDich<1 || this.ngayGiaoDich>30);
			break;			

		case 2:
			if (checkNamNhuan(this.namGiaoDich)) {
				do {
					System.out.print("Vui lòng nhập ngày giao dịch (từ ngày 1 - 29): ");
					this.ngayGiaoDich = Integer.parseInt(scan.nextLine());
				} while (this.ngayGiaoDich<1 || this.ngayGiaoDich>29);
			}else {
				do {
					System.out.print("Vui lòng nhập ngày giao dịch (từ ngày 1 - 28): ");
					this.ngayGiaoDich = Integer.parseInt(scan.nextLine());
				} while (this.ngayGiaoDich<1 || this.ngayGiaoDich>28);
			}			
			break;
		}
	}
	//4.2 Xuất ngày giao dịch
	public String xuatTextNgayGiaoDich() {
		String text = this.ngayGiaoDich + "/" + this.thangGiaoDich + "/" + this.namGiaoDich;
		return text;
	}
	//5.Business method

}
