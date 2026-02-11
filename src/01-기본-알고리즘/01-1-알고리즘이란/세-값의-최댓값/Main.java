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

class Max3m {
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
    public static void main(String[] args) {
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("최댓값은 " + max3(10, 20, 30) + "입니다.");
    }
}

class Max4m {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }
    public static void main(String[] args) {
        System.out.println("네 정수의 최댓값을 구합니다.");
        System.out.println("최댓값은 " + max4(10, 20, 30, 40) + "입니다.");
    }
}

class Min3 {
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }
    public static void main(String[] args) {
        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.println("최솟값은 " + min3(10, 20, 30) + "입니다.");
    }
}

class Min4 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
    public static void main(String[] args) {
        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.println("최솟값은 " + min4(10, 20, 30, 5) + "입니다.");
    }
}