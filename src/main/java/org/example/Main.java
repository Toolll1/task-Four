package org.example;

import java.util.concurrent.TimeUnit;

/**
 * - Реализовать механизм периодического асинхронного выполнения задач.
 * Т.е. механизм, который, не останавливая работу основной программы, раз в 10 секунд делает следующие действия:
 * 1. пишет в консоль "Асинхронный привет!"
 * 2. ждет (sleep) 5 секунд
 * 3. пишет в консоль "Асинхронный пока!"
 * Основная программа при этом должна каждую секунду писать в консоль "Работает основная программа".
 */

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            while (true) {
                try {
                    System.out.println("Асинхронный привет! Поток " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("Асинхронный пока! Поток " + Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.setName("MyThread");
        thread.start();

        while (true) {
            try {
                System.out.println("Работает основная программа. Поток " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}