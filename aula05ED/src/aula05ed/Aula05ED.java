package aula05ed;

public class Aula05ED {

    public static void main(String[] args) {
        
        /*
        PilhaVetor pilhaA = new PilhaVetor(4);
        pilhaA.empilhar("A");
        pilhaA.empilhar("B");
        pilhaA.empilhar("C");
        pilhaA.empilhar("D");
        pilhaA.empilhar("E");
        System.out.println("Pilha cheia? " + pilhaA.verificaPilhaCheia());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        System.out.println("Desempilhar: " + pilhaA.desempilha());
        */
        
        String palavra="araras";
        PilhaVetor pv = new PilhaVetor(palavra.length());
        System.out.println(pv.verificaPalindromo(palavra));
        
        String[] balanco = new String[]{"(",")",")"};
        System.out.println(pv.validaBalanceamento(balanco));
    }
    
}
