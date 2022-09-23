

import java.util.Arrays;

import java.util.Collections;

class Number
{
           public void print2largest(Integer arr[],int arr_size)
          {
                int i, first, second;
                // Sorting arr using Arrays
                Arrays.sort(arr);
                for (i = arr_size - 2; i >= 0; i--)
                {
                  if (arr[i] != arr[arr_size - 1])
                  {
                  System.out.printf("The second largest element is %d\n", arr[i]);
                  return;
                  }
                }
                System.out.printf("There is no second largest element \n ");
          }


    public void print2smallest(Integer arr1[],int arr_size)
    {
            int i, first, second;
           //array sort desending order using Collections.reverseOrder()
            Arrays.sort(arr1,Collections.reverseOrder());
            for (i = arr_size - 2; i >= 0; i--)
            {
              if (arr1[i] != arr1[arr_size - 1])
              {
              System.out.printf("The second smallest element is %d\n", arr1[i]);
              return;
              }
            }
            System.out.printf("There is no second largest element\n");
    }

    public static void main(String[] args)
    {
          Number n1=new Number();
          
          Integer arr1[]= {9,2,4,10};
          int n = arr1.length;

          n1.print2largest(arr1, n);
          n1.print2smallest(arr1, n);

    }
}


