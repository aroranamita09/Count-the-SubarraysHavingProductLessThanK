package com.stackroute;
class CountArrays {

    public  int countsubarray(int array[],
                             int n, int k)
    {
        int count = 0;
        int i, j, mul;

        for (i = 0; i < n; i++)
        {

            // Counter for single element
            if (array[i] <= k)
                count++;

            mul = array[i];

            for (j = i + 1; j < n; j++)
            {

                // Multiple subarray
                mul = mul * array[j];

                // If this multiple is less
                // than k, then increment
                if (mul <= k)
                    count++;
                else
                    break;
            }
        }

        return count;
    }



}
