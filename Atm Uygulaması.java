import java.util.Scanner;

public class algoritma {

    public static int Goster(int anaPara)
    {
        System.out.println("Hesap numarasi: 02210201060");
        System.out.println("Musteri adi: Mehmet Onur Isbilir");
        System.out.println("Paraniz: "+anaPara);

        return anaPara;
    }
    public static void Menu()
    {
        System.out.println();
        System.out.println("1-Para Cekme");
        System.out.println("2-Para Yatirma");
        System.out.println("3-Tutar Goster");
        System.out.println("4-Cikis");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int tus,cekilenPara=0,yatirilanPara=0;
        int anaPara=850;

        Goster(anaPara);

        do {
            Menu();

            System.out.print("Lutfen yapacaginiz islemi tuslayiniz: ");
            tus=s.nextInt();

            switch (tus)
            {
                case 1:
                    System.out.print("Cekeceginiz tutar: ");
                    cekilenPara=s.nextInt();

                    if (cekilenPara<=0 || anaPara<cekilenPara)
                    {
                        System.out.println("Paraniz yeterli degil veya gecersiz bir tutar!");
                        break;
                    }
                    else {
                        anaPara-=cekilenPara;
                        System.out.println("Paraniz: "+anaPara);
                    }
                    break;
                case 2:
                    System.out.print("Yatiracaginiz tutar: ");
                    yatirilanPara=s.nextInt();

                    if (0<yatirilanPara)
                    {
                        anaPara+=yatirilanPara;
                        System.out.println("Paraniz: "+anaPara);
                        break;
                    }
                    else {
                        System.out.println("Lutfen gecerli bir tutar giriniz!");
                    }
                    break;
                case 3:
                    System.out.println("Paraniz: "+anaPara);
                    break;
                case 4:
                    System.out.println("Cikis yapiliyor...");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir secim yapiniz!");
                    break;
            }
        } while (tus!=4);
    }
}