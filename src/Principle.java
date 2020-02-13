import java.util.Scanner;
public class Principle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrer la taille de votre liste");
        int taille = sc.nextInt();
        System.out.println("veuillez entrer la borne inf");
        int borneInf = sc.nextInt();
        System.out.println("veuillez entrer la borne sup");
        int borneSup = sc.nextInt();
        int[] tablau = Tableau.generateTableau(taille,borneInf,borneSup);
        System.out.println("Avant tri on a:");
        for (int i=0 ; i<taille ; i++)
            System.out.print(tablau[i]+"|");
       /* System.out.println("");
        TriBull.triBulle(tablau);
        System.out.println("Apres le tri par Bull on a ");
        for (int i=0 ; i<taille ; i++)
            System.out.print(tablau[i]+"|");
        System.out.println("");
        TriInsertion.triInsertion(tablau);
        System.out.println("Apres le tri par insertion on a ");
        for (int i=0 ; i<taille ; i++)
            System.out.print(tablau[i]+"|");
        System.out.println("");
        */
        System.out.println("");
        System.out.println("apres le tri on a");
        TriBase.triParBase(tablau,taille,2);
        for (int i=0 ; i<taille ; i++)
            System.out.print(tablau[i]+"|");
        System.out.println("");

    }
}
