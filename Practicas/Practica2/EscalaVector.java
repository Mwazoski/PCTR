public class EscalaVector {

    int[] vector = new int[1000000];
    
    public static void main(String[] args) throws Exception {
        
        EscalaVector obj = new EscalaVector();

        int escalar = 3; 
        System.out.println("Realizando el producto escalar 3");
        obj.initVector();
        obj.escalarVector(escalar);
        obj.showVector();
    }

    public void initVector(){
        for (int i = 0 ; i < 1000000 ; i++){
            this.vector[i] = 1;
        }
    }

    public void escalarVector(int escalar){
        for (int i = 0 ; i < 1000000 ; i++){
            this.vector[i] = this.vector[i] * escalar;
        }
    }
 
    public void showVector(){
        for (int i = 0 ; i < 1000000 ; i++){
            System.out.println(this.vector[i]);
        }
    }
}