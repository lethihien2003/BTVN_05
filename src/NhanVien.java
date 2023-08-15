import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVien {
	//Thuoc tinh
	private int id;
	private String hoTen;
	private String soDT;
	private String email;
	private String gioiTinh;
	private int namSinh;
	private String queQuan;
	
	//Constructor
	public NhanVien() {
		
	}

	public NhanVien(int id, String hoTen, String soDT, String email, String gioiTinh, int namSinh, String queQuan) {
		this.id = id;
		this.hoTen = hoTen;
		this.soDT = soDT;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	@Override 
	public String toString() {
		return "\n\tID: " +this.id+ "\n\tHo ten: " +this.hoTen+ "\n\tNam sinh: "+this.namSinh;
	}
	

	
}



