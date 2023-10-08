package day5_HW;


public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NhanVien[] arrNVs= QuanLyNV.nhapDanhSachNhanVien();
		System.out.println("--------------------------------------------------------");
		System.out.println("Danh sách toàn bộ nhân viên:");
		for(int i =0 ; i <= arrNVs.length-1; i++) {
			arrNVs[i].getIfo();
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("Mức lương trung bình:" +String.format("%.1f",QuanLyNV.tinhLuongTrungBinh(arrNVs)));		
		NhanVien[] arrNVCoLuongCaoHonTB = QuanLyNV.nhanVienCoLuongCaoHonLuongTrungBinh(arrNVs);
		System.out.println("Danh sách nhân viên có lương cao hơn mức lương trung bình:");
		for(int i =0 ; i <= arrNVCoLuongCaoHonTB.length-1; i++) {
			arrNVCoLuongCaoHonTB[i].getIfo();
		}
		System.out.println("Tổng chi phí trả lương cho nhân viên: " + String.format("%.1f",QuanLyNV.tinhTongChiPhiLuong(arrNVs)));
	}
	

}
