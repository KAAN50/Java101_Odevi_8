import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fz,tr,km,mz;
        double ort;
        double toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notu: ");
        mat = input.nextInt();
        if(mat<=100 || mat>=0)
        {
           toplam += mat;
        }

        System.out.println("Fizik notu: ");
        fz = input.nextInt();
        if (fz<=100 || fz>=0)
        {
            toplam += fz;
        }

        System.out.println("Türkçe notu: ");
        tr = input.nextInt();
        if (tr<=100 || tr>=0)
        {
            toplam += tr;
        }

        System.out.println("Kimya notu: ");
        km = input.nextInt();
        if (km<=100 || km>=0)
        {
            toplam += km;
        }

        System.out.println("Müzik notu: ");
        mz = input.nextInt();
        if (mz<=0 || mz>=100)
        {
            toplam += mz;
        }

        ort =toplam/5;

            if (ort >= 55) {
                System.out.println("Tebrikler Geçtiniz");
                System.out.println("Ortalamanız: " + ort);
            } else {
                System.out.println("Kaldınız");
                System.out.println("Ortalamanız: " + ort);
            }

        }




}