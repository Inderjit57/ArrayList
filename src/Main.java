import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TfsaAccount account = new TfsaAccount();
		
		account.setTFSAAccount("Inderjit", 100);
		
		ArrayList<TfsaAccount> arrayList = new ArrayList<TfsaAccount>();
		
		arrayList.add(account);
		
		System.out.println(arrayList.toString());
	}

}
