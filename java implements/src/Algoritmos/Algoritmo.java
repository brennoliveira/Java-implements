/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;
import javax.swing.JOptionPane;
/**
 *
 * @author brenn
 */
public class Algoritmo {

    /**
     * @param args the command line arguments
     */

// Driver method 


    public static void main(String args[]){ 
        int vetor[] = {22,99,32,88,34,33,11,97,55,66};
        int iesimo = Integer.parseInt(JOptionPane.showInputDialog(null,"I-ésimo menor valor","I-ésimo",JOptionPane.PLAIN_MESSAGE));
        sort(vetor,iesimo);
    }
    public static void sort(int vetor[],int iesimo) 
    { 
        for (int i = 0; i < vetor.length-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i + 1; j < vetor.length; j++){ 
                if (vetor[j] < vetor[min_idx]){ 
                    min_idx = j;
                }
            }
            int temp = vetor[min_idx];
            vetor[min_idx]= vetor[i];
            vetor[i] = temp;
        }
        JOptionPane.showMessageDialog(null, vetor[iesimo-1] + " é o " + iesimo + "º menor elemento!","I-ésimo",JOptionPane.PLAIN_MESSAGE);
    } 
}

