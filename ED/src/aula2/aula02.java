package aula2;

public class aula02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        VetoresMatrizes vM1 = new VetoresMatrizes();
        int[] entrada = new int[]{0,1,2,3,4,5,6,7};
        int[] entrada2 = new int[]{0,2,4,6,8,0,2,4};
        int[] entrada3 = new int[]{1,3,5,7,9,1,3,5};
        int[] saida;
        saida = vM1.inverterVetor(entrada);
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
        
        int[][] matrizSaida;
        matrizSaida = vM1.conversorVetorMatriz(entrada, entrada2, entrada3);
        System.out.println("Matriz");
        for(int j=0; j<3;j++){
        for(int i=0; i<8;i++){
            if(i<7){
                System.out.print(matrizSaida[i][j]);
            } else{
                System.out.println(matrizSaida[i][j]);
            }
        }
        }
       
        
    }
}