import java.util.*;
import java.lang.annotation.*;

class MutableTest {
	private  String str;

	public void setString(String str){
		this.str = str;
	}

	public String getAddressOfStr(){
		return (Integer.toHexString(this.str.hashCode())).toString();
	}
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Lock{
	boolean lockStatus() default false;
}


@Lock(lockStatus=true)
class TestLock{
	private boolean object;
	boolean lockStatus(){
		this.object = false;
		System.out.println("Calls TestLock");
		return this.object;
	}

	void checkScope(){
		TestLock test = new TestLock(){
			@Override
			boolean lockStatus(){
				System.out.println("Calls anonymous");
				return false;
			}
		};
		test.lockStatus();
		System.out.println(test.lockStatus());
	}
}


/*class CustomIterator<T>{
	private T type;
	int counter;
	int SIZE;
	public CustomIterator(){
		this.type = type;
		//SIZE = type.length();
	}
	boolean hasNext(){
		return counter < SIZE ? true : false;
	}
	T getNext(){
		if(this.hasNext())
			return type[counter++];
		return null;
	}
}*/


class Generics{
	/*Set<String> trySet(Set<String> unionSet){
 		Set<String> newSet = new <String>();
 		return newSet;
	}*/

	TreeSet<String> trySet(TreeSet<String> set){
		set.add("random");
		set.add("random");
		set.add("null");
		set.add("@#4234");
		Iterator it = set.iterator();

		Set typeSet = set;

		System.out.println("print set -> \n"+typeSet+"\n");

		set.forEach(i -> {
			System.out.println(i);
		});

		return set;
	}

	List<String> tryList(List<String> strLst){
		System.out.println("List----\n\n");
		List<String> newStrLst = new ArrayList<String>();
		newStrLst.add("few");
		newStrLst.add("bad");
		newStrLst.add("super");
		newStrLst.addAll(strLst);

		ListIterator<String> it = newStrLst.listIterator();

		System.out.println("normal iteration - "+newStrLst.hashCode());
		for(int i=0; i < newStrLst.size(); i++)
			System.out.println(newStrLst.get(i)+ " -> "+newStrLst.get(i).hashCode());

		System.out.println();

		System.out.println("foreach iteration <>:<> - "+newStrLst.hashCode());
		for(String s : newStrLst){
			System.out.println(s+ " -> "+s.hashCode());
		}

		System.out.println();

		System.out.println("iterator "+newStrLst.hashCode()+" => "+it.hashCode());
		it.next();
		it.set("current changed");
		it = newStrLst.listIterator();
		System.out.println("update -> "+newStrLst.hashCode()+" => "+it.hashCode());
		while(it.hasNext()){
			System.out.println(it.next().hashCode());
			it.set("current changed");
		}
		System.out.println("Next----"+newStrLst.hashCode()+" => "+it.hashCode());
		it = newStrLst.listIterator();
		System.out.println("changed : "+newStrLst.hashCode()+" => "+it.hashCode());
		while(it.hasNext()){
			System.out.println(it.next().hashCode());
			it.set("current changed");
		}

		System.out.println();
		newStrLst.set(0,"finally back");

		System.out.println("forEach() -> () "+newStrLst.hashCode()+" => "+it.hashCode());
		newStrLst.forEach(str ->{
			System.out.println(str+" -> "+str.hashCode());
		});

		System.out.println();
		it.add("newStrLst");
		return newStrLst;
	}

	HashMap<String, String> tryMap(Map<String, String> map){
		System.out.println("map");
		String Null = null;
		map.put(null,null);
		map.put("12","Sdfsdf");
		map.put("1","sdssd");
		map.put("ww",null);
		map.put("1234",null);
		map.put("112",Null);
		map.put("12",Null);
		map.put("112",Null);
		map.put("2",Null);
		map.forEach((i,j) -> {
			System.out.println(i + " : " + j);
		});
		return (HashMap<String,String>)map;
	}

	Hashtable<String, String> tryHtable(Hashtable<String, String> ht){
		System.out.println("HTable");
		String Null = null;
		ht.put("null","null");
		ht.put("123","12");
		ht.put("123","2424");
		
		for(Map.Entry<String,String> kv : ht.entrySet())
			System.out.println(kv.getKey()+" : "+kv.getValue());
		return ht;
	}
}


class Display{
	public void display(ArrayList<Object> lst){
		lst.forEach(str -> {
			System.out.println(str);
		});
	}
}


class StringToken{

	private String string;


	public void setString(String string) {
		this.string = string;
	}

	public String toTokendString(ArrayList<String> strLst){
		String res="";
		for(int i=0; i < strLst.size() - 1; i++)
			res += strLst.get(i)+", ";
		res += strLst.get(strLst.size() - 1);
		return res;
	}

	public  ArrayList<String>getTheUnion(String string){
		StringTokenizer str1=null,str2=null;
		//Compare two List of strings and get the common string among them.

		//Add iterators and then lambda expressions.
		
		ArrayList<String> resString = new ArrayList<>();
		
		str2 = new StringTokenizer(this.string, ", ");
		str1 = new StringTokenizer(string, ", ");
		
		int i =1;
		while(str2.hasMoreTokens()){
			String buff = str2.nextToken();
			StringTokenizer bufferTokens = new StringTokenizer(string, ", ");
			while(bufferTokens.hasMoreTokens() ){
				String s = bufferTokens.nextToken();
				if(buff.equals(s)){
					resString.add(buff);
					break;
				}
			}
		}
		return resString;
	}

	public ArrayList<String> toList(String string){
		StringTokenizer strtok = new StringTokenizer(string,", ");
		ArrayList<String> strLst = new ArrayList<>();
		while(strtok.hasMoreTokens())
			strLst.add(strtok.nextToken());
		return strLst;
	}
}



public class Test{

	public class Nested{
		public void eggStatus(){

		}
	}

	public void testStringToken(){
		StringToken strTok = new StringToken();

		String string1 = "AclNotFoundException, ActivationException, AlreadyBoundException, ApplicationException, AWTException, BackingStoreException, BadAttributeValueExpException, BadBinaryOpValueExpException, BadLocationException, BadStringOperationException, BrokenBarrierException, CertificateException, CloneNotSupportedException, DataFormatException, DatatypeConfigurationException, DestroyFailedException, ExecutionException, ExpandVetoException, FontFormatException, GeneralSecurityException, GSSException, IllegalClassFormatException, InterruptedException, IntrospectionException, InvalidApplicationException, InvalidMidiDataException, InvalidPreferencesFormatException, InvalidTargetObjectTypeException, IOException, JAXBException, JMException, KeySelectorException, LastOwnerException, LineUnavailableException, MarshalException, MidiUnavailableException, MimeTypeParseException, MimeTypeParseException, NamingException, NoninvertibleTransformException, NotBoundException, NotOwnerException, ParseException, ParserConfigurationException, PrinterException, PrintException, PrivilegedActionException, PropertyVetoException, ReflectiveOperationException, RefreshFailedException, RemarshalException, RuntimeException, SAXException, ScriptException, ServerNotActiveException, SOAPException, SQLException, TimeoutException, TooManyListenersException, TransformerException, TransformException, UnmodifiableClassException, UnsupportedAudioFileException, UnsupportedCallbackException, UnsupportedFlavorException, UnsupportedLookAndFeelException, URIReferenceException, URISyntaxException, UserException, XAException, XMLParseException, XMLSignatureException, XMLStreamException, XPathException";
		String string2 = "AnnotationTypeMismatchException, ArithmeticException, ArrayStoreException, BufferOverflowException, BufferUnderflowException, CannotRedoException, CannotUndoException, ClassCastException, CMMException, ConcurrentModificationException, DataBindingException, DOMException, EmptyStackException, EnumConstantNotPresentException, EventException, FileSystemAlreadyExistsException, FileSystemNotFoundException, IllegalArgumentException, IllegalMonitorStateException, IllegalPathStateException, IllegalStateException, IllformedLocaleException, ImagingOpException, IncompleteAnnotationException, IndexOutOfBoundsException, JMRuntimeException, LSException, MalformedParameterizedTypeException, MirroredTypesException, MissingResourceException, NegativeArraySizeException, NoSuchElementException, NoSuchMechanismException, NullPointerException, ProfileDataException, ProviderException, ProviderNotFoundException, RasterFormatException, RejectedExecutionException, SecurityException, SystemException, TypeConstraintException, TypeNotPresentException, UndeclaredThrowableException, UnknownEntityException, UnmodifiableSetException, UnsupportedOperationException, WebServiceException, WrongMethodTypeException";
		
		String string3 = "their, them, been, nor, did, why, she, the, cannot, let, whom, says, into, our, most, can, like, than, twas, not, what, which, got, then, while, either, there, own, has, tis, about, any, since, how, and, ever, that, rather, among, its, this, does, get, but, hers, are";
		

		strTok.setString(string1);
		ArrayList<String> res = strTok.toList(string3);//test.getTheUnion(string2); 
		Collections.sort(res);
		//System.out.println("\n"+res.size()+"\n");
		String resStr = strTok.toTokendString(res);

		System.out.println(resStr);
	}

	public void testMutableClass(){
		MutableTest mutTest = new MutableTest();
		mutTest.setString("This an awsm place to work");
		System.out.println(mutTest.getAddressOfStr());
		mutTest.setString("now i have changed the string");
		System.out.println(mutTest.getAddressOfStr());
	}
	

	public void genericsTest(){

		Generics gen = new Generics();
		//test.testMutableClass();
		gen.trySet(new TreeSet<String>());
		var x = gen.tryMap(new HashMap<String, String>());
		//gen.tryList(new ArrayList<String>());
		
		gen.tryHtable(new Hashtable<String,String>());
		
		//CustomIterator<String> custIt = new CustomIterator<String>();

	}

	public void testLock(){
		TestLock test = new TestLock();
		test.checkScope();
	}
	public static void main(String...params){
		Test test = new Test();
		test.testLock();
		//new Test().new Nested().eggStatus(); //temp instance to call its method
		
	}
}
