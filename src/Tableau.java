import java.util.ArrayList;
public class Tableau{
    int nbElements;
    public static int[] generateTableau(int nbElements,int borneInf, int borneSup){
        int[] tablau = new int[nbElements];
            for(int i=0;i<nbElements;i++){
                 tablau[i] = GenerateNumber.number(borneInf, borneSup);

            }
            return tablau;

        }

}
