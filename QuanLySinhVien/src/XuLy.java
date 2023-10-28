import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		DanhSachSinhVien list = new DanhSachSinhVien();
//		doMenu(list);
		TruongHoc truong = new TruongHoc();
		truong.nhap();
		doMenu(truong);
	}
	private static void inMenu() {
		System.out.println("Vui lòng chọn thực hiện");
		System.out.println("1.Nhập Sinh viên");
		System.out.println("2.Xuất danh Sách sinh viên");
		System.out.println("3.Liệt kê danh Sách có điểm trung Bình cao nhất");
		System.out.println("4.Liệt kê danh sách sinh viên yếu: ");
		System.out.println("5.Tìm Sinh viên theo tên: ");
		System.out.println("6.Tìm sinh viên theo mã: ");
		System.out.println("7.Xóa sinh viên theo mã: ");
		System.out.println("0.Thoát");
	}
	private static void doMenu(TruongHoc truong) {
		boolean flag = true;
		do {
			inMenu();
			System.out.println("Mời chọn");
			int n = Integer.parseInt(scan.nextLine());
			switch (n) {
			case 1:
				SinhVien sv = new SinhVien();
				sv.nhap(scan);
				truong.themSV(sv);
				break;
			case 2:
				truong.tinhDTB();
				truong.xuatTheoFormat(truong.getDssvToanTruong().getListSV());;
				break;
			case 3:
				ArrayList<SinhVien> list = truong.timDanhSachSVCoDiemTBCaoNhat();
				truong.xuatTheoFormat(list);;
				break;
			case 4:
				ArrayList<SinhVien> listYeu = truong.timDanhSachSinhVienYeu();
				truong.xuatTheoFormat(listYeu);;
				break;
			case 5:
				System.out.println("Vui lòng nhập tên sinh viên cần tìm");
				String ten = scan.nextLine();
				truong.timSinhVienTheoTen(ten);
				ArrayList<SinhVien> listTen = new ArrayList<SinhVien>();
				listTen = truong.timSinhVienTheoTen(ten);
				truong.xuatTheoFormat(listTen);
				break;
			case 6:
				System.out.println("Vui lòng nhập mã sinh Viên");
				int ma = Integer.parseInt(scan.nextLine());
				SinhVien sinhVienid = truong.timSVTheoMa(ma);
				if (sinhVienid != null) {
					sinhVienid.xuatSinhVien();
				}else {
					System.out.println("Không có sinh viên có mã là: " + ma);
				}
				
				break;
			case 7:
				System.out.println("Vui lòng nhập mã sinh Viên muốn xóa");
				int maRemove = Integer.parseInt(scan.nextLine());
				SinhVien sinhVienRemove = truong.timSVTheoMa(maRemove);
				if (sinhVienRemove != null) {
					boolean remove = truong.xoaSVTheoMa(maRemove);
					if (remove) {
						System.out.println("Đã xóa thành công sinh viên");
						sinhVienRemove.xuatSinhVien();
					}
				}else {
					System.out.println("Không có sinh viên có mã là: " + maRemove);
				}
				break;
			case 0:
				flag = false;
				break;
			}
		} while (flag);
	}
}
