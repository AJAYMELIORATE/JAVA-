import java.util.Arrays;
class Nclass-24-02-23-LEFT_ROTATION
{
    private int[] arr;

    public Nclass-24-02-23-LEFT_ROTATION(int[] arr)
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
        Nclass-24-02-23-LEFT_ROTATION revArray = new Nclass-24-02-23-LEFT_ROTATION(arr);
        revArray.reverse();
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}