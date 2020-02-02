public class TriFusion {
    static int[] tri_a_fusion(int[] A , int p , int r)
    {
        if (p < r){
            int q = (p+r)/2;
            tri_a_fusion(A,p,q);
            tri_a_fusion(A,q+1,r);
            Fusion(A,p,q,r);
        }

        return A;
    }

    private static void Fusion(int[] A, int p, int q, int r) {
        int n = q-p+1;
        int m = r-q;
        int i =0 ;
        int j = 0 ;
        int[] tableau1 = new int[n];
        int[] tableau2 = new int[m];
        for ( i = 0 ; i < n ; i++)
            tableau1[i] = A[p + i - 1];
        for ( j = 0 ; j < m ; j++)
            tableau2[j] = A[q + j];
        for (int k = p ; k < r ; k++){
            if (tableau1[i] <= tableau2[j]){
                A[k]=tableau1[i];
                i=i+1;
            }
            else {
                A[k]=tableau2[j];
                j=j+1;
            }


        }




    }
}
