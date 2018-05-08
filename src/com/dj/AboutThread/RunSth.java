package com.dj.AboutThread;

/**
 * http://www.importnew.com/20444.html
 * synchronized方法
 */


public class RunSth {
    public static void main(String[] args) {
        HasPrivateNum HPN = new HasPrivateNum();
//        HasPrivateNum HPN2 = new HasPrivateNum();

        ThreadB threadb = new ThreadB(HPN);
        threadb.start();

        ThreadA threada = new ThreadA(HPN);
        threada.start();


    }
}


class HasPrivateNum{
    private int num;

    public void addNum(String str){
            try {
                if (str.equals("a")) {
                    num = 100;
                    System.out.println("a has been set over ");
//                    Thread.sleep(2000);
                } else {
                    num = 200;
                    System.out.println("b has been set over ");
                }
                System.out.println(str + " = " + num);
            }catch (Exception e){
                e.printStackTrace();
            }

    }
}

class ThreadA extends Thread{
    private HasPrivateNum PM;

    public ThreadA(HasPrivateNum Num){
        super();
        this.PM = Num;
    }

    @Override
    public void run() {
        super.run();
        PM.addNum("a");
    }
}

class ThreadB extends Thread{
    private HasPrivateNum PM;

    public ThreadB(HasPrivateNum Num){
        super();
        this.PM = Num;
    }

    @Override
    public void run() {
        super.run();
        PM.addNum("b");
    }
}