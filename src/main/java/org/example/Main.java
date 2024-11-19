package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static final int NUM_THREADS = 4;
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(NUM_THREADS);

        Random random = new Random();
        int num1 = random.nextInt(1,10000);
        int num2 = random.nextInt(1,10000);

        List<Integer> numbers = new ArrayList<>();

        if (num1<num2){
            while (num1!=num2){
                numbers.add(num1);
                num1++;
            }
        }
        else {
            while (num2!=num1){
                numbers.add(num2);
                num2++;
            }
        }

        for (int n : numbers){
            Runnable rg = new SuperEvenThread(n);
            pool.execute(rg);
        }
        pool.shutdown();

    }
}