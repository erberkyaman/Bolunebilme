import java.util.Scanner;
public class BolunebilmeKontrolu {
    public static void main(String[] args) {
        int number,sum=0,ave,count=0;


        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();
        for (int i=0;i<=number;i++) {
            if (i%3==0 && i %4==0) {
                sum += number;
                count++;
            }
        }
        System.out.println(sum);
        ave = sum / count;

        System.out.print("Girilen Sayı Aralığında 3'e ve 4'e Bölünebilenlerin Ortalaması: "+ave);

    }
}
