import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz{
    List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) answer.add("FizzBuzz");
            else if (i % 5 == 0) answer.add("Buzz");
            else if (i % 3 == 0) answer.add("Fizz");
            else answer.add(String.valueOf(i));
        }
        return answer;
    }
    //complexity O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FizzBuzz fb=new FizzBuzz();
        System.out.println(fb.fizzBuzz(n));
    }
}
