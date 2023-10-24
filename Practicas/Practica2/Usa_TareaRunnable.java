public class Usa_TareaRunnable {

  public static void main(String[] args) throws Exception {
    Thread h1 = new Thread(new TareaRunnable(1));
    Thread h2 = new Thread(new TareaRunnable(-1));
    h1.start();
    h2.start();
    h1.join();
    h2.join();
    System.out.println(TareaRunnable.n);
    System.out.println("Finalizando...");
  }
}
