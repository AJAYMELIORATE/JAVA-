public class RemoveFirstOccurrence {
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in 
        String input = "one on one";
        String output = input.substring(0, input.indexOf("one")) + input.substring(input.indexOf("one") + "one".length());
        System.out.println(output);
    }
}
