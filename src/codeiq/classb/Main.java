package codeiq.classb;


/*
 * 【問題】

20桁の数字が提示されます。

一番左の桁を先頭として、右の桁へと順に見ていきます。

そして、隣り合った数が連続する数だった場合は、その双方を削除して先頭に戻ります。

最終的に、削除ができなくなった時点で数字を出力してください。



例

「95422357545868773174」→「95422357545868773174」→

「922357545868773174」→「922357545868773174」→

「9257545868773174」→「9257545868773174」→

「92575868773174」→「92575868773174」→

「925758673174」→「925758673174」→

「9257583174」（削除ができなくなったので、これが答え）




【入力】

標準入力から、複数行のデータが与えられます。1行のデータが、1つの20桁の数字になります。




【出力】

1行ずつ処理を行ない、その答えを1行ごと標準出力に出力します。




【入出力サンプル】
Input

95422357545868773174
24566191298259441958
34757881545564825469
86423251489513547814


Output

9257583174
26619259441958
75818269
8642511314
 */
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String line;
        for(;cin.hasNext();){
            line=cin.nextLine();
            System.out.println(erase("aaaa"));
            continue;
        }

    }

    static String erase(String inputStr)
    {
    	boolean complete = false;

    	String distStr = inputStr;

    	while (!complete) {


			complete = true;
		}


        distStr = "9XX257583174";

    	return  distStr.replace("X", "");
    }

}
