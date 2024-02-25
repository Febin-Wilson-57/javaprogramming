package org.learn.collection.lambda;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum =0;
                for(int i=0;i<10;i++){
                    sum+=i;
                }
                System.out.println("sum is :"+sum);
            }
        };
        runnable.run();
        new Thread(runnable).start();


        Runnable runnable1 =()->{
            int sum =0;
            for(int i=0;i<=10;i++){
                sum+=i;
            }
            System.out.println("sum is :"+sum);
        };
        new Thread(runnable1).start();


    }
}
