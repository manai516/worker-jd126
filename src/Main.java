public class Main {
    static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}
