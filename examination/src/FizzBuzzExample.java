import java.util.Scanner;

/**
 * Scannerで最大値を任意で指定できるようにした + 入力検証処理を追加したFizzBuzz29
 * MEMO
 * try catch
 *   try: 正常系処理を書く
 *   catch: エラーが発生した場合の処理を記載する
 *
 * 今回の場合はScannerで数値以外が入力されるとInteger.parseIntでNumberFormatExceptionが発生するため利用している。
 */
public class FizzBuzzExample {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MIN_VALUE = 30;
    private static final int MAX_VALUE = 1000;

    public static void main(String[] args) {
        final int inputMaxValue = readNumber();
        for (int i = 1; i <= inputMaxValue; i++) {
            stdoutFizzBuzzResult(i);
        }
    }

    /**
     * 入力値を受け取る 30~1000までを許容する。
     * 不正な値が入力された場合は再入力を促す
     * @return inputNumber
     */
    private static int readNumber() {
        while (true) {
            System.out.print(MIN_VALUE + "〜" + MAX_VALUE + " の数値を入力してください: ");
            final String input = SCANNER.nextLine();

            try {
                final int inputNumber = Integer.parseInt(input);
                if (MIN_VALUE <= inputNumber && inputNumber <= MAX_VALUE) {
                    return inputNumber;
                }
                System.out.println("入力値が不正です。もう一度入力してください。");
            } catch (NumberFormatException exception) {
                System.out.println("数字として認識できませんでした。もう一度入力してください。");
            }
        }
    }

    /**
     * FizzBuzzの判定結果を出力する
     * @param num: inputNumber
     */
    private static void stdoutFizzBuzzResult(int num) {
        // if~elseの量が増えるとわかりづらくなるので、ifの中で速攻リターンする手法もあり。
        // アーリーリターンパターンと呼ばれる
        // https://zenn.dev/media_engine/articles/early_return
        if (num % 15 == 0) {
            System.out.println("FizzBuzz");
            return;
        }
        if (num % 3 == 0) {
            System.out.println("Fizz");
            return;
        }
        if (num % 5 == 0) {
            System.out.println("Buzz");
            return;
        }
        System.out.println(num);
    }
}
