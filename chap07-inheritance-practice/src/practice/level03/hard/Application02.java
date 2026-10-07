package practice.level03.hard;

public class Application02 {

    public static void main(String[] args) {

        Worker[] workers = new Worker[2];
        workers[0] = new Developer();
        workers[1] = new Designer();


        for (Worker worker : workers) {
            worker.work();
        }

    }

}
