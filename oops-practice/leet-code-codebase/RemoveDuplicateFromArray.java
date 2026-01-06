
public class RemoveDuplicateFromArray
{
    public static int removeDupliactes(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        int uniqueIndex=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[uniqueIndex])
            {
                uniqueIndex++;
                nums[uniqueIndex]=nums[i];
            }
        }
        return uniqueIndex+1;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,4,5};
        int newlength=removeDupliactes(nums);
        System.out.println("new length:"+newlength);
        System.out.println("Array after removing duplicates");
        for(int i=0; i<newlength; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}