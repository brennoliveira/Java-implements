/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaMatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author brenn
 */
public class buscaMatriz{
    public static void main(String[] args) {
        int count = 2;
        int k = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um k inteiro para gerar a matriz","",JOptionPane.PLAIN_MESSAGE));
        int b = (int) Math.pow(2, k); 
        int matriz[][] = new int[b][b];
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 matriz[i][j] = count;
                 count += 2;
            }
        }
        int key = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o núnero que deseja buscar","Busca",JOptionPane.PLAIN_MESSAGE));
        boolean achou = false;
        for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 if(matriz[i][j] == key){
                     System.out.println("O número "+key+" foi encontrado");
                     achou = true;
                     break;
                 }
            }
        }
        if(achou == false){
            System.out.println("O número "+key+" não foi encontrado");
        }
    }

}