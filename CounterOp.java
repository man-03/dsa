import java.util.Scanner;

public class CounterOp {
    void singleLoop(int n) {
        int count=0;
        int x=n;
        for (int i=1; i<=x; i++){
            ++count;
        }
        System.out.println(count);
    }

    void nestedLoop(int n) {
        int count=0;
        int x=n;
        for (int i=1; i<=x; i++) {
            for (int j=1; j<=x; j++) {
                ++count;
            }
        }
        System.out.println(count);
    }

    void halvingLoop(int n) {
        int count=0;
//        for (int i=0; i<(n/=2); i++){
//            count++;
//        }
        while(n>1){
            n/=2;
            ++count;
        }
        System.out.println(count);
    }
    // When n doubles, singleLoop count doubles
    // When n doubles, nestedLoop count quadruples
    // When n doubles, halvingLoop count adds 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        CounterOp co = new CounterOp();

        int[] Inputs = {1, 2, 7, 8, 10, 16, 1000, 1024};
        int[] expected = {0, 1, 2, 3, 3, 4, 9, 10};

        for (int i : Inputs) {
            co.singleLoop(i);  // should print expected[i]
            co.nestedLoop(i);
            co.halvingLoop(i);
        }
    }
}