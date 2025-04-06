import java.util.Scanner;
public class Firstandlast34 {
  

    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Taking array size input
            System.out.print("Enter size of the array: ");
            int n = sc.nextInt();
    
            int[] nums = new int[n];
    
            // Taking array elements input
            System.out.println("Enter elements in sorted order:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }  
    
            // Taking target input
            System.out.print("Enter target value: ");
            int target = sc.nextInt();
    
            // Calling function
            int[] result = searchRange(nums, target);
    
            // Printing result
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        }
    
        // Function to find first and last position
        public static int[] searchRange(int[] nums, int target) {
            int start = -1;
            int end = -1;
    
            // Find first position
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    start = i;
                    break;
                }
            }
    
            // Find last position
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == target) {
                    end = i;
                    break;
                }
            }
    
            return new int[]{start, end};
        }
    }
    
