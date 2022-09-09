package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int v : alternate(a))
            System.out.println(v);
    }

    static int[] alternate (int[] a)
    {
        int[] array = new int[a.length];
        int l = a.length;

        /*
        array[0] = a[0];
        array[1] = a[num - 1];
        array[2] = a[1];
        array[3] = a[num - 2];
        array[4] = a[2];
        array[5] = a[num - 3];
        array[6] = a[3];
         */

        for (int i = 0; i < l; i = i + 2)
        {
            array[i] = a[i/2];
        }
        for (int i = 1; i < l; i = i + 2)
        {
            array[i] = a[(l - 1) - (i/2)];
        }

        return array;
    }
}
