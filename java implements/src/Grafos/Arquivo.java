
package Grafos;

import static Grafos.Lista.numVertices;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.LinkedList;

public class Arquivo {
    
    public static void main (String[] atgs){
        int num = 0;
        Scanner in;
        try {
            
            in = new Scanner (new FileReader("C:\\Users\\brenn\\OneDrive\\Área de Trabalho\\k\\TRABALHOS\\3 periodo\\analise algoritimo\\2 unid\\prova\\file1.txt"));
           
            while (in.hasNextLine()){
                
                String line = in.nextLine();
                 num++;
                 
                
                
                
            }
            LinkedList[] lista = new LinkedList[num];
            LigarLista(lista, num);
            print(lista, num);
        
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
            
        }
    }
    public static void LigarLista(LinkedList[] lista, double num){
         for (int i = 0; i < num; i++){
            lista[i] = new LinkedList();
        } 
    }
    static void print(LinkedList[] lista, double num){
        for (int i = 0; i < num; i++){
            System.out.print(i+": ");
            for (int j = 0; j < lista[i].size(); j++){
                System.out.print(lista[i].get(j)+ " ");
            }
            System.out.println("");
        }
    }
    
}
