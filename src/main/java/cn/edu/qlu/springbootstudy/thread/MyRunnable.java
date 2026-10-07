package cn.edu.qlu.springbootstudy.thread;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable线程任务");
    }
}
