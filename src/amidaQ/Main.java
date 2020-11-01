package amidaQ;

/*
あみだくじの当たりの判定を行いたい。
そのために、どこからスタートするとどこにたどり着くかを判断するロジックを組み立てたい。

縦棒が４本の時には、横棒のおける箇所は３箇所になる。
上から順に、横棒をおいている箇所を１、そうでない箇所を０とするCSVデータを読み込み、
左から順にどの棒にたどり着くかを判断して欲しい。（言語不問）

図の例は、縦棒が左から順に４本ある。
左から1番目の棒をたどると３番目に着地する。
左から2番目の棒をたどると１番目に着地する。
これを繰り返していって、
3,1,2,4
という答えを出すプログラムを作りたい。

あみだの横棒の並びは、上の図では、以下のようなCSVデータが標準入力から渡される。
1,0,0
0,1,0
0,0,1
0,0,1
これに対して、
3,1,2,4
を標準出力に出力するようなプログラムを作って欲しい。


縦棒と横棒ともに最大は50です
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//
		boolean check = false;
		Integer lineCount = 0;

		//データの取込み
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> element = new ArrayList<String>();

		while (scanner.hasNextLine()) {
			String s = scanner.nextLine();
			//空のデータがあったら終了にする（対話型の時）
			if (s.length() == 0)
				break;
			element.add("0" + s.replace(",","") + "0");
			check = true;
		}
		scanner.close();

		if(!check){
			throw new IllegalArgumentException();
		}

		ArrayList<Integer> lines = new ArrayList<Integer>();
		lineCount = element.get(0).length() - 1;

		for(int i=1; i<=lineCount; i++){
			lines.add(i);
			//System.out.print("[" + i + "]");
		}
		//System.out.println("…初期値:lineCount=" + lineCount);

		for (int i = 0; i < element.size(); i++) {
			//System.out.println(element.get(i));

			for (int j = 0; j < lineCount; j++) {
				switch(element.get(i).substring(j,j+2)){
				case "00"://System.out.print("[*]");
					break;
				case "01"://System.out.print("[+]");
					//swap
					Integer tempA = lines.get(j);
					Integer tempB = lines.get(j + 1);
					lines.set(j, tempB);
					lines.set(j+1, tempA);
					break;
				case "10"://System.out.print("[-]");
					break;
				default:
					throw new IllegalArgumentException();
				}
			}

//			for(int j=0; j<lineCount; j++){
//				Integer temp = lines.get(j);
//				System.out.print("[" + temp + "]");
//			}
//			System.out.println("…Count" + i);
		}

		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < lineCount; j++) {
				if((i+1)==lines.get(j)){
					System.out.print(j+1);
					if((i+1)!=lineCount){
						System.out.print(",");
					}
					break;
				}
			}
		}
	}

}
