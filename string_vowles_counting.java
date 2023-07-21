//calculate no of words in a sentence based on which calculate the no of vowels in each word & also print the count of vowels......//
import java.util.*;
class vowels
{
public static void main(String args[])
{
        Scanner sc= new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
int Count = 0;
for (String word : words)
{
            int vowelCount = 0;
            for (int i = 0; i < word.length(); i++)
{
                char c = word.charAt(i);
if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c == 'O'||c =='U')
{
                    vowelCount++;
                    Count++;
                }
            }
System.out.println("Count of vowels in "+ word+":" + vowelCount);
        }
int wordcount = words.length;
System.out.println("Count number of words: " + wordcount);
System.out.println("Count number of vowels: " + Count);
    }
}