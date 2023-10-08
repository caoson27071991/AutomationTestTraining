package day5_HW;

import java.util.Scanner;

public  class QuanLyNV {
	public static Scanner scanner = new Scanner(System.in);
	
	static NhanVien[] nhapDanhSachNhanVien() {

		int n;
		System.out.print("Nhập số lượng nhân viên:");
		n = scanner.nextInt();
		scanner.nextLine();
		NhanVien[] arrNV;
		
		arrNV = new NhanVien[n];		
		
		for (int i = 0; i<= n-1 ; i++) {
			arrNV[i]= new NhanVien();
			
			System.out.println("Nhập tên nhân viên:");
			String tenNhanVien = scanner.nextLine();
			arrNV[i].setTenNhanVien(tenNhanVien);

			System.out.println("Nhập hệ số lương nhân viên:");
			double heSoLuong;
			heSoLuong = scanner.nextDouble();
			scanner.nextLine();
			arrNV[i].setHeSoLuong(heSoLuong);
		
		}
		return arrNV;
	}
	
	public static  double tinhLuongTrungBinh(NhanVien[] danhSachNV) {
		double tongLuong =0;
		for (int i = 0; i<=danhSachNV.length-1 ; i++) {
			tongLuong = tongLuong + danhSachNV[i].getLuong();
		}
		return tongLuong/danhSachNV.length;
	}
	
	public static double tinhTongChiPhiLuong(NhanVien[] danhSachNV) {
		double tongLuong =0;
		for (int i = 0; i<=danhSachNV.length-1 ; i++) {
			tongLuong = tongLuong + danhSachNV[i].getLuong();
		}
		return tongLuong;
	}
	
	public static NhanVien[] nhanVienCoLuongCaoHonLuongTrungBinh(NhanVien[] danhSachNV) {
		double luongTB = tinhLuongTrungBinh(danhSachNV);
		int count =0;
		for (int i = 0; i<=danhSachNV.length-1 ; i++) {
			if (danhSachNV[i].getLuong() > luongTB) {
				count = count+1;			//Đếm số lượng nhân viên có lương cao hơn lương trung bình
			}
		}
		NhanVien[] arrNVs = new NhanVien[count];
		int j =0;
		for (int i = 0; i<=danhSachNV.length-1 ; i++) {	
			if (danhSachNV[i].getLuong() > luongTB) {
				arrNVs[j] = danhSachNV[i];	//Lấy những nhân viên có lương cao hơn lương trung bình để trả ra
				j = j+1;
			}
		}
		return arrNVs;
	}
	
}
