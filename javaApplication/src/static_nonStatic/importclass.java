package static_nonStatic;

public class importclass {
	public static void main(String[] args) {
		try {
			Class.forName("static_nonStatic.importclass");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
