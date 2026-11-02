public class ComplexityPrediction {
    public static void main(String[] args){
        // Prediction: ?
        System.out.println(Integer.MAX_VALUE + 1);

        // Prediction: ? 3
        System.out.println(7 / 2);

        // Prediction: ? 3.5
        System.out.println(7 / 2.0);

        // Prediction: ? -0.21
        System.out.println(-7 % 3);

        // Prediction: ? a1
        System.out.println('a' + 1);

        // Prediction: ? asci code
        System.out.println((char) ('a' + 1));

        // Prediction: ? E
        byte b = 10;
        b += 5;
        System.out.println(b);

        // Prediction: ?error
//        boolean x = true && (System.out.println("side effect") != null);
//        System.out.println(x);
    }
}