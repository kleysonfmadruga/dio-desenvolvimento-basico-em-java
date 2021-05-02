package com.iridium.concurrencyAndParallelism;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// This is how a future is implemented
public class FutureCalculator {
    private ExecutorService service = Executors.newSingleThreadExecutor();

    public Future<Double> calculate(Double number){
        return service.submit(() -> {
            Thread.sleep(200);
            return number * 20d;
        });
    }

    public void shutdown(){
        this.service.shutdown();
    }
}
