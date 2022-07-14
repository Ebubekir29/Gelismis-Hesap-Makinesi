import java.util.Scanner;

public class Main {
    static int toplama(int sayi1,int sayi2)
    {
        Scanner scan = new Scanner(System.in);
        int sonuc=0;
        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayi : ");
        sayi2 = scan.nextInt();
        sonuc = sayi1+sayi2;
        return sonuc;
    }
    static int cikarma(int sayi1,int sayi2)
    {
        Scanner scan = new Scanner(System.in);
        int sonuc=0;
        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayi : ");
        sayi2 = scan.nextInt();
        sonuc = sayi1-sayi2;
        return sonuc;
    }
    static int carpma(int sayi1,int sayi2)
    {
        Scanner scan = new Scanner(System.in);
        int sonuc=0;
        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayi : ");
        sayi2 = scan.nextInt();
        sonuc = sayi1*sayi2;
        return sonuc;
    }
    static int bolme(int sayi1,int sayi2)
    {
        if(sayi2==0)
        {
            System.out.println("Bolen 0 olamaz.");
            return 0;
        }
        Scanner scan = new Scanner(System.in);
        int sonuc=0;
        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        System.out.print("2.Sayi : ");
        sayi2 = scan.nextInt();
        sonuc = sayi1/sayi2;
        return sonuc;
    }
    static int usluSayi(int sayi1,int us)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        System.out.print("Us : ");
        us = scan.nextInt();
        int sonuc = 1;
        for(int i =0;i<us;i++)
        {
            sonuc *=sayi1;
        }
        return sonuc;
    }
    static int faktoriyel(int sayi1)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayi : ");
        sayi1 = scan.nextInt();
        int faktoriyel =1;
        for(int i =0;i<sayi1;i++)
        {
            faktoriyel=sayi1*i;
        }
        return faktoriyel;
    }
    static int mod(int a,int b){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        int toplam=a%b;
        return toplam;
    }


    static int dikdort(int a, int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenar :");
        a= inp.nextInt();
        System.out.print("Kisa kenar :");
        b=inp.nextInt();
        int cevre=(2*a)+(2*b);
        int alan =a*b;
        System.out.println("Alan :"+alan+"\n"+"Cevre :"+cevre);
        return alan;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Toplama \n" +
                "2-Cikartma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Uslu Sayi Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdortgen cevre ,alan Hesaplama\n";

        do {
            System.out.println(menu);
            System.out.print("Bir islem seciniz :");
            select= scan.nextInt();
            switch (select){
                case 1:
                    System.out.println("Sonuc :"+toplama(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Sonuc :"+cikarma(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Sonuc :"+carpma(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Sonuc :"+bolme(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Sonuc :"+usluSayi(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("Sonuc :"+faktoriyel(1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("Sonuc :"+mod(1,1));
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                case 8:
                    dikdort(1,1) ;
                    System.out.println("-------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("\nHatali islem !!!Tekrar deneyin \n");


            }
        }while (select!=0);
    }
}
