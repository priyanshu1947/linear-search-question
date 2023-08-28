public class maxm2darray
{
    public static void main(String[] args)
    {
        int [][] arr = {{2,3,4,5,},{31,41,51,81,},{35,56,886,34}};

        System.out.println(maxm(arr));

    }
    static int maxm(int [] [] arr)
    {
        int max = arr[0][0];
        for (int i =0;i<arr.length;i++)
        {
            for (int j =0;j<arr[i].length;j++)
            {
                if (arr[i][j]>max)
                {
                    max= arr[i][j];
                }
            }
        }
        return max;
    }
}
