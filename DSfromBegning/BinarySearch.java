public class BinarySearch {
    public static int binarysearch(int arr[],int key)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
int mid=(left+right)/2;
if(arr[mid]==key) 
return mid ;
else if(arr[mid]<key)
left=mid+1;   
else 
right=mid-1; 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,8,23};
        int key=7;
        int result=binarysearch(arr, key);
        if(result==-1)
        {
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index:"+result);
        }
    }
 }
        

