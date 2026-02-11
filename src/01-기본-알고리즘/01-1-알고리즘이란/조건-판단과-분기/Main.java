/*
 * Book Topic: 조건-판단과-분기
 * Source Note: docs/01-기본-알고리즘/01-1-알고리즘이란/조건-판단과-분기.md
 */
class Ch01S1T02 {
    public static void main(String[] args) {
        try (Scanner stdIn = new Scanner(System.in)) {
            System.out.print("정수를 입력하세요: ");
            int n = stdIn.nextInt();

            if (n > 0) {
                System.out.println("양수입니다.");
            } else if (n < 0) {
                System.out.println("음수입니다.");
            } else {
                System.out.println("0입니다.");
            }
        }
    }
}



