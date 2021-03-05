package com.yzg.springboot.excutePool;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSerialTest {
    public static void main(String[] args) {
        //核心线程数
        int corePoolSize = 3;
        //最大线程数
        int maximumPoolSize = 6;
        //超过核心线程数的最大空闲时间
        long keepAliveTime = 2;
        //以秒为时间单位
        TimeUnit unit = TimeUnit.SECONDS;
        //创建工作队列，用于存放提交的等待执行任务
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor threadPoolExecutor = null;
        try{
            threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,
                    maximumPoolSize,
                    keepAliveTime,
                    unit,
                    workQueue,
                    new ThreadPoolExecutor.AbortPolicy());
            for(int i = 0; i < 9; i++){
                //提交任务的索引
                final int index = (i + 1);
                threadPoolExecutor.submit(()->{
                    //线程打印输出
                    System.out.println("大家好，我是线程：" + index);
                    try{
                        //模拟线程执行时间10s
                        Thread.sleep(10000);
                    }catch (InterruptedException e){

                    }
                });
                //每个线程提交后休眠500ms再提交下一个任务，用于保证提交顺序
                Thread.sleep(500);
            }
        }catch (InterruptedException e){

        }finally {
            threadPoolExecutor.shutdown();
        }

    }
}
