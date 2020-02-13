public class TriRapide {
    static int[] triRapide(int[] A, int debut, int r) {
        if (debut < r) {
            int q = partition(A, debut, r);
            triRapide(A, debut, q - 1);
            triRapide(A, q + 1, r);
        }

        return A;
    }

    private static int partition(int[] A, int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j] < x) {
                i = i + 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }
}


