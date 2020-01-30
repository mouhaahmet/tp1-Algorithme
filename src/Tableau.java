import java.util.ArrayList;
public class Tableau{
    ArrayList<Integer> table = new ArrayList<Integer>();
    public Tableau(int nbElements,int borneInf, int borneSup){
            for(int i=1;i<=nbElements;i++){
                 table.add( GenerateNumber.number(borneInf, borneSup));

            }

        }

}
