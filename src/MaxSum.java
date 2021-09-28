
class MaxSum
{
    static int findSingle(int ar[], int ar_size)
    {
        // XOR
        int res = ar[0];
        for (int i = 1; i < ar_size; i++)
            res = res ^ ar[i];
        return res;
    }
    public static void main (String[] args)
    {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                findSingle(ar, n) + " ");
    }
}
