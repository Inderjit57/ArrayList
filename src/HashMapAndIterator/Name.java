package HashMapAndIterator;

public class Name extends Thread {
	String name;

	public Name(String name) {
		super();
		this.name = name;
	}

//	public String getName() {
//		return name;
//	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
	}
	

}
