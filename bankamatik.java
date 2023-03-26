import java.util.Scanner;

public class bankamatik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String userName,password;
        int hak=3;
        int bakiye=2000,process,tutar;
        while(hak>0) {
            System.out.print("Enter your user name:");
            userName=input.nextLine();
            System.out.print("Enter your password:");
            password=input.nextLine();
            if(userName.equals("ismail") && password.equals("2545")) {
                System.out.println("Merhaba YAZILIM BANKASI'NA hoş geldiniz.");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-PARA ÇEKME\n2-PARA YATIRMA\n3-BAKİYE SORGULAMA\n4-FATURA ÖDEME\n5-ÇIKIŞ YAPMA");
                    System.out.print("İŞLEM:");
                    process=input.nextInt();
                    if(process==1) {
                        System.out.print("Lütfen çekmek istediğiniz tutarı giriniz:");
                        tutar=input.nextInt();
                        if(tutar>bakiye) {
                            System.out.println("Yetersiz bakiye!!!Tekrar deneyiniz.");
                        }else{
                            System.out.println("Lütfen bekleyiniz paranız hazırlanıyor...");
                            bakiye-=tutar;
                            System.out.println("İşleminiz basarılı bir şekilde gerçeklesmiştir kalan bakiyeniz="+bakiye+"TL'dir");
                        }
                    }else if(process==2) {
                        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                        tutar=input.nextInt();
                        System.out.println("Paranızı sayıyoruz lütfe bekleyiniz...");

                        bakiye+=tutar;
                        System.out.println("Paranız başarılı bir şekilde yatırılmıstır.Yatırılan tuar="+tutar+"TL'dir"+"\nKalan bakiyeniz="+bakiye+"TL'dir");

                    }else if(process==3) {
                        System.out.println("Toplam bakiyeniz="+bakiye+"TL'dir");
                    }else if(process==4) {
                        System.out.print("Fatura tutarını giriniz:");
                        double fatura= input.nextDouble();
                        if(fatura>bakiye) {
                            System.out.println("Yetersiz bakiye...");
                        }else{
                            bakiye-=fatura;
                            System.out.println("Faturanız başarılı bir şekilde ödenmiştir.");
                        }


                    }else if(process==5){
                        System.out.println("İyi günler dileriz..");

                    }else{
                        System.out.println("Hatalı tuslama yapıldı  tekrar deneyiniz...");
                    }

                }while(process!=5);


                break;
            }else{
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Lütfen tekrar deneyiniz.");
                if(hak==0) {
                    System.out.println("Kartınız bloke olmuştur.Lütfen en yakın banka ile iletişime geçiniz...");

                }else{
                    System.out.println("Kalan hakkınız:"+hak);
                }

            }

        }


    }
}
