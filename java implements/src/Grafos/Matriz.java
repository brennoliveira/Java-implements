
package Grafos;

class Aresta{
    int valor;
    
    Aresta(){
        this.valor = 0;
    }
}
public class Matriz{
    static int numVertices = 12;
    
    public static void main(String... args){
        
        Aresta arestas[][] = new Aresta[numVertices][numVertices];
        
        ligarMatriz(arestas);
        
        
        (arestas[3][8]).valor = 1;
        (arestas[3][10]).valor = 1;
        (arestas[5][11]).valor = 1;
        (arestas[7][11]).valor = 1;
        (arestas[7][8]).valor = 1;
        (arestas[8][9]).valor = 1;
        (arestas[11][2]).valor = 1;
        (arestas[11][9]).valor = 1;
        
        print(arestas);
    }
    
    static void ligarMatriz(Aresta[][] arestas){
        
        for (int i = 0; i < numVertices; i++){
            for (int j = 0; j < numVertices; j++){
                arestas[i][j] = new Aresta();
            }
        }
    }
    
    	static void print(Aresta[][] arestas){
            System.out.println("   0 1 2 3 4 5 6 7 8 9,10,11");
            for (int i = 0; i < numVertices; i++){
                System.out.print(i+": ");
                for (int j = 0; j < numVertices; j++){
                    System.out.print((arestas[i][j].valor + " "));
                }
                System.out.println();
            }
        }
}