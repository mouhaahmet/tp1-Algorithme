import java.util.Random;

public class GenerateNumber {
    int borneInf;
    int borneSup;

    public GenerateNumber(int borneInf, int borneSup){
        this.borneInf=borneInf;
        this.borneSup=borneSup;
    }

    public static int number(int borneInf, int borneSup){
        Random random = new Random();
        return  borneInf+random.nextInt(borneSup-borneInf);

    }

    
}
