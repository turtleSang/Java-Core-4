import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Vui lòng nhập tên sinh viên");
		String ten = scan.nextLine();
		System.out.println("Vui lòng nhập số diện thoại");
		String sdt = scan.nextLine();
		System.out.println("Vui lòng nhập điểm toán");
		float toan = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm lý");
		float ly = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập điểm hóa");
		float hoa = Float.parseFloat(scan.nextLine());

		
		SinhVien sv1 = new SinhVien(ten, sdt);
		sv1.setToan(toan);
		sv1.setDiemLy(ly);
		sv1.setDiemHoa(hoa);
		sv1.tinhDiemTB();
		
		System.out.println("Tên " + sv1.getHoTen() + " Số ĐT " + sv1.getSoDienThoai() );
		System.out.println("Điểm trung bình " + sv1.getDiemTB());
	}

}
