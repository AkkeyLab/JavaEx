package lesson.chap10;

/**
 * @author akkey
 * @version $Revision$, May 7, 2017
 */
public class Data {
	int x, y, z;

	static void setData(Data obj, int x, int y, int z) {
		// staticメソッドの場合、データの保持が行われるため、thisと言えない
		// なので、以下のコードはエラーとなる
		// this.x = x;

		// 改善策としては、引数に対象のオブジェクト（インスタンス）を渡してあげて、そこから参照する方法がある
		obj.x = x;
		obj.y = y;
		obj.z = z;
		// 使い方は以下のような感じ
		/*
		 * Data user = new Data(); user.setData(user, 1, 2, 3);
		 */
	}

}
