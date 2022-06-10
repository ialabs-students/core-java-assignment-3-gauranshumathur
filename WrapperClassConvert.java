package assignmen_3;


public class WrapperClassConvert {

	public static void main(String[] args) {
		

			    
			    int a = 10;

			    convertToWrapper(a);
			    

	}

	private static void convertToWrapper(int a) {
		Integer aObj = Integer.valueOf(a);

	    if(aObj instanceof Integer) {
	      System.out.println(aObj);
	    }
		
	}

	}
