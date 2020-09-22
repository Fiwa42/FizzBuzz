import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beg = scanner.nextInt();
        int end = scanner.nextInt();
        String f = "Fizz";
        String b = "Buzz";
        
        for (int i = beg; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(f + b);
            } else if (i % 3 == 0) {
                System.out.println(f);
            } else if (i % 5 == 0) {
                System.out.println(b);
            } else {
                System.out.println(i);
            }
        }       
    }
}

