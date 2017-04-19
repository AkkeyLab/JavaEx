package lesson.chap14;

class ALesson {
	public static CoreClass q = new CoreClass("ジマイマ");
	public CoreClass r = new CoreClass("レベッカ");

	public static void main(String[] args) {
		CoreClass a = new CoreClass("ミトン");
		// a→"ミトン"
		CoreClass b = new CoreClass("トム");
		// b→"トム"
		CoreClass c = new CoreClass("モペット");
		// c→"モペット"
		SubClass[] arrayA = new SubClass[4];
		b = c;
		// "トム"はガーベッジ（※1）
		// b→"モペット"
		// c→"モペット"
		for (int i = 0; i < 4; i++) {
			arrayA[i] = new SubClass("犬" + i);
		}
		// arrayA[0]→"犬0"
		// arrayA[1]→"犬1"
		// arrayA[2]→"犬2"
		// arrayA[3]→"犬3"
		arrayA[3].friend = arrayA[3];
		// arrayA[3]→"犬3"
		// "犬3"のfriend→"犬3"
		arrayA[0] = arrayA[1];
		// "犬0"はガーベッジ（※2）
		// arrayA[0]→"犬1"
		// arrayA[1]→"犬1"
		c = arrayA[2];
		// b→"モペット"
		// arrayA[2]→"犬2"
		// c→"犬2"
		arrayA[1] = null;
		// arrayA[0]→"犬1"
		CoreClass d = arrayA[0];
		// arrayA[0]→"犬1"
		// d→"犬1"
		SubClass[] arrayB = new SubClass[4];
		arrayB[0] = new SubClass("フロプシー", new CoreClass("野ネズミ"));
		// arrayB[0]→"フロプシー"
		// "フロプシー"のfriend→"野ネズミ"
		arrayB[1] = new SubClass("モプシー", new CoreClass("ナトキン"));
		// arrayB[1]→"モプシー"
		// "モプシー"のfriend→"ナトキン"
		arrayB[2] = new SubClass("カトンテール", c);
		// arrayB[2]→"カトンテール"
		// arrayA[2]→"犬2";
		// c→"犬2";
		// "カトンテール"のfriend→"犬2"
		arrayB[3] = new SubClass("ピーター", new CoreClass("ベンジャミン"));
		// arrayB[3]→"ピーター"
		// "ピーター"のfriend→"ベンジャミン"
		arrayA = null; // ※注意B
						// d→"犬1"
						// c→"犬2"
						// "カトンテール"のfriend→"犬2"
						// "犬3"はガーベッジ（※3）
		arrayB[0].friend = null;
		// "野ネズミ"はガーベッジ（※4）
		arrayB[1] = null; // ※注意C
							// "モプシー"はガーベッジ（※5）
							// "ナトキン"もガーベッジ（※6）
		arrayB[2] = null;
		// "カトンテール"はガーベッジ（※7）
		// c→"犬2"
		SubClass e = new SubClass("ルーシー", new CoreClass("ティギー"));
		// e→"ルーシー"
		// e.friend→"ティギー"
		e = null;
		// CoreClass.last→"ルーシー" （※8）
		// "ルーシー"のfriend→"ティギー"
		// ※

		System.gc();
		println("a = " + a);
		println("b = " + b);
		println("c = " + c);
		println("d = " + d);
		println("e = " + e);
		println("arrayA = " + arrayA);
		println("arrayB[0] = " + arrayB[0]);
		println("arrayB[1] = " + arrayB[1]);
		println("arrayB[2] = " + arrayB[2]);
		println("arrayB[3] = " + arrayB[3]);
		println("CoreClass.last = " + CoreClass.last);
		println("GcQuiz.q = " + ALesson.q);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
