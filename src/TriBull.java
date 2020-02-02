public class TriBull {

    static int[] tri_a_bulles(int A[])
    {
        int  temp;
        for(int i = A.length-1 ; i>=1 ; i--)
        {
            for(int j = 0 ; j<i ; j++)
                if(A[j] > A[j+1])
                {
                    temp = A[j+1];
                    A[j+1]=A[j];
                    A[j]=temp;
                }
        }
        return A;
    }
}

