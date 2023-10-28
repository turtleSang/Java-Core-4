
import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		CongTy listNVCty = new CongTy();
		listNVCty.nhapListNhanVienSample();
		listNVCty.tinhLuongNhanVien();
		doMenu(listNVCty);
	}
	public static void inMenu() {
		System.out.println("Vui lòng chọn lựa chọn");
		System.out.println("1. Xuất Danh Sách");
		System.out.println("2. Thêm nhân viên");
		System.out.println("3. Tìm Danh sách nhân viên có lương cao nhất");
		System.out.println("0. Thoát");
		
	}
	public static void doMenu(CongTy list) {
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Vui lòng nhập lựa chọn cảu bạn");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				list.xuatTheoForMat();
				break;
			case 2:
				NhanVien nv = new NhanVien();
				nv.nhapNV(scan);
				list.getListNVCongTy().themNhanVien(nv);
				list.tinhLuongNhanVien();
				break;
			case 3:
				System.out.println("Danh Sách Nhân viên có lương cao nhất");
				ArrayList<NhanVien> listLuongCao = new ArrayList<NhanVien>();
				listLuongCao = list.timListCongtyCoLuongCaoNhat();
				list.xuatListNhanVienLuongCao(listLuongCao);
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
