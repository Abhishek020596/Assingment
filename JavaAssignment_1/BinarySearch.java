import java.util.*;
class BinarySearch
{
    int search (int arr[],int x)
    {
        int l=0, r=arr.length -1;
        while(l<= r)
        {
            int m=l+(r-l)/2;
            if(arr[m]==x)
            return m;
            if(arr[m]<x)
            l=m+1;
            else r=m-1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch s=new BinarySearch();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the element to be searched");
        int num=sc.nextInt();
        int arr[]={3,5,6,7,10,14,15,75,8896,99};
        int result=s.search(arr,num);
        if(result==-1)
        System.out.println("No match found in the array");
        else
        System.out.println("Match found at index"+result);
    } 

}