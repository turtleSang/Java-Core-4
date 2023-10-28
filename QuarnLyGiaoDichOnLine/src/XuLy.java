import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DanhSachGIaoDich list = new DanhSachGIaoDich();
		list.nhapDumy();
		list.tinhThanhTien();
		list.xuat();
		list.tinhTongSLGDVang();
		list.tinhTongSLGDTienTe();
		list.tinhTBThanhTienTT();
		System.out.println("SL GD VÀNG: " + list.getTongSLGiaoDichVang());
		System.out.println("SL GD TT: " + list.getTongSLGiaoDichTienTe());
		System.out.println("Xuất tb thành tiền: " + list.getTrungBinhGiaoDichTienTe());
		list.xuatGiaoDichTheoTieuChi();
	}
	public static void inMenu() {
		System.out.println("Chọn chức năng");
		System.out.println("1.Nhập giao dịch");
		System.out.println("2.Tính tổng SL cho từng loại");
		System.out.println("3.Tính trung bình thành tiền cho giao dịch ngoại tệ");
		System.out.println("4.Xuất giao dịch có đơn giá hơn 1 tỷ");
		System.out.println("5.Xuất");
		System.out.println("0.Thoát chương trình");
	}
	
	

}
