
public class SubNested {

    public static void main(String[] args) {
        String test= "Test String";
		
		for (int i=0; i<10;i++) {
			if(i == 1) {
				test = i.toString();
				break;
			}
		}
		
		HelloWorld(test);
    }
	
	public static String helloWorld(String text){
		
		return "Hello" + text;
	}
}
