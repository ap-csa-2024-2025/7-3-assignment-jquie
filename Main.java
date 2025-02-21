import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> foo = new ArrayList<String>();
    foo.add("A");
    foo.add("B");
    foo.add("C");
    foo.add("D");
    foo.add("E");
    foo.add("F");
    System.out.println("ArrayList before shiftLeft: " + foo);
    shiftLeft(foo);
    System.out.println("main - ArrayList after shiftLeft: " + foo);

    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(1);
    num.add(5);
    num.add(9);
    num.add(5);
    num.add(1);
    printStatistics(num);
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    System.out.println("func - Arraylist before doing anything: " + arr);
    String front = arr.remove(0);
    System.out.println("func - ArrayList after removing element at index 0: " + arr);
    arr.add(front);
    System.out.println("func - ArrayList after appending the front element: " + arr);

  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    int sum = 0;
    double avg = 0;
    int mode = 0;
    int maxCount = 0;
    for (Integer N : arr)
    {
      int count = 0;
      sum += N;
      for (Integer J : arr)
      {
        if (J.equals(N))
        {
          count ++;
        }
        if (count > maxCount)
        {
          mode = N;
          maxCount = count;
        }
      }
    }
    avg = sum / (double) arr.size();
    System.out.println("Sum: " + sum);
    System.out.println("Avgerage: " + avg);
    if (maxCount == 0)
    {
      System.out.println("Mode: no single mode");
    }
    else
    {
      System.out.println("Mode: " + mode);
    }
  }  
}
