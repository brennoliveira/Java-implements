/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddVetor;

import javax.swing.JOptionPane;

/**
 *
 * @author brenn
 */
public class SomaVetor {
    public static void main(String args[]){
        int soma = 0;
        int s1 = 0; int s2 = 0;
        int v[] = {11, 3, 9, 2};
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: ", JOptionPane.PLAIN_MESSAGE));
        for (int i = 0; i < v.length; i++){
            for (int j = 0; j < v.length; j++){
                soma = v[i] + v[j];
                if (soma == valor){
                    s1 = i;
                    s2 = j;
                }
            }
        }
            System.out.println("Para a soma dar "+valor+" ,foram usados os índices:");
            System.out.println(s1);
            System.out.println(s2);
    }
}