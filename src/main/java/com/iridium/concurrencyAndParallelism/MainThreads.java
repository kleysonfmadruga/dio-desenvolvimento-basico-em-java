package com.iridium.concurrencyAndParallelism;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainThreads {
    public static void main(String[] args) {
        // To start a new thread in the program, we must call the the start method
        ShowLoadingBar showBar = new ShowLoadingBar();
        showBar.start();

        // Or instantiate a new Thread object, passing the Runnable as a parameter and call the start method
        Thread downloader = new Thread(new Downloader());
        downloader.start();

        // -------- Using futures ---------
        FutureCalculator calculator = new FutureCalculator();
        Future<Double> future = calculator.calculate(20d);

        try {
            do {
                Thread.sleep(10);
                System.out.println("Calculating...");
            } while (!future.isDone());

            Double result = future.get();
            // If the ExecutorService.shutdown not be called, the Future won't finish and the program will run forever
            calculator.shutdown();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

// To create a class to operate with threads, we can implement the run method of the Runnable interface
class Downloader implements Runnable{
    @Override
    public void run() {
        for (var i = 0; i < 100; i++){
            System.out.println(i + "MB");
        }
    }
}

// Or extend the Thread class
class ShowLoadingBar extends Thread{
    @Override
    public void run(){
        for (var i = 0; i < 100; i++){
            System.out.println(i + "%");
        }
    }
}
