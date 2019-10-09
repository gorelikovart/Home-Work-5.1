package com.company;
public class Main
{
    public static void main(String[] args)
    {
        int a[] = {2,5,8,7,6,3,1,4,9};
        for (int i = 0; i < a.length-1; i++)
        {
            int max = i;
            for (int j = i+1; j < a.length; j++)
            {
                if (a[j] > a[max])
                    max = j;
            }
            int temp = a[max];
            a[max] = a[i];
            a[i] = temp;
        }
        for (int x = 0; x < a.length; x++) {System.out.println(a[x]);}
    }
}


