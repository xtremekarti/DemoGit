package test.sample.selenium1;
public class Add{
	public static void main(String args[]){
		System.out.println("Welcome");
		int total=0;
String concat=" ";
		for(int i=0;i<args.length;i++){
			//System.out.println(arg);
			total = total + Integer.parseInt(args[i]);
			if(i<args.length-1)
				concat=concat+args[i] + "+";
			else
				concat=concat+args[i];

		}
		System.out.println(concat+ "="  +total);
	}
}
//Result = 102
//12+34+56 = 102
