package com.company;

public class SortingUtil {
    public static void swap(int[]arr, int x, int y)
    {
        int temp;
        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int[] randIntArray(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*count+1);
        }
        return arr;
    }
    public static boolean Check(int[]arr)
    {
        for(int i = 0; i < (arr.length-1); i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
	// write your code here
    }
}
