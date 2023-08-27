public class minelementarray
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,4,-7,43,532};
        System.out.println(minelemnt(arr));

    }
    static int minelemnt(int arr[])
    {
        int ans= arr[0];
        if ( arr.length==0)
        {
            return -1;
        }
        for (int i =1; i < arr.length;i++)
        {
            if( arr[i]<ans)
            {
                ans=arr[i];
            }

        }
        return ans;
    }

}
