import java.util.Scanner;
/*
 * Book Topic: 세-값의-최댓값
 * Source Note: docs/01-기본-알고리즘/01-1-알고리즘이란/세-값의-최댓값.md
 */
class Ch01S1T01 {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("세 정수의 최댓값을 구합니다.");
            System.out.print("a의 값: ");
            int a = stdIn.nextInt();
            System.out.print("b의 값: ");
            int b = stdIn.nextInt();
            System.out.print("c의 값: ");
            int c = stdIn.nextInt();

            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;

            System.out.println("최댓값은 " + max + "입니다.");
        }
    }
}



