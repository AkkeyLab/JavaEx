package lesson.chap10;

public class GamePlayer {
	public String playername;
	// このように、staticで宣言した場合、新しくオブジェクト（インスタンス）を作成しても、すべてのオブジェクトで値が共有される
	public static String commonName;
	
	/* 実行結果
	   [player:Mad Hatter] [common:Itaya]
	   [player:March Hare] [common:Itaya]
	   [player:Alice] [common:Itaya]
	   
	   インスタンスが異なるにも関わらず、staticで宣言していた変数の値が共有されているのがわかる
	 */

	public GamePlayer(String name, String common) {
		playername = name;
		commonName = common;
	}

	@Override
	public String toString() {
		return "[player:" + playername + "] [common:" + commonName + "]";
	}

	public static void main(String[] args) {
		GamePlayer[] player = new GamePlayer[3];
		player[0] = new GamePlayer("Mad Hatter", "Akkey");
		player[1] = new GamePlayer("March Hare", "Akio");
		player[2] = new GamePlayer("Alice", "Itaya");
		for (int i = 0; i < player.length; i++) {
			println("" + player[i]);
		}
	}

	// 文字出力が簡単にできるメソッド
	public static void println(String s) {
		System.out.println(s);
	}
}
