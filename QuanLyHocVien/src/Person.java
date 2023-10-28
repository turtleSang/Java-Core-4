import java.util.Scanner;

/*
 * Mục đích: Quản lý loại Student employee customer ở mức cha
 * Người tạo: Thanh Sang
 * ngày tạo: 02/02/2023
 * Version: 1.0
 * */
public class Person {
	//1. Attribute
	protected String hoTen;
	protected String diaChi;
	protected String ma;
	protected String email;
	//2. Get Set method
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//3. Constructor
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String hoTen, String diaChi, String ma, String email) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ma = ma;
		this.email = email;
	}	
	//4. Input Output method
	//4.1 Input method
	public void nhap(Scanner scan) {
		System.out.print("Vui lòng nhập tên");
		this.hoTen = scan.nextLine();
		System.out.print("Vui lòng nhập địa chỉ");
		this.diaChi = scan.nextLine();
		System.out.print("Vui lòng nhập mã");
		this.ma = scan.nextLine();
		System.out.print("Vui lòng nhập email");
		this.email = scan.nextLine();
	}
	public void xuat() {
		System.out.print("Họ tên: " + this.hoTen
							+ "\t Mã: " + this.ma
							+ "\t Địa chỉ: " + this.diaChi
							+ "\t Email: " + this.email);
	}
	//5. Business method

	
}
