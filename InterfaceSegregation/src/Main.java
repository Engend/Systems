public class Main {
    public static void main(String[] args) {
        IWorker iWorker = new Cook();
        iWorker.work();
        iWorker.eat();
        Worker worker = new Waiter();
        worker.work();
    }
}

interface Worker {
    void work();
}

interface Eater {
    void eat();
}

interface IWorker extends Worker, Eater {

}

class Cook implements IWorker {

    public void work () {
        System.out.println("work");
    }

    public void eat () {
        System.out.println("eat");
    }
}

class Waiter implements Worker {

    public void work () {
        System.out.print("1/2 work");
    }
}