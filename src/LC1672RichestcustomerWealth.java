public class LC1672RichestcustomerWealth
    {
        public static void main (String [] args)
        {
            int [] [] arr = {{1,2,3},{6,2,1}};

            LC1672RichestcustomerWealth solution = new LC1672RichestcustomerWealth();
            System.out.println(solution.maximumWealth(arr));
        }


        public int maximumWealth(int[][] accounts)

        {
            int ans = 0;
            for (int i=0;i<accounts.length;i++ )
            {
                int rowsum=0;
                for (int j=0;j<accounts[i].length;j++)
                {

                    rowsum = rowsum+accounts[i][j];
                }
                if (rowsum > ans)
                {
                    ans=rowsum;
                }

            }
            return ans;
        }
    }

