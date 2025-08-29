
public class JavaStringMethodsEx {
	String s1= "   Java full stack  ";
	String s2= "Java full stack";
	String s3= "JAVA FULL STACK";
	String s4= "Java full stack";
	String s5= "";
	
	
    public static void main(String args[]) {
    	JavaStringMethodsEx obj = new JavaStringMethodsEx();
    	System.out.println(obj.s1.toUpperCase());
    	System.out.println(obj.s3.toLowerCase());
    	System.out.println(obj.s1.equals(obj.s2));
    	System.out.println(obj.s2.equals(obj.s4));
    	System.out.println(obj.s1.length());
    	System.out.println(obj.s1.charAt(0));
    	System.out.println(obj.s1.replace("Java","python"));
    	System.out.println(obj.s1.trim());
    	System.out.println(obj.s1.startsWith("J"));
    	System.out.println(obj.s1.startsWith("k"));
    	System.out.println(obj.s2.endsWith("k"));
    	System.out.println(obj.s2.endsWith("j"));
    	System.out.println(obj.s1.length());
    	System.out.println(obj.s1.concat(" is a high level language"));
    	System.out.println(obj.s1.contains("Java"));
    	System.out.println(obj.s1.equalsIgnoreCase(obj.s3));
    	System.out.println(obj.s2.equalsIgnoreCase(obj.s4));
    	System.out.println(obj.s1.isEmpty());
    	System.out.println(obj.s5.isEmpty());
    			
    }
	

}
