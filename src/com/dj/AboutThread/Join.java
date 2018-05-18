package com.dj.AboutThread;

class B extends Thread {
    public B() {
        super("[BThread] Thread");
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start. ");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName + " loop at " + i);

                Thread.sleep(1000);

            }
            System.out.println(threadName + " end. ");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}

class A extends Thread {

    B bt;

    public A(B bt){
        super("[AThread] Thread");
        this.bt = bt;
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");

        try {
            bt.join(); //对A线程而言，b线程加入进来了，要等待b线程运行完成了才能向下运行
            System.out.println(threadName + " end.");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception from " + threadName + ".run");
        }
    }
}

public class Join {
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        B bt = new B();
        A at = new A(bt);
        try {
            bt.start();
            Thread.sleep(2000);
            at.start();
//            at.join();      //对主线程main而言，a线程加入进来了，所以要等待a线程运行完才能向下执行
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }
}
