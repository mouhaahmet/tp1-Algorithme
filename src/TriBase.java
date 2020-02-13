public class TriBase {

    static void denombrement(int[] A, int n, int b, int p) {
        int[] sortie = new int[n];
        for (int i=0 ; i <n-1 ; i++){
            sortie[i]=0;
        }
        int[] compteur = new int[b];
        for (int i=0 ; i <b ; i++){
            sortie[i]=0;
        }
        for (int i = 0; i < n-1; i++)
            compteur[(A[i] / p) % b]++;
        for (int i = 1; i < b; i++)
            compteur[i] = compteur[i] + compteur[i - 1];
        for (int i = n - 1; i > 0; i--) {
            sortie[compteur[(A[i] / p) % b] - 1]=A[i];
            compteur[(A[i]/p) % b]--;
        }
        for (int i = 0; i < n-1; i++)
            A[i] = sortie[i];

    }

    static void triParBase(int[] A, int n, int b) {
        int max = A[0];
        for (int i : A) {
            if (i > max)
                max = i;
        }
        int p = 1;
        while ((max / p) > 0) {
                denombrement(A, n, b, p);
                p = p * b;
            }
        }
    }




