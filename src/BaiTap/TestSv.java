package BaiTap;

import java.util.ArrayList;

public class TestSv {
    public static void main(String[] args) {
      //  SinhVien sv=new SinhVien(1,"tester01",2,3,4,10);
        // System.out.println(sv.getId()+ sv.getName());
        SinhVien Test01= new SinhVien(1,"tester01",10,7,8,10);
        SinhVien Test02= new SinhVien(2,"tester02",10,0,8,8);
        SinhVien Test03= new SinhVien(3,"tester03",10,7,0,7);
        SinhVien Test04= new SinhVien(4,"tester01",10,7,9,6);
        SinhVien Test05= new SinhVien(9,"tester01",10,7,0,9);
        ArrayList<SinhVien> arrayStd= new ArrayList<>();
        arrayStd.add(Test01);
        arrayStd.add(Test02);
        arrayStd.add(Test03);
        arrayStd.add(Test04);
        arrayStd.add(Test05);
        for (SinhVien objA : arrayStd){
            System.out.println(objA.getId()+" "+ objA.getName()+" " +objA.getAge()+" " + objA.diemToan+ " "+ objA.diemVan+ " "+objA.getDiemAnh());
        }
        for (SinhVien objA: arrayStd)
        {
            float dtb;
            dtb= (objA.diemToan+ objA.diemVan+ objA.diemAnh)/3;
            System.out.println(objA.getId()+" "+ objA.getName()+" " +objA.getAge()+" " + objA.diemToan+ " "+ objA.diemVan+ " "+objA.getDiemAnh() +" "+dtb);
            //System.out.println(dtb);
            if (objA.getDiemToan() ==0 || objA.getDiemVan()==0||objA.getDiemAnh()==0)
            {
                System.out.println(objA.getId()+" "+ objA.getName()+" " +objA.getAge()+" " + objA.diemToan+ " "+ objA.diemVan+ " "+objA.getDiemAnh() +" "+dtb);
                System.out.println("SV sep loai yeu");
            }
            if (dtb>=5 && dtb<7) {
                System.out.println("SV xep lao tb");
                if (dtb>= 7 && dtb <9)
                {
                    System.out.println("SV xeeps loaij kha");

                }
                else System.out.println("sv xeep loai gio");
            }
        }


    }
    }

