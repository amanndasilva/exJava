/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0910;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class Aula0910 {

    public static void main(String[] args) {
        int vet[] = new int [3]; //declara o valor do velor - no caso são 4 números
        
        for(int i = 0; i < 3; i++){ // aqui ela conta do 0 ao 2 (somando 3 números)
            String mensagem = "Digite um número";
            mensagem = JOptionPane.showInputDialog(null, mensagem); //abre a caixa de texto solicitando que o usuário insira um número
            vet[i] = Integer.parseInt(mensagem); // transforma o número string para inteiro
            System.out.println("O número é: " + vet[i]); // imprime os números
        }
    }
}
