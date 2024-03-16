
import org.junit.Test;
import static org.junit.Assert.*;

public class testFila {
    
    @Test
    public void adicionarUmItem(){
        FilaComLista fila = new FilaComLista();
        fila.adicionar(0);
        assertEquals(1, fila.tamanho());
    }
    
    @Test
    public void adicionarTresItens(){
     FilaComLista fila = new FilaComLista();
     fila.adicionar(0);
     fila.adicionar(1);
     fila.adicionar(2);
     assertEquals(3, fila.tamanho());
    }
    
    @Test
    public void adicionarTresItensRemoverDoisItens(){
     FilaComLista fila = new FilaComLista();
     fila.adicionar(0);
     fila.adicionar(1);
     fila.adicionar(2);
     assertEquals(3, fila.tamanho());
     
     assertEquals(0, fila.remover());
     
     assertEquals(1, fila.remover());
     assertEquals(2, fila.exibirInicio());
     assertEquals(1, fila.tamanho());
    }
    
    @Test
    public void adicionarTresItensRemoverDoisItensPrioridade(){
     FilaComLista fila = new FilaComLista();
     fila.adicionar(0);
     fila.adicionar(87);
     fila.adicionar(65);
     
     assertEquals(87, fila.exibirInicio());
     
     assertEquals(3, fila.tamanho());
    }
}
