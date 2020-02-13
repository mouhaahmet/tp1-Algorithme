public class TriInsertion {

    static int[] triInsertion(int[] t)
    {
        for (int j = 0; j < t.length; j++)
        {
            int cle = t[j];
            int i = j - 1;
            while ((i >= 0) && t[i] > cle)
            {
                t[i + 1] = t[i];
                i = i - 1;
            }
            t[i + 1] = cle;
        }
        return t;
    }
}
