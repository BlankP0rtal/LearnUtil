package com.Threads;


import java.util.Random;

class TestThreadLocal extends Thread{
    ThreadLocal<Integer> gfg_local = new ThreadLocal<Integer>();
    Integer normal;
    Integer l;
    
    public TestThreadLocal(String tname){
        super(tname);
        this.gfg_local.set(new Random().nextInt());
        this.normal=new Random().nextInt();
       // l = this.gfg_local.get();
        System.out.println("init -> "+this.gfg_local.get()+"|"+this.normal);
    }
    
    public void update(){
        if(this.gfg_local.get() == null){
            
            this.gfg_local.set(new Random().nextInt());
            System.out.println("set null as -> "+this.gfg_local.get());
        }
        //System.out.println("update fun -> "+this.gfg_local.get()+"|"+this.normal);
        this.gfg_local.set(this.gfg_local.get() + 1);
        this.normal += 1;
    }
    public void print(){
        System.out.println(this.getName()+"\t->\t"+this.gfg_local.get()+" | "+this.normal);
    }
    public void run(){
        this.update();
        this.print();
    }
}

public class ThreadLocalUtil { 

public static void main(String[] args) throws InterruptedException
	{ 

		 TestThreadLocal t1 = new TestThreadLocal("Thread-1");
		 TestThreadLocal t2 = new TestThreadLocal("Thread-2");
		 
		 t1.start();
		 t2.start();
		 
		 t1.join();
		 t2.join();
		
	} 
} 
