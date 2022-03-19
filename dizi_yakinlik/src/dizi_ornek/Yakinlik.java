package dizi_ornek;
import java.util.Scanner;
import java.util.Arrays;

    public class  Yakinlik{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sayi, Mindeger = 0, MaxDeger = 0, temp = 0;
            System.out.println("Sayı giriniz : ");
            sayi = scanner.nextInt();

            int[] numbers = {2, 134, 4, 6, 34, 5678, 12, 56, 0, -12, -56, -355, 678};


            System.out.println("Girilen Dizi : " + Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println("\nSıralanmış Dizi : " + Arrays.toString(numbers));

            System.out.println("\nGirilen Sayı : "+ sayi);

            for (int numInArr : numbers) {

                if (numInArr < sayi) {
                    Mindeger = numInArr;

                }
                if (numInArr > sayi) {
                    MaxDeger = numInArr;
                    break;
                }

            }

            System.out.println("Girilen sayıdan küçük en yakın sayı : " + Mindeger);
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + MaxDeger);


        }
    }



