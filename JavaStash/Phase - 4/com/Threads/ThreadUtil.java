//Thread practice
package com.Threads;

import java.util.Timer;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

class TimerClass {
	Timer countDown;
	public TimerClass(){
		countDown = new Timer();
		countDown.schedule(new CountdownTask(),5000);
	}

	class CountdownTask extends TimerTask{
		TimerClass timerClass;
		public void run(){
			System.out.println("Stop!!");
			countDown.cancel();
		}
	}
}

enum Direction{
	LEFT("A"),
	RIGHT("D"),
	UP("W"),
	DOWN("S");
	private String direction;

	Direction(String direction){
		this.direction = direction;
	}

	public String getDirection(){
		return this.direction;
	}
}

class Snake extends Thread{
	int bodyLength;
	char bodyShape;
	Direction direction;
	boolean movementStatus;

	public Snake(){
		bodyLength = 1;
		bodyShape = '.';
		direction = Direction.LEFT;
		movementStatus = true;
	}

	public void setDirection(String direction){
		//System.out.println("Setting Direction -> "+Direction.RIGHT.getDirection().equals(direction.substring(0,1)));
		if(Direction.RIGHT.getDirection().equals(direction.substring(0,1)))
				this.direction = Direction.RIGHT;
		else if(Direction.DOWN.getDirection().equals(direction.substring(0,1))){
				this.direction = Direction.DOWN;
		}
	}

	public int moveSnake(/*Direction direction*/) {

		switch(this.direction){
			case RIGHT:
				this.printSnakeBody();
				break;
			case DOWN:
				System.out.println();
				this.printSnakeBody();
				break;
			default:
				System.out.println("What ?!");
				break;
		}
		return 1;
	}

	public void printSnakeBody(){
		System.out.print("..");
		System.out.print("\b"+" ");
	}

	public void kill(){
		System.out.println(Thread.currentThread().toString());
		this.interrupt();
	}

	public void run() {
		while(movementStatus){
			//System.out.println();
			this.moveSnake();
			try{
				Thread.currentThread().sleep(1000);
			}catch(InterruptedException excep){
				System.out.println("STOPEED");
				movementStatus = false;
			}
			//System.out.println(Thread.cur);
			//System.out.print("snake "+Thread.currentThread().toString()+"\t");
		}
	}
}



class ThreadCode extends Thread{

	Snake snake;
	public ThreadCode(){
		snake = new Snake();
	}

	void setDirection(){

	}
	/*private static int readableVar;
	void updateVar(){
		readableVar++;
	}

	public int read(){
		return this.readableVar;
	}*/

	public void run(){


		/*this.updateVar();
		System.out.println(this.read());
		*/

	}
}

/*class InputThread extends Thread{

	BufferedReader bufferedReader;
	public InputThread(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public void run(){

	}
}*/

public class ThreadUtil{
	public static void main(String...params) throws IOException {
		/*ThreadCode thread = new ThreadCode();*/
		//ThreadCode thread1 = new ThreadCode();
		/*thread.start();
		//thread.start();
		thread1.start();
		//thread1.start();
		*/
		Snake snake = new Snake();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String direction=" ";

		//TimerClass timerClass = new TimerClass();
		//System.out.println(timerClass.get());
		//int i=100;
		snake.start();

		while(direction.charAt(0) != '!'){
			//System.out.println("call here!!");
			//direction = ((Character)(char)bufferedReader.read()).toString();
			
			direction = bufferedReader.readLine();

			//System.out.println("main "+Thread.currentThread().toString());
			//System.out.println(bufferedReader.readLine());
			snake.setDirection(direction);
						//System.out.println("Read direction -> "+direction);
			//System.out.println(i+" -> "+timerClass.get());
		}
		snake.kill();
		System.out.println("GAME OVER!!");
	}
}