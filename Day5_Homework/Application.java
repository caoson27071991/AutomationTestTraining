package Day5_Homework;

import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        double sum = 0;
        NhanVien DsNhanVien[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên :");
        int n=sc.nextInt();sc.nextLine();
        DsNhanVien=new NhanVien[n];
        for(int i=0;i < n;i++)
        {
            System.out.println("Nhập thông tin nhân viên thứ  "+(i+1)+": ");
            DsNhanVien[i]=new NhanVien();
            DsNhanVien[i].Nhapthongtin(sc);
        }

        System.out.println("Danh sách toàn bộ nhân viên");
        for(int i=0;i < n;i++)
        {
            System.out.println("Nhân viên thứ "+(i+1));
                DsNhanVien[i].ThongTinNhanVien();
        }
        for (int i = 0; i < n; i++){
            sum += DsNhanVien[i].getLuongnhanvien();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Danh sách nhân viên có lương cao hơn mức lương trung bình (" +sum/n+") :");
        for (int i =0;i < n; i++){
            if (DsNhanVien[i].getLuongnhanvien()>(sum/n)){
                System.out.println("Nhân viên thứ "+(i+1));
               DsNhanVien[i].ThongTinNhanVien();
            }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tổng chi phí trả lương thưởng cho nhân viên :"+String.format("%1f",sum + sum * 10 /100));
        }
    }


