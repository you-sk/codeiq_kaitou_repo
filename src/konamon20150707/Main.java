package konamon20150707;
/*
俺の名はコナモン。事情があって頭脳だけ子供にされちまった探偵さ。
今日も怪盗きっずから予告状が届いたようだ。
なになに・・・？


　　　　　　　　　【 予告状 】

　本日、3の魔術師チチンと5の魔術師プイプイの呪文が
　360回連なる時、「たこ焼きの☆」を頂きに参上する！
　　　　　　　　　　　　　　　　　怪盗きっずより


なに！いつか食べてみたいと思っていたあの「たこ焼きの☆」を盗むだと！にゃろー！許せねー！

どうやら俺の頭脳が察するに、
1から順に1ずつ増分した数が、3の倍数のときに「チチン」、5の倍数のときに「プイプイ」と唱える魔術師がいたとして、
「チチン」のあとに「プイプイ」が唱えられる数が360回目になるときの数が、犯行時刻になると予告しているみてーだ。
あれれー。でも、ボク子供だからよく分かんないや！

どうやら迷探偵コナモンでも解けない迷宮入りになりそうな事件が起こりそうです。
みなさんのIT脳で犯行時刻を明らかにして下さい！


【問題】
　この謎を解くプログラムを作成して下さい。
　挑戦言語は不問です。
　プログラムで解いた答えとなる時刻を、以下の解答欄に直接記入して下さい。
　なお、3と5の倍数のときは、3の魔術師が先に唱えることとします。

【解答方法】
　答えは4桁の数字になり、前2桁が時、後ろ2桁が分です。
　「プログラム言語」は「Text」選択のまま、解答欄に○○時○○分と記入して送信して下さい。
*/

public class Main {

	public static void main(String[] args) {
		boolean SpelC = false;
		int DoubleSpel = 0;
		int Count = 0;

		do{
			Count++;
//			System.out.print(Count + " ");

			if(SpelC){
				SpelC = false;
				if((Count % 5) == 0){
					DoubleSpel++;
//					System.out.println("/SpelP --- CountUp:" + DoubleSpel + " /Count:" + Count);
					continue;
					}
			}
			if((Count % 3) == 0){
//				System.out.println("/SpelC");
				SpelC = true;
				continue;
				}

//			if((Count % 5) == 0){
//				System.out.println("/SpelP");
//				continue;
//				}

//			System.out.println("---");
		}while(DoubleSpel < 360);

	int Hour = Count / 60;
	int Day  = Hour / 24;
	Hour = Hour % 24;

	int Minute = Count % 60;

	System.out.println("answer:" + Count + " /Day:" + Day + "/Hour:" + Hour + "/Minute:" + Minute);

	}

}
