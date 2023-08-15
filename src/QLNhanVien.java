import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class QLNhanVien {
	static ArrayList<NhanVien> nv = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void xemNV() {
		System.out.println("Danh sach nhan vien: ");
		for (NhanVien nv1 : nv) {
		System.out.println(nv1.toString());
		}
	}
	
	public static  void themNV() {
		System.out.println("Nhap vao thong tin nhan vien muon them moi: ");
		System.out.print("ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Ho ten: ");
		String hoTen = sc.nextLine();
		System.out.print("So dien thoai: ");
		String soDT = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Gioi tinh: ");
		String gioiTinh = sc.nextLine();
		System.out.print("Nam sinh: ");
		int namSinh = sc.nextInt();
		sc.nextLine();
		System.out.print("Que quan: ");
		String queQuan = sc.nextLine();
		
		NhanVien nhanVienMoi = new NhanVien(id, hoTen, soDT, email, gioiTinh, namSinh, queQuan );
		nv.add(nhanVienMoi);
		
		System.out.println("Them moi nhan vien thanh cong!");
	}
	
	public static void xoaNV() {
		System.out.print("Nhap vao ma nhan vien: ");
		int id = sc.nextInt();
		
		NhanVien nhanVienXoa = null; 
		for(NhanVien nv1 : nv) {
			if(nv1.getId() == id ) {
				nhanVienXoa = nv1;
				break;
			}
		}
		
		if(nhanVienXoa !=null) {
			nv.remove(nhanVienXoa);
			System.out.println("Xoa nhan vien thanh cong!");
		}else System.out.println("Khong tim thay nhan vien co ma "+id);
	}
	
	public static void suaNV() {
		System.out.print("Nhap vao ma nhan vien: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		NhanVien nhanVienSua = null; 
		for(NhanVien nv1 : nv) {
			if(nv1.getId() == id ) {
				nhanVienSua = nv1;
				break;
			}
		}
		
		if(nhanVienSua !=null) {
			System.out.print("Ho ten: ");
			String hoTenMoi = sc.nextLine();
			System.out.print("So dien thoai: ");
			String soDTMoi = sc.nextLine();
			System.out.print("Email: ");
			String emailMoi = sc.nextLine();
			System.out.print("Gioi tinh: ");
			String gioiTinhMoi = sc.nextLine();
			System.out.print("Nam sinh: ");
			int namSinhMoi = sc.nextInt();
			sc.nextLine();
			System.out.print("Que quan: ");
			String queQuanMoi = sc.nextLine();
			sc.nextLine();
			nhanVienSua.setHoTen(hoTenMoi);
			nhanVienSua.setSoDT(soDTMoi);
			nhanVienSua.setEmail(emailMoi);
			nhanVienSua.setGioiTinh(gioiTinhMoi);
			nhanVienSua.setNamSinh(namSinhMoi);
			nhanVienSua.setQueQuan(queQuanMoi);
			
			System.out.println("Cap nhat nhan vien thanh cong!");
		}else System.out.println("Khong tim thay nhan vien co ma "+id);
	}
	
	public static void timNV() {
		System.out.print("Nhap vao ma nhan vien/email/sdt can tim kiem: ");
		String ma = sc.nextLine();
		
		boolean kt = false ; 
		for(NhanVien nv1 : nv) {
			if (String.valueOf(nv1.getId()).equals(ma) ||
				nv1.getEmail().equals(ma) ||
				nv1.getSoDT().equals(ma)) {
	            System.out.println("Ket qua tim kiem: ");
	            System.out.println(nv1.toString());
	            kt = true;
	            break;
			}	
		}
		
		if(!kt) {
			System.out.println("Khong tim thay ket qua phu hop!");
		}
	}
	
	public static void main(String[] args) {
  
	    int chon;
	    do {
	    	System.out.println("----------------------QL Nhan Vien------------------------------");
            System.out.println("1- Xem danh sach nhan vien");
            System.out.println("2- Them moi 1 nhan vien");
            System.out.println("3- Xoa 1 nhan vien truyen vao ma nhan vien");
            System.out.println("4- Chinh sua 1 nhan vien truyen vao ma nhan vien");
            System.out.println("5- Tim kiem nhan vien dua vao ma nhan vien/email/sdt");
            System.out.println("6- Thoat");
            System.out.print("\nNhap lua chon của ban: ");
            chon = sc.nextInt();
            sc.nextLine();
	    	
            switch (chon) {
            case 1:
            	xemNV();
                break;
            case 2:
                themNV();
                break;
            case 3:
                xoaNV();
                break;
            case 4:
                suaNV();
                break;
            case 5:
                timNV();
                break;
            case 6:
                System.out.println("Đã thoát khỏi chương trình.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
	    }while(chon !=6);
	    
	    luuFile();
	}
	
    private static void luuFile() {
        try {
        	Writer wr = null;
            wr = new FileWriter("product.txt");
            
            BufferedWriter bw = new BufferedWriter(wr);
            
            for (NhanVien nv1 : nv) {
                wr.write(nv1.toString() + "\n");
            }
            wr.close();
        } catch (IOException e) {
            System.out.println("Khong the ghi du lieu vao file.");
        }
    }	

}
