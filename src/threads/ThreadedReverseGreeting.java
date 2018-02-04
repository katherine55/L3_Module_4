package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	public static void main(String[] args) {
		// ThreadedReverseGreeting gret = new ThreadedReverseGreeting();
		new Thread(() -> createThread(0)).start();

	}

	static void createThread(int x) {

		if (x >= 50) {

		} else {
			int n = 50-x;
			System.out.println("Hello from Thread " + n + "!");
			
			new Thread(() -> createThread(x + 1)).start();

			try {
				Thread.currentThread().join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
