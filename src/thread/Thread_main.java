package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run th[] = new Thread_run[6];
		Thread_runnable th2[] = new Thread_runnable[6];

		for(int i=0;i<6;i++) {
			th[i]=new Thread_run();
			th[i].start();
			th2[i]=new Thread_runnable();
			th2[i].run();
			try {
				th[i].join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			for(int j=0;j<10;j++) {
				System.out.println("main‚©‚ço—Í : "+j);
			}
		}
		
		
	}

}
