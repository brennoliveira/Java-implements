
package LaaNovo;

/**
 *
 * @author Brenno Santos Oliveira
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void veotrr(String[] args) {
        int v[] = new int[500];
        int k = 0;
        adicionarElementos(v);
        recursividade(v, k);
    }
    
    public static void adicionarElementos(int v[]){
        for (int i = 0; i <v.length; i++){
            v[i] = i;
        }
    }
    
    public static void recursividade(int v[], int k){
        System.out.println(v[k]);
        if (k < v.length-1){
            k++;
            recursividade(v,k);
        }
    }
}
