package Day5_Homework;

import java.util.Scanner;

public class ThongTinCoSo {
    private String hovaten;
    private String namsinh;
    private String quequan;

    public ThongTinCoSo() {

    }
    public ThongTinCoSo(String hovaten, String namsinh, String quequan)
    {
        this.hovaten =hovaten;
        this.namsinh =namsinh;
        this.quequan =quequan;
    }

    public void Nhapthongtin(Scanner sc)
    {
        System.out.println("Nhập họ và tên : ");
        this.hovaten =sc.nextLine();
        System.out.println("Nhập năm sinh : ");
        this.namsinh =sc.nextLine();
        System.out.println("Nhập quê quán: ");
        this.quequan =sc.nextLine();
    }


    public void ThongTinNhanVien()
    {
        System.out.println("Họ tên : "+this.hovaten+" - Năm Sinh: "+this.namsinh+" - Quê Quán: "+this.quequan);
    }

}
