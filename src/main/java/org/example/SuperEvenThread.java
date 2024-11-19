package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SuperEvenThread implements Runnable {
    private int num;
    private static final int NUM_THREADS=2;


    public SuperEvenThread(int num) {
        this.num = num;
    }

    public SuperEvenThread() {
    }


    boolean isSuperEven;

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);

        List<String> numbers = Arrays.stream(sb.append(num).toString().split("")).toList();
        int length = sb.length();

        for (String n : numbers){
            int number = Integer.parseInt(n);
        }

        System.out.println(Thread.currentThread().getName()+" "+num);

    }
}


