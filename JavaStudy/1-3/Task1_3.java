/**
 * Task1-3 : 課題内容
 *
 * 本課題では、演算子の使い方を学んでいきましょう。
 * 問①から問⑦まであります。
 * 指定された数値、式、変数名を守って記述してください。
 *
 * 問③,⑤については、コメントを入れてください。
 * 問⑦については、変数名を使って出力してください。
 *
 */
public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus = 0; 
        plus = 5 + 10;
        System.out.println(plus);


        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus = 20;
        minus -= 7;
        System.out.println(minus);

        // ③下記の処理について、何をしているのかコメントを記入してください。
        // 10×２の結果を10に代入
        int multiply = 10 * 2;
        System.out.println(multiply);

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20 % 6;
        System.out.println(remi);

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // 中央線という文字を連結して配置する
        String town = "中央";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        System.out.println(town + line);
        


        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        //System.out.println(plus);
        //System.out.println(minus);
        //System.out.println(multiply);
        //System.out.println(remi);
        


    }
}