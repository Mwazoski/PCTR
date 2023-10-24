public class hebra extends Thread {

  public static int n = 0;
  public int tipoHebra;

  public hebra(int tipoHebra) {
    this.tipoHebra = tipoHebra;
  }

  public void run() {
    for (int i = 0; i < 2000; ++i) {
      if (tipoHebra < 0) {
        n--;
      } else {
        n++;
      }
    }
  }
}
