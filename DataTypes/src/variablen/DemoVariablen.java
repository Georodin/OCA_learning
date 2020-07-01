package variablen;

public class DemoVariablen {
	
	public static void main(String[] args) {
		System.out.println("Hey");
		
        // display different numeric types
        System.out.println(Byte.TYPE);
        System.out.println(Byte.SIZE+" bit");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.TYPE);
        System.out.println(Short.SIZE+" bit");
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Character.TYPE);
        System.out.println(Character.SIZE+" bit");
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);

        System.out.println(Integer.TYPE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Float.TYPE);
        System.out.println(Float.SIZE+" bit");
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.TYPE);
        System.out.println(Double.SIZE+" bit");
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Long.TYPE);
        System.out.println(Long.SIZE+" bit");
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        
        //prefixes
        int dec = 110;            // no prefix   --> decimal literal
        int bin = 0b1101110;      // '0b' prefix --> binary literal
        int oct = 0156;           // '0' prefix  --> octal literal
        int hex = 0x6E;           // '0x' prefix --> hexadecimal literal
        
        System.out.println(dec+" "+bin+" "+oct+" "+hex);
	}
	
}
