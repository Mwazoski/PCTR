public class Usa_hebra{
    
    public static void main(String[] args) throws Exception {
        hebra h1 = new hebra(1);
        hebra h2 = new hebra(-1);
        h1.start();
        h2.start();
        System.out.println(h1.tipoHebra);
        System.out.println(h2.tipoHebra);
        h1.join();
        h2.join();
        System.out.println("Finalizando...");
        System.out.println(hebra.n);
      }
}