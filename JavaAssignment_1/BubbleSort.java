class BubbleSort
{
   void bubbleSort(int a[])
      {
          int len = a.length; // calculating the length of array
          for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len-i-1; j++) 
               if (a[j] > a[j+1]) //comparing the pair of elements
               {
                 // swapping a[j+1] and a[i]
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
        }

     /* Prints the array */
     void printArray(int a[])
        {
           int len = a.length;
           for (int i=0; i<len; i++)
           System.out.print(a[i] + " "); //printing the sorted array
           System.out.println();
         }

         public static void main(String args[])
     // Main method to test above
            {
               BubbleSort ob = new BubbleSort();
                int a[] = {64, 34, 25, 12, 22, 11, 90};
                ob.bubbleSort(a);//calling the bubbleSort function
                System.out.println("Sorted array");
                ob.printArray(a); //calling the printArray function
             }
}