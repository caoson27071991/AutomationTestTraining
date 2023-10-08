package Day5_Homework;

import java.util.Scanner;

public class NhanVien extends ThongTinCoSo {
    private double luongcoban;
    private int capbacnhanvien;
    private double luongnhanvien;

    public NhanVien() {

    }

    public NhanVien(String hovaten, String ngaysinh, String quequan, int capbacnhanvien, double luongcoban) {
        super(hovaten, ngaysinh, quequan);
        this.capbacnhanvien = capbacnhanvien;
        this.luongcoban = luongcoban;
    }

    public void Nhapthongtin(Scanner sc) {
        super.Nhapthongtin(sc);
        System.out.println("Nhập cấp bậc nhân viên : ");
        this.capbacnhanvien = sc.nextInt();
        System.out.println("Nhập lương cơ bản : ");
        this.luongcoban = sc.nextDouble();
        sc.nextLine();
    }

    double luongnhanvien() {
        if (this.capbacnhanvien == 1) {
            this.luongnhanvien = this.luongcoban * 1.2;
        } else if (this.capbacnhanvien == 2) {
            this.luongnhanvien = this.luongcoban * 1.4;
        } else if (this.capbacnhanvien == 3) {
            this.luongnhanvien = this.luongcoban * 1.6;
        } else if (this.capbacnhanvien == 4) {
            this.luongnhanvien = this.luongcoban * 1.8;
        }
        return this.luongnhanvien;
    }

    public double getLuongnhanvien() {
        return luongnhanvien();
    }

    public void ThongTinNhanVien() {
        super.ThongTinNhanVien();
        System.out.println("Nhân viên cấp  " + this.capbacnhanvien);
        System.out.println("Lương cơ bản : " + this.luongcoban);
        System.out.println("Lương chính thức :"+String.format("%1f",getLuongnhanvien()));
    }
}
