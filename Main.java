import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKM = 2.20, KM, ucret;
        //Değişkenleri ve kilometre başına fiyatı belirledik.
        System.out.println("Gidilen kilometreyi giriniz.");

        KM = input.nextDouble();
        //Gittiğimiz kilometreyi girdik.
        ucret = (perKM * KM) + 10.0;
        //Fiyat hesabı yaptık.
        ucret = (ucret <= 20) ? 20 : ucret;
        //fiyatı 20 ile karşılaştırdık ve fiyatı belirledik.
        System.out.println("Taksimetrede yazan fiyat = " + ucret);
    }
}