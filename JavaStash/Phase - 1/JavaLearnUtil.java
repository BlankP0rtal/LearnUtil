import java.util.*;
import java.lang.Runtime.*;

/*	Learn util stage - 1 */

interface bottle{
	void open();
	void close();
}

class Granade{
	JavaLearnUtil testObj;
	static long block1Count;
	static long block2Count;

	public Granade(){
		System.out.println("pins are ready to set off!! :D!!");
	}

	{
		block1Count++;
		System.out.println(block1Count+"\t=> Checking the Granade => \npw - "+this.powerLevel+"\tACTP - "+this.activatePin+"\tTAS - "+this.triggerActionStatus);
		if(block1Count < 4544) //recursion - termination block. 
			new Granade();	// causes recursive, due to the instance-initializer block;
		--block1Count;
		System.out.println("call-backs... release => "+block1Count);
	}

	private int powerLevel;
	private String activatePin;
	private String triggerActionStatus; 
	private final int gPin = 2351;

	{	
		block2Count++;
		System.out.println(block2Count+"\t=> Checking - 2, the Granade => \npw - "+powerLevel+"\tACTP - "+activatePin+"\tTAS - "+triggerActionStatus);
		//System.out.println("pins are ready to set off!! :D!!");
	}

	void swap(Granade swapObj) {
		Granade buff = new Granade();
		buff.testObj = swapObj.testObj;
		swapObj.testObj = this.testObj;
		this.testObj = buff.testObj;
	}

	public Granade setPowerLevel(int level){
		powerLevel = level;
		System.out.println("PowerLevel set");
		return this;
	}

	public Granade setActivatePin(String pin){
		activatePin = pin;
		System.out.println("pin set");
		return this;
	}

	public Granade setTriggerActionStatus(String actionStatus){
		triggerActionStatus = actionStatus;
		System.out.println("actionStatus set");
		return this;
	}

}


public class JavaLearnUtil extends LearnFinal{


	String s = "newTypeInstanciated !";
	Integer k;

	JavaLearnUtil(){
		//super();
	}	
	/*{
		System.out.print("Overrided ctor is called ;) ");
	}*/

	public void testRef(JavaLearnUtil s1, JavaLearnUtil s2) {
		s1.s = "sdfsdfsdfdf";
		System.out.println(s1.toString()+ " testRef=> " + s2.toString());
		System.out.println(s1.s.toString()+ " => "+ s1.k.toString() + "\n"+ s2.s.toString() +"=>" + s2.k.toString());
	}

	public void print(){
		System.out.println("str => "+s+"\tn => "+k);
	}

	public void testBuilderPatter(){
		Granade rdx = new Granade();
		rdx.setPowerLevel(255).setActivatePin("x%^23").setTriggerActionStatus("pinned");
	}

	@Override
	public void defineUseOfFinal(){
		System.out.print("hey, told yeah, can override ;P");
	}

	public static void main(String[] strs) throws Exception {
		//JavaLearnUtil obj1 = new JavaLearnUtil();
		//JavaLearnUtil obj2 = new JavaLearnUtil();

		System.out.println(T+" "+(int)T);
		//obj1.defineUseOfFinal();

		//obj1.testBuilderPatter();

		/* To swap inner object of a class, swap using wrapper class ;)
			Granade rdx = new Granade(), rdx2 = new Granade();

			obj1.s = "am 1";
			obj1.k = 1;

			obj2.s = "am 2";
			obj2.k = 2;
			
			rdx.testObj = obj1;
			rdx2.testObj = obj2;

			rdx.testObj.print();
			rdx2.testObj.print();

			rdx.swap(rdx2);

			rdx.testObj.print();
			rdx2.testObj.print();

		*/

		/*
			bottle b1 = new bottle(){
				public void open(){
					System.out.println("bottle is opened now!!");
				}
				public void close(){
					System.out.println("bottle is closed now!!");
				}
			};
			b1.open();
			b1.close();Interface [Anonymous]
		*/

		/*JavaLearnUtil s1 = new JavaLearnUtil() , s2 = new JavaLearnUtil();
			s1.s = "changed seq";
			s1.k = 1;
			s2.s = "changed twice";
			s2.k = 2;
			new JavaLearnUtil().testRef(s1,s2);
			System.out.println(s1.toString()+ " main=> " + s2.toString());
			System.out.println(s1.s.toString()+ " => "+ s1.k.toString() + "\n"+ s2.s.toString() +"=>" + s2.k.toString());
		*/
		
	}

}


class LearnFinal{
	final Granade rdx;
	LearnFinal(){
		rdx = new Granade();
		/* 
			Runtime.getRuntime().gc();
			rdx = null;  -> Gives Error.
		*/
	}
	LearnFinal(String type) {
		rdx = new Granade();
		System.out.println(type);
	}
	LearnFinal(Granade rdx){
		this.rdx = rdx;
		//System.out.print(runtime.toString());
	}
	public class internalPublic{
		String type;	
	}
	void defineUseOfFinal(){

	}
}


//heap: java -XX:+PrintFlagsFinal -version | grep -iE 'heapsize|permsize|threadstacksize'


/* Binding concept
	public class JavaLearnUtil{
		static void getStatus(){
			System.out.println("push status to LearnUtil");
		}
		public static void main(String[] params){
			JavaLearnUtil test1 = new JavaLearnUtil();
			JavaLearnUtil test2 = new TestBinding();
			test1.getStatus();
			test2.getStatus();
		}
	}
		

	class TestBinding extends JavaLearnUtil{
		@Override
		static void getStatus(){
			System.out.println("push status to TestBind");
		}
	}
*/