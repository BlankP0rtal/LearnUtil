//Custom Annotation

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

enum Direction{
	FORWARD,
	REVERSE,
	LEFT,
	RIGHT
}


@Repeatable(RcCars.class)
@interface RcCar{
	Direction setDirection() default Direction.FORWARD;
	int setFrequency() default 24; 
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  RcCars{
	RcCar[] value();
}

class Slasher{
	@RcCar(setDirection=Direction.REVERSE, setFrequency=50)
	@RcCar(setDirection=Direction.LEFT, setFrequency=32)
	public void moveCarR(){
		System.out.println("Car successfully moved in ");
	}
	/*@RcCar(setDirection=Direction.LEFT, setFrequency=32)
	void moveCarL(){
		System.out.println("Car ,... moved ");
	}*/ 
}

public class AnnotationUtil{
	void TestRc() throws NoSuchMethodException{
		Slasher slasher = new Slasher();
		Method method = slasher.getClass().getMethod("moveCarR");
		System.out.println(method);
		RcCars rc = method.getAnnotation(RcCars.class);
		System.out.println(rc);
	}
	public static void main(String...params) throws Exception{
		new AnnotationUtil().TestRc();
	}
}

