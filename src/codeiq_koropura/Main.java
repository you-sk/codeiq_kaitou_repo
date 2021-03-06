package codeiq_koropura;

/*【最大コンボを数えよう】

 

ランダムな整数値の並びがあります。

この中で、（左側）＜（右側）になっている数同士は「コンボが成立する」と言い、

つながりがあるグループを作り、各グループのサイズをコンボ数とします。

 

たとえば、

 

(4, 5, 1, 2, 3)

 

という並びの場合、(4, 5) や (1, 2, 3) のようなグループができ、

前者は2コンボ、後者は3コンボになります。

 

このようにコンボ数を調べるとき、最も大きなコンボ数がいくつになるかを答えてください。

 

【コンボの成立条件】

先の例のように完全に隣り合っている場合だけでなく、“1つまたは2つ”値を飛ばしてもコンボは成立します。

 

つまり、

 

(1, 2, 3, 5, 4, 5) のような並びの場合、(1, 2, 3, 5) の4コンボが最大ではなく、(1, 2, 3, 4, 5) の5コンボが最大になります。

(1, 2, 3, 5, 5, 4, 5) のような並びの場合も、(1, 2, 3, 4, 5) の5コンボが最大になります。

ただし、(1, 2, 3, 5, 5, 5, 4, 5) のような並びの場合、5が3つ並びコンボが途切れてしまうので、(1, 2, 3, 5) の4コンボが最大になります。

 

 
【入力】

1行目に正の整数値の数N(最大50)、2行目に正の整数値(100より小さい)がN個、半角スペース区切りで書かれています。

 

 
【出力】

最大コンボ数のみ出力してください。


 6
1 2 3 5 4 5

output
5

 * 
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
