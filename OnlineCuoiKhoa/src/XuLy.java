import java.util.ArrayList;
import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CongTy cty = new CongTy();
		cty.dumyData();		
		cty.dumyDataCty();
		cty.phanBoNhanVienThuong();
		cty.tinhLuong();
//		cty.themNhanSu(scan);
		cty.xuat();
//		cty.xoaNhanSu(scan);
//		cty.tinhLuong();
//		cty.xuat();
		ArrayList<NhanVienThuong> listNVTCaoNhat = cty.lietKeDSNVTLuongCaoNhat();
		System.out.println("Danh Sách nhân viên thường có lương cao nhất");
		if (listNVTCaoNhat != null) {
			for (NhanVienThuong nv : listNVTCaoNhat) {
				nv.xuat();
			}	
		} else {
			System.out.println("Không có nhân viên thường");
		}
		cty.sortName();
		cty.xuat();
		

	}

}
