class Foo {
    Semaphore alpha, beta, gaama;

    public Foo() {
        alpha = new Semaphore(1);
        beta = new Semaphore(0);
        gaama = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        alpha.acquire();
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        beta.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        beta.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        gaama.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        gaama.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
