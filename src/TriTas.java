public class TriTas {

    static int parent(int i){
        return i/2;
    }
    static int gauche(int i){
        return 2*i;
    }
    static int droite(int i){
        return 2*i+1;
    }
    static void entasserMax(int[] A,int i){
        int max;
        int g=gauche(i);
        int d=droite(i);
        if (g<=(A.length) && A[g]>A[i])
        {
             max=g;
        }
        else
        {
             max=i;
        }
        if (d<=(A.length) && A[d]>A[max])
        {
             max=d;
        }
        if (max!=i)
        {
            int tmp = A[i];
            A[i]=A[max];
            A[max]=tmp;
            entasserMax(A,max);

        }



    }






}
