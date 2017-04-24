package lesson.chap15;

public class ELesson {
	public static void main(String[] args) {
		new Thread(new ThreadAsterisk2()).start();
		new Thread(new ThreadEqual2()).start();
	}
}
