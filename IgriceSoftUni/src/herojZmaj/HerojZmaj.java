package herojZmaj;

import java.util.Scanner;

public class HerojZmaj {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

        int pocetniBrojHPIgrac=Integer.parseInt(sc.nextLine());
        int pocetniBrojHPZmaj=Integer.parseInt(sc.nextLine());

        if(pocetniBrojHPIgrac<=0){
            System.out.println("Heroj nije živ! Unesite pozitivan broj HP!");
        }
        if(pocetniBrojHPZmaj<=0){
            System.out.println("Zmaj nije živ! Unesite pozitivan broj HP!");
        }
        int brojZalecenja=0;

        while(true){
            System.out.printf("Heroj: %d HP\n", pocetniBrojHPIgrac);
            System.out.printf("Zmaj: %d HP\n", pocetniBrojHPZmaj);
            String opcija=sc.nextLine();
            double broj = Math.random();
            int randomBroj = (int)(broj*100+1);

            switch(opcija){
                case "Napad macem":
                    if(randomBroj<=75){
                        randomBroj=(int) (broj * (15 - 10)) + 10;
                        pocetniBrojHPZmaj-=randomBroj;
                        System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                    }
                    else{
                        System.out.println("Promašili ste! Više sreće drugi put!");
                    }
                    if(randomBroj<=20){
                        pocetniBrojHPZmaj-=0.5*randomBroj;
                    }
                    if(pocetniBrojHPZmaj<=0){
                        System.out.println("Pobedili ste!");
                        return;
                    }
                    break;
                case "Napad munjom":
                    if(randomBroj<=50){
                        randomBroj=(int) (broj * (30 - 15)) + 15;
                        pocetniBrojHPZmaj-=randomBroj;
                        System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                    }
                    else{
                        System.out.println("Promašili ste! Više sreće drugi put!");
                    }
                    if(randomBroj<=20){
                        pocetniBrojHPZmaj-=0.5*randomBroj;
                    }
                    if(pocetniBrojHPZmaj<=0){
                        System.out.println("Pobedili ste!");
                        return;
                    }
                    break;
                case "Odbrana stitom":
                    if(randomBroj<=25){
                        randomBroj=(int) (broj * (15 - 5)) + 5;
                        pocetniBrojHPZmaj-=randomBroj;
                        System.out.printf("Zmaj je pogođen! Zadali ste mu %d HP!\n", randomBroj);
                    }
                    else{
                        System.out.println("Promašili ste! Više sreće drugi put!");
                    }
                    if(randomBroj<=20){
                        pocetniBrojHPZmaj-=0.5*randomBroj;
                    }
                    if(pocetniBrojHPZmaj<=0){
                        System.out.println("Pobedili ste!");
                        return;
                    }
                    break;
                case "Lecenje":
                    if(brojZalecenja==2){
                        System.out.println("Iskorišćeno zalečenje!");
                        break;
                    }
                    randomBroj=(int) (broj * (35 - 15)) + 15;
                    pocetniBrojHPIgrac+=randomBroj;
                    brojZalecenja++;
                    break;
                default:
            }
            randomBroj=(int) (broj * (17 - 7)) + 7;
            pocetniBrojHPIgrac-=randomBroj;
            System.out.printf("Zmaj uzvraća udarac! Zadao Vam je %d HP!\n", randomBroj);
            if(pocetniBrojHPIgrac<=0){
                System.out.println("Zmaj je pobedio!");
                break;
            }
        }
	}
}


