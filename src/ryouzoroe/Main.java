package ryouzoroe;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 そこで、単語間にあるスペースを調整することで、両端を揃えることを考えます。
例えば、ノーベル賞で話題になったマララさんのスピーチの一部を使って、両端揃えを試してみましょう。
※等幅フォントで表示するものとし、最後の行は左揃えでよいものとします。


以下が対象となる文章です。


    One child, one teacher, one book and one pen can change the world. Education is the only solution. Education first.

これを、横30文字で整形してみましょう。

One child,  one  teacher,  one
book and one  pen  can  change
the world.  Education  is  the
only    solution.    Education
first.


横40文字の場合は、以下のように整形できます。

One child, one teacher, one book and one
pen can change the world.  Education  is
the only solution. Education first.

実行時の引数として一行の文字数を指定し、その文字数で両端揃えを行った結果を出力するプログラムを作成してください。
※指定される文字数は、文中にある最長の単語の長さよりも大きい値とします。
※処理する文章は固定で、プログラムの定数にセットするものとします。


間隔を調整するスペースは単語間に入れるものとし、追加するスペースは可能な限り均等に配置するものとします。
（追加する数が均等にならない場合は、上記の例のように右側のスペースを多く配置します。）
単語に接している記号を含めて一つの単語とみなします。

【解答方法】
解答用ファイルanswer_q1569.txtをダウンロードしてください。
解答は解答用ファイル（answer_q1569.txt）に記入していただきます。
必須事項がすべて記入されていることをご確認いただいた後、
テキストファイルのままアップロードしてください。
 */

public class Main {

	public static void main(String[] args) {

		//引数が1つ以外は例外スロー
		if (args.length != 1){
			  throw new IllegalArgumentException();
			  }

		  Integer targetLength = Integer.parseInt( args[0]);
		  String sourceString = "One child, one teacher, one book and one pen can change the world. Education is the only solution. Education first.";

		  //配列へ
		  ArrayList<String> element = funcSplit(sourceString);

		  Integer LineCount = 0;
		  Integer wordCount = 0;

		  do{
			  StringBuilder sb = new StringBuilder();
			  Integer wordLength = 0;
			  LineCount++;

			  do{
				  //文字の取り出し、文字数add
				  String addStr =element.get(wordCount);
				  wordLength = wordLength + addStr.length();

				  //文字数オーバ？
				  if(wordLength>targetLength){
					  wordLength = wordLength - element.get(wordCount).length();
					  //1文字も格納できないときは例外スロー
					  if(wordLength<1){
						  throw new IllegalArgumentException();
					  }
					  break;
				  }

				  //sbにadd
				  sb.append(addStr);
				  //語数更新
				  wordCount++;
				  if(wordCount > element.size() - 1 ){
					  break;
				  }
				  //ちょうどなら抜ける
				  if(wordLength==targetLength){break;}

				  //空白相当分
				  wordLength++;
				  //ちょうどなら抜ける
				  if(wordLength==targetLength){break;}
				  sb.append(" ");
			  }while(true);

			  //出力された1行分を再分析
			  String resultLine = new String(sb).trim();
			  wordLength = resultLine.length();
			  Integer brankCount = 0;
			  for (int i = 0; i < wordLength; i++) {
				  if(resultLine.charAt(i) == ' '){
					  brankCount++;
				  }
			}

			  //調整
			  if(wordCount<element.size()){
				  //最終行以外は調整必要行として再構築
				  Integer controlBrank = targetLength - wordLength;
				  Integer flatBrank = 0;
				  Integer modBrank = 0;
				  //1語だけの時は空白調整無し
				  if(brankCount>0){
					  flatBrank = controlBrank / brankCount;
					  modBrank =   controlBrank % brankCount;
				  }
				  ArrayList<String> ctlElement = funcSplit(resultLine);
				  StringBuilder outSb = new StringBuilder();

				  //空白追加
				  for (int i = 0; i < ctlElement.size(); i++) {
					outSb.append(ctlElement.get(i));
					outSb.append(" ");
					  for (int j = 0; j < flatBrank; j++) {
						  outSb.append(" ");
					}
					  if(i>=(brankCount - modBrank)){
						  outSb.append(" ");
					  }
				}
				  //標準出力へ
				  System.out.println(new String(outSb).trim());
			  }else{
				  //最終行は調整不要としてはそのまま出力してループを抜ける
				  System.out.print(resultLine);
				  break;
			  }
		  }while(true);
	}

	//入れ替え用関数
	private static ArrayList<String> funcSplit(String sourceString)
	{
		ArrayList<String> element = new ArrayList<String>();

		//spaceで分割して配列へ
		StringTokenizer st;
        st = new StringTokenizer(sourceString, " ");
        while (st.hasMoreTokens()) {
      	  element.add(st.nextToken());
        }

		return element;
	}

}
