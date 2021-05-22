package PackageA;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentA objA= new StudentA(1, "tester");
        System.out.println(objA.getId()+ objA.getName());
        Scanner objS= new Scanner(System.in);
        System.out.println("mời bạn nhâp");
        int a= 0;
        a= objS.nextInt();
        int tong = a + 2;
        System.out.println("kqua là"+ tong);
    }
}
