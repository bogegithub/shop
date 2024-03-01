package com.example.queue;

import java.util.Random;

/**
 * @className: Worker
 * @author: YanBo
 * @date: 2023/9/14 14:30
 */
public class Worker extends Thread{
    private static final Random random = new Random(System.currentTimeMillis());
    private final PackageChannel channel;

    public Worker(String name, PackageChannel channel) {
        super(name);
        this.channel = channel;
    }
    @Override
    public void run() {
        while (true) {
            channel.take();
            try {
                Thread.sleep(random.nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
