public class searchrange
{
    public static void main(String[] args)
    {
        int arr [] = {24,3,5,67,45};
        int target = 5;
        int start = 1;
        int end = 4;


        System.out.println(search(arr,target,start,end));

    }

    static int search(int arr[], int target, int start, int end)
    {
        if (arr.length==0)
        {
            return -1;
        }
        for (int i = start; i<=end; i++)
        {
            int element = arr[i];
            if (element==target)
            {
                return i;
            }
        }
        return -1;

    }

}
