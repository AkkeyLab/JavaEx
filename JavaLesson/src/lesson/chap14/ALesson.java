package lesson.chap14;

class ALesson {

  public static CoreClass q = new CoreClass(Messages.getString("ALesson.0")); //$NON-NLS-1$
  public CoreClass r = new CoreClass(Messages.getString("ALesson.1")); //$NON-NLS-1$

  public static void main(String[] args) {
    // 以下実行結果
    /*
     * [ミトン]が生まれました [トム]が生まれました [モペット]が生まれました
     */
    CoreClass a = new CoreClass(Messages.getString("ALesson.2")); //$NON-NLS-1$
    CoreClass b = new CoreClass(Messages.getString("ALesson.3")); //$NON-NLS-1$
    CoreClass c = new CoreClass(Messages.getString("ALesson.4")); //$NON-NLS-1$

    SubClass[] arrayA = new SubClass[4];
    b = c;

    // 以下実行結果
    /*
     * [犬0, null]が生まれました [犬1, null]が生まれました [犬2, null]が生まれました [犬3,
     * null]が生まれました
     */
    for (int i = 0; i < arrayA.length; i++) {
      // 継承元のコンストラクタを使用
      arrayA[i] = new SubClass(Messages.getString("ALesson.5") + i); //$NON-NLS-1$
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
    println(Messages.getString("ALesson.6")); //$NON-NLS-1$
    arrayB[0] = new SubClass(Messages.getString("ALesson.7"), new CoreClass(Messages.getString("ALesson.8"))); //$NON-NLS-1$ //$NON-NLS-2$
    println(Messages.getString("ALesson.9")); //$NON-NLS-1$
    arrayB[1] = new SubClass(Messages.getString("ALesson.10"), new CoreClass(Messages.getString("ALesson.11"))); //$NON-NLS-1$ //$NON-NLS-2$
    println(Messages.getString("ALesson.12")); //$NON-NLS-1$
    arrayB[2] = new SubClass(Messages.getString("ALesson.13"), c); //$NON-NLS-1$
    println(Messages.getString("ALesson.14")); //$NON-NLS-1$
    arrayB[3] = new SubClass(Messages.getString("ALesson.15"), new CoreClass(Messages.getString("ALesson.16"))); //$NON-NLS-1$ //$NON-NLS-2$
    println(Messages.getString("ALesson.17")); //$NON-NLS-1$

    arrayA = null;
    arrayB[0].friend = null;
    arrayB[1] = null;
    arrayB[2] = null;

    // 以下実行結果
    /*
     * [ティギー]が生まれました [ルーシー, null]が生まれました
     */
    SubClass e = new SubClass(Messages.getString("ALesson.18"), new CoreClass(Messages.getString("ALesson.19"))); //$NON-NLS-1$ //$NON-NLS-2$

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
    println(Messages.getString("ALesson.20") + a); //$NON-NLS-1$
    println(Messages.getString("ALesson.21") + b); //$NON-NLS-1$
    println(Messages.getString("ALesson.22") + c); //$NON-NLS-1$
    println(Messages.getString("ALesson.23") + d); //$NON-NLS-1$
    println(Messages.getString("ALesson.24") + e); //$NON-NLS-1$
    // 以下実行結果
    // arrayAがnullになるのは64行目でアクセス先をnullにされてしまったから
    // 65行目でarray[0]のfriendをnullにしているのでnullと出力されている
    // arrayBの1と2は66,67行目でアクセス先をnullにされてしまったからnull
    /*
     * arrayA = null arrayB[0] = [フロプシー, null] arrayB[1] = null arrayB[2] =
     * null arrayB[3] = [ピーター, [ベンジャミン]]
     */
    println(Messages.getString("ALesson.25") + arrayA); //$NON-NLS-1$
    println(Messages.getString("ALesson.26") + arrayB[0]); //$NON-NLS-1$
    println(Messages.getString("ALesson.27") + arrayB[1]); //$NON-NLS-1$
    println(Messages.getString("ALesson.28") + arrayB[2]); //$NON-NLS-1$
    println(Messages.getString("ALesson.29") + arrayB[3]); //$NON-NLS-1$
    // 以下実行結果
    // lastが更新されるのはCoreClassもしくは、それを継承したインスタンスが作成されたとき
    // だから、74行目の生成が反映されている
    // フィールドのstatic変数はこのクラスがオブジェクト化するとき、つまりmain実行よりも先に一度だけ実行されている
    /*
     * CoreClass.last = [ルーシー, [ティギー]] GcQuiz.q = [ジマイマ]
     */
    println(Messages.getString("ALesson.30") + CoreClass.last); //$NON-NLS-1$
    println(Messages.getString("ALesson.31") + ALesson.q); //$NON-NLS-1$
  }

  // 文字出力が簡単にできるメソッド
  public static void println(String s) {
    System.out.println(s);
  }
}
