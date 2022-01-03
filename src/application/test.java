package application;

public class test {
    public static void main(String[] args) {
    	String text = "one (1), two (2), three (3)";
    	
    	
    	String[] split = text.split("[a-z]+|[()0-9]+");
    	
    	
    	for(int i = 0; i < split.length; i++) {
        	System.out.println(split[i]);

    	}
    }
}


