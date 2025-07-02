public class Basic2 {

    public static void main(String... args) {

        // if構文
        int power = 19;
        if (power >= 25) {
            System.out.println("あなたはパワーが高いです");
        } else if (power >= 20) {
            System.out.println("あなたのパワーは普通です");
        } else
            System.out.println("あなたはパワーが低いです");

        // if構文で割り算などしたい場合は「%」であまりゼロの式をつくる。
        // =だけだと変数の代入になるので==にする。
        int number = 1;
        if (number % 2 == 0) {
            System.out.println("これは偶数です");
        } else if (number % 2 == 1) {
            System.out.println("これは奇数です");
        } else {
            System.out.println("整数ではありません");
        }

        // 文字列の場合は.equals("文字列") == trueにする
        String signal = "blue";
        if (signal.equals("red") == true) {
            System.out.println("stop");
        } else if (signal.equals("blue")) {
            System.out.println("go");
        } else {
            System.out.println("wrong signal");
        }

        // switch構文
        String sex = "man";
        switch (sex) {
            case "man":
                System.out.println("あなたは男性です");
                break;
            case "woman":
                System.out.println("あなたは女性です");
                break;
            default:
                System.out.println("性別は不明です");
        }

        // for構文
        for (int i = 1; i <= 4; i++) {
            if (i == 4) {
                System.out.println("ワイプアウト！！");
            } else {
                System.out.println(i + "人倒した！");
            }
        }

    }

}
