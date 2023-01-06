package test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+args[0]+". Your second name is:"+args[1]);
	}

	public String getName(String in) {
		assert(in!=null);
		if(in.length()!=0) return in;
		else return "David";
	}
}
