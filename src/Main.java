import java.util.Scanner;

public class Main {
    static void asalMi(int sayi, int i)
    {
        if (i == sayi)
        {
            System.out.print(sayi + " asal sayidir.");
            return;
        }
        else if (sayi % i == 0)
        {
            System.out.print(sayi + " asal sayi degildir.");
            return;
        }

        asalMi(sayi, i + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayiyi Giriniz : ");
        int sayi = scan.nextInt();

        asalMi(sayi,2);
    }
}
