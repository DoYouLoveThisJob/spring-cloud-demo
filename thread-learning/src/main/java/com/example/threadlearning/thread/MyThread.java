package com.example.threadlearning.thread;

public class MyThread extends Thread{
    private String threadName;
    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    public MyThread() {
        this.threadName = "defaultThread-0";
    }

    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println(threadName+"运行："+i);
           try {
               sleep((long) (Math.random()*10));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
    public  static void main(String[] args){
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread("myThread2");
        myThread1.start();
        myThread2.start();
    }


}
