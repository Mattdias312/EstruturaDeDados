package aula2;

public class aula02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //#################Exercício 01#################
        VetoresMatrizes vM1 = new VetoresMatrizes();
        int[] entrada = new int[]{0,1,2,3,4,5,6,7};
        int[] saida;
        saida = vM1.inverterVetor(entrada);
        System.out.println("################# Exercício 01 #################");
        System.out.print("Entrada: ");
        for(int i=0; i<8;i++){
            if(i<7){
                System.out.print(entrada[i]);
            } else{
                System.out.println(entrada[i]);
            }
        }
        System.out.print("Saida: ");
        for(int i=0; i<8;i++){
            if(i<7){
                System.out.print(saida[i]);
            } else{
                System.out.println(saida[i]);
            }
        }
        
        //#################Exercício 02#################
        int[][] matrizSaida;
        int[] entrada1 = new int[]{0,1,2,3,4,5,6,7};
        int[] entrada2 = new int[]{0,2,4,6,8,0,2,4};
        int[] entrada3 = new int[]{1,3,5,7,9,1,3,5};
        matrizSaida = vM1.conversorVetorMatriz(entrada1, entrada2, entrada3);
        System.out.println("\n\n################# Exercício 02 #################");
        System.out.println("Matriz:");
        for(int j=0; j<3;j++){
            System.out.print("| ");
            for(int i=0; i<8;i++){
                if(i<7){
                    System.out.print(matrizSaida[i][j]);
                } else{
                    System.out.println(matrizSaida[i][j]+" |");
                }
            }
        }
       
          //#################Exercício 03#################
        int[] binario = new int[]{1,1,0,1,0,0,1,0};
        System.out.println("\n\n################# Exercício 03 #################");
        System.out.println(vM1.conversorBinarioDecimal(binario));
        
          //#################Exercício 04#################
        int decimal = 3;
        int[] binarioConvertido;
        binarioConvertido = vM1.conversorDecimalBinario(decimal);
        System.out.println("\n\n################# Exercício 04 #################");
        for(int i=0; i<8;i++){
                if(i<7){
                    System.out.print(binarioConvertido[i]);
                }else{
                    System.out.println(binarioConvertido[i]);
                }
        }
        
          //#################Exercício 05#################
        System.out.println("\n\n#################Exercício 05#################");
        int[] impar = new int[]{1,3,5,7,9};
        int[] par = new int[]{2,4,6,8,0};
        int[] vetor3 = vM1.criaVetorExtra(impar, par);
        for(int i=0; i<10;i++){
                if(i<9){
                    System.out.print(vetor3[i]);
                }else{
                    System.out.println(vetor3[i]);
                }
        }
        
          //#################Exercício 06#################
          System.out.println("\n\n#################Exercício 06#################");
          int[][]matriz = new int[][]{{1,7,8},{5,3,2}};
          for(int j=0; j<3;j++){
            for(int i=0; i<2;i++){
                if(i<1){
                    System.out.print("|"+"\t"+matriz[i][j]+"\t");
                } else{
                    System.out.println("|"+"\t"+matriz[i][j]+"\t"+"|");
                }
            }
        }
        
          //#################Exercício 07#################
          System.out.println("\n\n#################Exercício 07#################");
          int[][] matrizTransposta = vM1.matrizTransposta(matriz);
          for(int j=0; j<2;j++){
            for(int i=0; i<3;i++){
                if(i<2){
                    System.out.print("|"+"\t"+matrizTransposta[i][j]+"\t");
                } else{
                    System.out.println("|"+"\t"+matrizTransposta[i][j]+"\t"+"|");
                }
            }
        }
          
    }
}
