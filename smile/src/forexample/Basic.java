package forexample;

public class Basic {
    public static void main(String[] args) {
        // 四則演算
        int score = 60;
        System.out.println(score + 5);
        System.out.println(score - 2);
        System.out.println(score * 2);
        System.out.println(score / 2);

        // 元の変数を変える場合はいろんなやり方がある。
        // score = 61;
        // score = score + 1;
        // score += 1;
        score++;
        System.out.println(score + 5);
        System.out.println(score - 2);
        System.out.println(score * 2);
        System.out.println(score / 2);

        // もう変わることのない変数はfinalで定数にして大文字にする
        int price = 500;
        final double RATE = 1.1;
        System.out.println(price * RATE);

        // 配列
        int[] scores = { 40, 50, 92 };
        scores[0] = 30;
        System.out.println(scores[0]);
        int[][] TestScores = {
                { 40, 50, 92 },
                { 20, 30, 100 },
        };
        System.out.println(TestScores[0][2]);
        System.out.println(TestScores.length);

        String gname = "Smile";
        System.out.println("I am " + gname);

    }

}
