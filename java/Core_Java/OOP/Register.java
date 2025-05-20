
public class Register{
    /*Register(){

    }
    Register(String msg){
        super(msg);
    }
    public void checkAge(int age) throws Register {
        if (age < 18) {
            throw new Register("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
	}
  */  
    public static void main(String[] args) {
        //Register th = new Register();
        try {
            int a=10;
			System.out.println(a/0);
        } catch (ArithmeticException e) {
			
            System.out.println(e);
        }
		System.out.println("hii");
    }
}


