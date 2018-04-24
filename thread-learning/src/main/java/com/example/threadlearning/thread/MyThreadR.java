package com.example.threadlearning.thread;

public class MyThreadR implements  Runnable {
    private String threadName;

    public MyThreadR(String threadName) {
        this.threadName = threadName;
    }

    public MyThreadR() {
        this.threadName = "defaultThreadR";
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(threadName+"运行："+i);
            try {
                Thread.sleep((long) (Math.random()*10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public  static void main(String[] args){
        new Thread(new MyThreadR("myThreadR")).start();
        new Thread(new MyThreadR()).start();
    }

}
