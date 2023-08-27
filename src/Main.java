public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 4, 67, 5, 6, -66};
        int target =55;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static boolean linearSearch(int[] arr, int target)
    {
        if (arr.length == 0)
        {
            return false;
        }
        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if (element == target)
            {
                return true;
            }
        }
        return false;
    }

}
