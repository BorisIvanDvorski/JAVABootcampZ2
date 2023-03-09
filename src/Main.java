import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kmInput = new Scanner(System.in);
        double brojKM=0, conversionFactor=0;

        while(brojKM<=0){
            System.out.print("Unesite broj kilometara: ");
            brojKM= kmInput.nextDouble();
            if(brojKM<=0){
                System.out.println("Broj kilometara mora biti pozitivan broj.");
            }
        }

        while(conversionFactor<=0){
            System.out.print("Unesite konverzijski faktor: ");
            conversionFactor= kmInput.nextDouble();
            if(conversionFactor<=0){
                System.out.println("Konverzijski faktor mora biti pozitivan broj.");
            }
        }

        int brojMi = (int)(brojKM/conversionFactor);

        System.out.println("Uneseno je "+brojKM+" kilometara, što je "+brojMi+" milja.");

    }
}