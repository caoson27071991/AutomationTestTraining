package day5_HW;

public class NhanVien {
	public String tenNhanVien;
	public double heSoLuong;
	public int luongCoBan =5000000;
	public double luong;
	
	public NhanVien() {
		super();
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public int getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public double getLuong() {
		return heSoLuong*luongCoBan*1.1 ;//Lương có thêm 10% thưởng trung bình tháng
	}
	
	public void getIfo() {
		System.out.println("Nhân viên: " + tenNhanVien + " Lương:" + String.format("%.1f",this.getLuong()));
	}
	
	
}
