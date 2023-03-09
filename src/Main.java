import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kmInput = new Scanner(System.in);
        double brojKM=0, conversionFactor=0;

        try{
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

            File file = new File("konverzijski_faktor.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(Double.valueOf(conversionFactor).toString());
            writer.close();

            Scanner reader = new Scanner(file);
            double conversionFactorRead=reader.nextDouble();
            System.out.println("Iz datoteke: konverzijskiFaktor = "+conversionFactorRead);
            reader.close();

            boolean factorCheck=(conversionFactor==conversionFactorRead);

            int brojMi= (int)(brojKM/conversionFactorRead);
            System.out.println("Uneseno je "+brojKM+" kilometara, što je "+brojMi+" milja.");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}