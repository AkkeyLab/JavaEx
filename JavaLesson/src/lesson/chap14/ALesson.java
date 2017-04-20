package lesson.chap14;

class ALesson {
	public static CoreClass q = new CoreClass("ジマイマ");
	public CoreClass r = new CoreClass("レベッカ");

	public static void main(String[] args) {
		// 以下実行結果
		/*
		 * [ミトン]が生まれました [トム]が生まれました [モペット]が生まれました
		 */
		CoreClass a = new CoreClass("ミトン");
		CoreClass b = new CoreClass("トム");
		CoreClass c = new CoreClass("モペット");

		SubClass[] arrayA = new SubClass[4];
		b = c;

		// 以下実行結果
		/*
		 * [犬0, null]が生まれました [犬1, null]が生まれました [犬2, null]が生まれました [犬3,
		 * null]が生まれました
		 */
		for (int i = 0; i < arrayA.length; i++) {
			// 継承元のコンストラクタを使用
			arrayA[i] = new SubClass("犬" + i);
		}

		arrayA[3].friend = arrayA[3];
		arrayA[0] = arrayA[1];
		c = arrayA[2];
		arrayA[1] = null;
		CoreClass d = arrayA[0];

		// 以下実行結果
		// ここで、SubClassの第二引数がすべてnullになっている理由がわかるだろうか
		// 実行順として、まずは第二引数に渡されているインスタンスの作成
		// 次には、SubClassのインスタンスが作成されるわけだが、継承元のCoreClassから実行されていく
		// つまり、「〜が生まれました」は継承元で出力されるものであり、SubClassで新たに加わったfriendを扱うための初期化処理前の結果なのだ
		/*
		 * [野ネズミ]が生まれました [フロプシー, null]が生まれました [ナトキン]が生まれました [モプシー, null]が生まれました
		 * [カトンテール, null]が生まれました [ベンジャミン]が生まれました [ピーター, null]が生まれました
		 */
		SubClass[] arrayB = new SubClass[4];
		println("-----");
		arrayB[0] = new SubClass("フロプシー", new CoreClass("野ネズミ"));
		println("-----");
		arrayB[1] = new SubClass("モプシー", new CoreClass("ナトキン"));
		println("-----");
		arrayB[2] = new SubClass("カトンテール", c);
		println("-----");
		arrayB[3] = new SubClass("ピーター", new CoreClass("ベンジャミン"));
		println("-----");

		arrayA = null;
		arrayB[0].friend = null;
		arrayB[1] = null;
		arrayB[2] = null;

		// 以下実行結果
		/*
		 * [ティギー]が生まれました [ルーシー, null]が生まれました
		 */
		SubClass e = new SubClass("ルーシー", new CoreClass("ティギー"));

		e = null;

		System.gc();
		// 以下実行結果
		// 19行目でbからcにアクセスするようにしているため、bの出力が変わっている
		// 35行目でcから犬2へのアクセスに変更しているため、cの出力が変わっている
		// 37行目で生成とともにdが犬0にアクセスできるようになってる。しかし、出力は1に…
		// なぜなら、34行目で犬1へのアクセスに変更しているからである
		// eは生成直後にアクセス先をnullにされてしまってる
		/*
		 * a = [ミトン] b = [モペット] c = [犬2, null] d = [犬1, null] e = null
		 */
		println("a = " + a);
		println("b = " + b);
		println("c = " + c);
		println("d = " + d);
		println("e = " + e);
		// 以下実行結果
		// arrayAがnullになるのは64行目でアクセス先をnullにされてしまったから
		// 65行目でarray[0]のfriendをnullにしているのでnullと出力されている
		// arrayBの1と2は66,67行目でアクセス先をnullにされてしまったからnull
		/*
		 * arrayA = null arrayB[0] = [フロプシー, null] arrayB[1] = null arrayB[2] =
		 * null arrayB[3] = [ピーター, [ベンジャミン]]
		 */
		println("arrayA = " + arrayA);
		println("arrayB[0] = " + arrayB[0]);
		println("arrayB[1] = " + arrayB[1]);
		println("arrayB[2] = " + arrayB[2]);
		println("arrayB[3] = " + arrayB[3]);
		// 以下実行結果
		// lastが更新されるのはCoreClassもしくは、それを継承したインスタンスが作成されたとき
		// だから、74行目の生成が反映されている
		// フィールドのstatic変数はこのクラスがオブジェクト化するとき、つまりmain実行よりも先に一度だけ実行されている
		/*
		 * CoreClass.last = [ルーシー, [ティギー]] GcQuiz.q = [ジマイマ]
		 */
		println("CoreClass.last = " + CoreClass.last);
		println("GcQuiz.q = " + ALesson.q);
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
