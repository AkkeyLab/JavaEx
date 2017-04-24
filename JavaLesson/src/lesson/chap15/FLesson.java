package lesson.chap15;

public class FLesson {
	Job[] jobs;

	public FLesson(int jobcount) {
		jobs = new Job[jobcount];
		for (int i = 0; i < jobcount; i++) {
			jobs[i] = new Job(i);
		}
	}

	public void workAllJobs() {
		for (int i = 0; i < jobs.length; i++) {
			jobs[i].work();
		}
	}

	public static void main(String[] args) {
		FLesson self = new FLesson(10);
		while (true) {
			self.workAllJobs();
		}
	}
}
