package lesson.chap10;

public class GamePlayer {
	public String playername;
	// このように、staticで宣言した場合、新しくオブジェクト（インスタンス）を作成しても、すべてのオブジェクトで値が共有される
	public static String commonName;

	public GamePlayer(String name, String common) {
		playername = name;
		commonName = common;
	}

	@Override
	public String toString() {
		return "[player:" + playername + "] [common:" + commonName + "]";
	}
}
