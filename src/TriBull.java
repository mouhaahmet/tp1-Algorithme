public class TriBull {

    static int[] tri_a_bulles(int T[])
    {
        int  temp;
        for(int i = T.length-1 ; i>=1 ; i--)
        {
            for(int j = 0 ; j<i ; j++)
                if(T[j] > T[j+1])
                {
                    temp = T[j+1];
                    T[j+1]=T[j];
                    T[j]=temp;
                }
        }
        return T;
    }
}

