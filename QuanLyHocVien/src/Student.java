import java.util.Scanner;

public class Student extends Person {
	//1.Attribute
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	//2.Get set methods	
	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	//3.Constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(float diemToan, float diemLy, float diemHoa) {
		super();
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public Student(String hoTen, String diaChi, String ma, String email,
			float toan, float ly, float hoa) {
		super(hoTen, diaChi, ma, email);
		this.diemToan = toan;
		this.diemLy = ly;
		this.diemHoa = hoa;
	}
	//4.Input output method
	@Override
	public void nhap(Scanner scan) {
		super.nhap(scan);
		System.out.println("Nhập điểm toán");
		this.diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm Lý");
		this.diemLy = Float.parseFloat(scan.nextLine());
		System.out.println("Nhập điểm Hóa");
		this.diemHoa = Float.parseFloat(scan.nextLine());
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("\t Điểm tóan: " + this.diemToan+
				"\t Điểm lý: " + this.diemLy + "\t Điểm hóa: " +this.diemHoa);
	}
	//5.Business method
}
