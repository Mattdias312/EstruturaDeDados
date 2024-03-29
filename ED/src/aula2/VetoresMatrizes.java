/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Alunos
 */
public class VetoresMatrizes {
    
    public int[] inverterVetor (int[] vetorEntrada){
        /* Cire um método que inverte o vetor de entrada
        e retorne o vetor invertido*/
        
        int[] vetorSaida = new int[8];
        for(int i=0; i<8;i++){
            vetorSaida[7-i] = vetorEntrada[i];
        }
        return vetorSaida;
    }
    
    public int[][] conversorVetorMatriz(int[] vetor1, int[] vetor2,
            int[] vetor3){
        int[][] matriz = new int[8][3];
        for(int i=0;i<8;i++){
            matriz[i][0] = vetor1[i];
            matriz[i][1] = vetor2[i];
            matriz[i][2] = vetor3[i];
        }
        return matriz;
    }
    
    public int conversorBinarioDecimal(int[] binario){
        
        int decimal = 0;
        for(int i=0; i<8;i++){
            decimal += binario[7-i] * Math.pow(2,i);
        }
        
        return decimal;
    }
    
    public int[] conversorDecimalBinario(int decimal){
        
        int[] binario = new int[8];
        for(int i=0; i<8;i++){
            binario[7-i] = decimal%2;
            decimal = decimal/2;
        }
        
        return binario;
    }
    
    public int[] criaVetorExtra(int[] vetor1, int[] vetor2){
        int[] vetor3 = new int[10];
        int j = 0;
        
        for(int i=0; i<5;i++){
            vetor3[j] = vetor1[i];
            vetor3[j+1] = vetor2[i];
            j+=2;
        }
        return vetor3;
    }
    
    public int[][] matrizTransposta(int[][] matriz){
        int[][] matrizTransposta = new int[3][2];
        
        for(int j=0;j<2;j++){
            for(int i=0;i<3;i++){
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        
        return matrizTransposta;
    } 
    
}
