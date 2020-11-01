package shiftHyou;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// 引数が1つ以外は例外スロー
		if (args.length != 1) {
			throw new IllegalArgumentException();
		}

		Integer targetTerm = Integer.parseInt(args[0]);

		if (targetTerm < 1) {
			throw new IllegalArgumentException();
		}

		if (targetTerm == 1) {
			System.out.println(2);
		} else {
			// 00:N 01:R 10:L
			// N…N / R
			// R…L
			// L…N / R

			ArrayList<String> element = new ArrayList<String>();
			element.add("N");
			element.add("R");
			element.add("L");

//			if (targetTerm > 2) {
				for (int i = 1; i < targetTerm -1  ; i++) {
					ArrayList<String> elementTemp = new ArrayList<String>();
					for (Iterator<String> iterator = element.iterator(); iterator.hasNext();) {
						//末尾取り出し
						String string = (String) iterator.next();

						//System.out.println(string);
						switch (string.substring(string.length()-1,string.length() )) {
						case "N":
							elementTemp.add(string + "N");
							elementTemp.add(string + "R");
							break;
						case "R":
							elementTemp.add(string + "L");
							break;
						case "L":
							elementTemp.add(string + "N");
							elementTemp.add(string + "R");
							break;
						default:
							break;
						}
					}
					element = elementTemp;
				}
//			}
			for (Iterator<String> iterator = element.iterator(); iterator.hasNext();) {
				System.out.println( (String) iterator.next());
			}

			System.out.println(element.size());
		}

	}

}
