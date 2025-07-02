
/**
 * Q1: Fizzbuzz問題
 * 
 * (1) 1~100までの数字をコンソールに出力してください。
 * (2) 3の倍数の時はFizzと出力して下さい
 * (3) 5の倍数の時はBuzzと出力して下さい。
 * (4) 3/5両方の倍数の際はFizzBuzzと出力して下さい・
 * 
 * 【challenge】
 * (1) Scannerを利用して、終了値を可変にできるようにしてください。
 * (2) 出力文面の判定ロジックをprivate static methodに切り分けてみてください。
 */
public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
