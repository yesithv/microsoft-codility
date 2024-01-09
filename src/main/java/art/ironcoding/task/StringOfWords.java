package art.ironcoding.task;

public class StringOfWords {
    public static void main(String[] args) {
        //String S = "one+two-one-one+two+one";
        //String S = "two-two-one-two";
        String S = "two";
        System.out.print("The solution is: = " + solution(S));
    }

    public static int solution(String S) {
        // Validate the input
        if (S.length() < 3 || S.length() > 499) {
            return 0;
        }

        // Star the sum with the first character
        int sum = S.charAt(0) == 'o' ? 1 : 2;
        //System.out.println("The sum start with = " + sum);


        for (int i = 3; i < S.length(); i = i + 4) {
            //System.out.println(" ----------------- i = " + i);
            //System.out.println("The sum = " + sum);
            char character = S.charAt(i);
            char nextNumber = S.charAt(i + 1);
            //System.out.println("nextNumber = " + nextNumber + " character = " + character);
            if (character == '+') {
                sum = sum + (nextNumber == 'o' ? 1 : 2);
                //System.out.println("sum (+)= " + sum);
            } else {
                sum = sum - (nextNumber == 'o' ? 1 : 2);
                //System.out.println("sum (-)= " + sum);
            }
        }
        return sum;
    }
}
