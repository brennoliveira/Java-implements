
package Grafos;

import java.util.LinkedList;

public class Lista {
    static int numVertices = 12;
    
    public static void main (String[] args){
        
        LinkedList[] lista = new LinkedList[numVertices];
        
        ligarLista(lista);
        
        lista[3].add(8);
        lista[3].add(10);
        lista[5].add(11);
        lista[7].add(8);
        lista[7].add(11);
        lista[8].add(9);
        lista[11].add(2);
        lista[11].add(9);
        
        print(lista);
        
    }
    
    
    static void ligarLista(LinkedList[] lista){
        for (int i = 0; i < numVertices; i++){
            lista[i] = new LinkedList();
        }      
    }
    
    static void print(LinkedList[] lista){
        for (int i = 0; i < numVertices; i++){
            System.out.print(i+": ");
            for (int j = 0; j < lista[i].size(); j++){
                System.out.print(lista[i].get(j)+ " ");
            }
            System.out.println("");
        }
    }
}
