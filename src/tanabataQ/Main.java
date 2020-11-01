package tanabataQ;

import java.util.ArrayList;
import java.util.Scanner;

/*
 みんなの短冊を書いた順番どおりに並びかえる問題です。
書いた順に1,2,3,4,5...という短冊が並んでいたとします。

妖怪キュラゲンは、
短冊の並びをバラバラにすると同時に、
一度に1回（1組）ずつの入れ替えしかできない"わざ"を発動しました。

たとえば、
[5, 4, 2, 3, 1]
という並びであれば、
1と5を入れ替え => [1, 4, 2, 3, 5]
4と2を入れ替え => [1, 2, 4, 3, 5]
4と3を入れ替え => [1, 2, 3, 4, 5]
のように、最少でも計3回の入れかえを行うことになります。

【問題】
短冊の並びを数値であらわしたリストが入力として与えられます。
正しい並び（1,2,3,4,5...と昇順）にするためには何回の並びかえが必要か、
最小の回数を求めるプログラムを書いてください。

※リストは整数値でのみ与えられるものとします
※リストの要素に同じ値は含まれないものとします
※並びかえる手順は1通りとは限りませんが、最小の並びかえ回数のみを解答してください
※求めた最少回数を標準出力に出力してください

【入出力サンプル】入力のリストは改行区切りで与えられます
Input
5
4
2
3
1
Output
3

 */

public class Main {

	public static void main(String[] args) {
		//データの取込み
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> element = new ArrayList<Integer>();
		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			//空のデータがあったら終了にする（対話型の時）
			if (s.length() == 0)
				break;
			element.add(Integer.parseInt(s));
		}
		scanner.close();

		int swapCount = 0;
		int loopCount = element.size();

		for (int i = 0; i < loopCount; i++) {
			//System.out.print(i);
			if(!element.get(i).equals(i+1)){

				boolean check = false;

				for (int j=i; j < loopCount; j++){
					if(element.get(j).equals(i+1)){
						element = funcSwap(element,i,j);
						check = true;
						//System.out.println(":Swap a="+i+"/b="+j);
					}
				}
				if(!check){
					//数値の欠落があるため例外スロー
					//System.out.println(":Swap not found!!");
					throw new IllegalArgumentException();
				}

				swapCount++;
			} else {
				//System.out.println(":noSwap");
			}

		}

		//並び替え後
//		for (int i = 0; i < loopCount; i++) {
//			System.out.println(element.get(i));
//		}
//		System.out.println("並び替え回数");

		System.out.println(swapCount);

	}
	//入れ替え用関数
	public static ArrayList<Integer> funcSwap(ArrayList<Integer> element,Integer a,Integer b)
	{
		Integer tempA = element.get(a);
		Integer tempB = element.get(b);

		element.set(a, tempB);
		element.set(b, tempA);

		return element;
	}



}
