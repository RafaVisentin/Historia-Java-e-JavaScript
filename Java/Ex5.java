public class Ex5 extends Thread {
    public void run() {
        System.out.println("Tarefa emsegundo plano em Java!");
    }

    public static void main(String[] args) {
        Ex5 tarefa = new Ex5();
        tarefa.start(); // Inicia a thread
    }
}