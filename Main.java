
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz : ");
        int sayı= scn.nextInt();
        System.out.println("girmiş olduğunuz sayı kaç basamaklı(örnek =4) :");
        int basamak_sayısı = scn.nextInt();
        
        int gecici_sayı = sayı;//geçici sayı(provisional booking )
        int toplam = 0;
        do{
        int basamak_degeri = gecici_sayı% 10;
        gecici_sayı /=10;
        toplam+= Math.pow(basamak_degeri,basamak_sayısı);
        
            
            
        }while(gecici_sayı>0);
        if(sayı == toplam){
            System.out.println("Bu bir armstrong sayısıdır...");
        }else{
            System.out.println("bu armstrong sayısı değildir.");
        }
        
    }
    
}
