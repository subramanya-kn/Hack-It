public class FizzBuzzBazz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }

            if (i % 7 == 0) {
                output += "Bazz";
            }

            System.out.println(output.length() > 0 ? output : i);
        }

    }
}
