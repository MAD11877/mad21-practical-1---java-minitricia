import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int number_int = in.nextInt();

    ArrayList<Integer> data = new ArrayList<Integer>();
    int max = 0;
    int result = 0;

    for(int i = 0;
    i < number_int;
    i++) {

      int number = in.nextInt();
      data.add(number);

    }

    for (int j = 0; 
    j < number_int; 
    j++) {
      int num = data.get(j);
      int occurrences = Collections.frequency(data, num);
      if (max < occurrences) {
      max = occurrences;
      result = num;
      }
    }

    System.out.print(result);
  }
}


