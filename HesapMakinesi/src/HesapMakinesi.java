import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);
        double n1,n2;
        int sec;
        System.out.println("1.Sayıyı Giriniz:");
        n1=girdi.nextDouble();
        System.out.println("2.Sayıyı Giriniz: ");
        n2=girdi.nextDouble();
        System.out.println("1-Toplama: \n2-Çıkarma:  \n3-Çarpma: \n4-Bölme: \nYapmak istediğiz işlemi seciniz: ");
        sec=girdi.nextInt();

        switch (sec) {
            case 1:
                System.out.println("Toplama İşleminin Sonucu: "+ (n1+n2));
                break;
            case 2:
                System.out.print("Çıkarma İşleminin Sonucu: "+ (n1-n2));
                break;
            case 3:
                System.out.print("Çarpma İşleminin Sonucu: "+ (n1*n2));
                break;
            case 4:
                System.out.print("Bölme İşleminin Sonucu: "+ (n1/n2));
                break;
            default:
                System.out.println("Yanlış Değer Girdiniz!!!");
                break;
        }

    }
}
