public class TareaRunnable implements Runnable {

  static int n;
  int tipoHebra;
  
  public TareaRunnable(int tipoHebra) {
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
