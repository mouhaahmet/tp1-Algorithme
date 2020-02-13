public class TriFusion {
    public static int[] triFusion (int [] tab, int début, int fin)
    {
        int milieu;
        if(début < fin)
        {
            milieu = (début+fin) / 2;
            triFusion(tab, début, milieu);
            triFusion(tab, milieu + 1, fin);
            fusionner (tab, début, milieu, fin);
        }
        return tab;
    }

    public static void fusionner (int tab[], int début, int milieu, int fin)
    {
        int [] tab_initiale = (int[]) tab.clone();

        int i1 = début; //indice dans la première moitié de tab_initiale
        int i2 = milieu + 1; // indice dans la deuxième moitié de tab_initiale
        int i = début; //indice dans le tableau tab

        while (i1 <= milieu && i2 <= fin)
        {
            if(tab_initiale[i1] <= tab_initiale[i2])
            {
                tab[i] = tab_initiale[i1];
                i1++;
            }
            else
            {
                tab[i] = tab_initiale[i2];
                i2++;
            }
            i++;
        }
        if (i <= fin)
        {
            while(i1 <= milieu)  // le reste de la première moitié
            {
                tab[i] = tab_initiale[i1];
                i1++;
                i++;
            }
            while(i2 <= fin) // le reste de la deuxième moitié
            {
                tab[i] = tab_initiale[i2];
                i2++;
                i++;
            }
        }
    }
}
