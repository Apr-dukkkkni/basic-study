package cn.edu.qlu.springbootstudy.thread;


import java.util.concurrent.Callable;

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception{
        int num = 100;
        return num;
    }
}
