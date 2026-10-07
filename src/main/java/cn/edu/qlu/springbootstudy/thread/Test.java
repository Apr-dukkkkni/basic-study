package cn.edu.qlu.springbootstudy.thread;

public class Test {
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();

        MyRunnable task = new MyRunnable();
        Thread t2 = new Thread();
        t2.start();

    }
}
