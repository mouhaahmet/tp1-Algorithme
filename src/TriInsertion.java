public class TriInsertion {

    static int[] tri_a_insertion(int[] t)
    {
        for (int j = 1; j <= t.length; j++)
        {
            int cle = t[j];
            int i = j - 1;
            while ((i > 0) && t[i] > cle)
            {
                t[i + 1] = t[i];
                i = i - 1;
            }
            t[i + 1] = cle;
        }
        return t;
    }
}
