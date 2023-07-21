import java.util.Arrays;
class ReverseArray
{
    private int[] arr;

    public ReverseArray(int[] arr)
    {
        this.arr = arr;
    }

    public void reverse()
    {
        int left = 0;
        int right = arr.length - 1;
        while (left < right)
            {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        ReverseArray revArray = new ReverseArray(arr);
        revArray.reverse();
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}