package com.example.interviewPractice.other.myJavaPractice;

public class threadCode {
    public static void main(String[] args) throws InterruptedException {
        example thread = new example();
        thread.start();

        Thread nt = new Thread(() -> System.out.println("New Thread"));
        nt.start();

        StringBuilder sb = new StringBuilder();

//        StringBuffer sb = new StringBuffer();
        Thread sbt1 = new Thread(() -> {
                for(int i=0;i<1000;i++) {
                    sb.append("1");
                }
        });

        Thread sbt2 = new Thread(() -> {
            for(int i=0;i<1000;i++) {
                sb.append("2");
            }
        });
        sbt1.start();
        sbt2.start();

        sbt1.join();
        sbt2.join();

        System.out.println("This is SBT1 length:"+sb.length());

        Thread t = new Thread(() -> {
            System.out.println("IN Main Thread class");
        });
        t.start();

        StringBuffer str = new StringBuffer();

        Thread t1 = new Thread(() ->{
            for(int i=0;i<100000;i++){
            str.append("A");
        }});

        Thread t2 = new Thread(() ->{
            for(int i=0;i<100000;i++){
                str.append("B");
            }});

        long strt = System.currentTimeMillis();
        t1.start();
        long end = System.currentTimeMillis();
        long diff = end-strt;
        System.out.println("Diff in sq:"+diff);
        long pstrt = System.currentTimeMillis();
        t2.start();
        long pend = System.currentTimeMillis();
        long pdiff = pend-pstrt;
        System.out.println("Diff in psq:"+pdiff);

        t1.join();
        t2.join();
        System.out.println(str.length());

    }

    static class example extends Thread{
        public void run(){
            System.out.println("IN Example Thread class");
        }
    }





















//        // Thread as lambda fucnt:::
//        Thread t = new Thread(() -> {
//            System.out.println("Running using as lamda");
//        });
//        A thread = new A();
//        thread.start();
//        t.start();
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Here with main");
//        }
//    }
//
//    static class A extends Thread {
//        @Override
//        public void run() {
//                System.out.println("Here with A thread");
//                System.out.println(Thread.currentThread().getName());
//                System.out.println(Thread.currentThread().getPriority());
//        }
//    }
}
