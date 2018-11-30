class TestException{
	public Object throwException(){
		return "throws Exception";
	}
	public void setExceptionType(String type) throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, CloneNotSupportedException, ClassNotFoundException{
		System.out.println("Exception type set to :"+type);
	}
	public void checkStackOverFlow() throws Exception{
		try{
			System.out.println("Stack 1");
			callStackOverFlow();
			throw new Exception();
		}catch(Exception e){
			System.out.println("handle @ check"+"\n\n"+e.getMessage());
			throw e;
		}
	}
	public void callStackOverFlow()throws Exception{
		try{
			System.out.println("Stack 2");
			checkStackOverFlow();
			throw new Exception();
		}catch(Exception e){
			System.out.println("handle @ check"+"\n\n"+e.getMessage());
			throw e;
		}
	}
}

public class Phase3Util extends TestException{
	public Object throwException(){
		return new String("This is an boolean type expection");
	}
	public void handleException(Object typeObject){
		System.out.println("The exception blocks successfully handles the exception"+typeObject);
	}

	public Object printStackTrace(){	
		System.out.println("This is custom defined Stack trace.");
		return null;
	}
	public static void main(String...params){
		TestException excep = new Phase3Util();
		Phase3Util phase = new Phase3Util();
		/*phase.handleException("object Type String");
		phase.printStackTrace();*/
		try{
			phase.checkStackOverFlow();
		}catch(Exception ex){
			System.out.println(ex.getMessage()+"\n\n\n"+"Handled the stackoverflow exception");
		}
	}
}
