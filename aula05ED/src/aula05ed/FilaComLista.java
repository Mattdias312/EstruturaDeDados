import java.util.ArrayList;
import java.util.List;


public class FilaComLista {
        //declarar os atributos do objeto
    List fila =new ArrayList<Integer>();
    int tamanhoPrioridade=0;
    
        //métodos da classe fila
        //adicionar um inteiro no final da fila
    public void adicionar(Integer item){
        if(item>64){
            fila.add(tamanhoPrioridade,item);
            tamanhoPrioridade++;
        }else{
        fila.add(item);
        }
    }
    public int tamanho(){
        return fila.size();
    }

    public int remover() {
        if(tamanhoPrioridade>0){
            tamanhoPrioridade--;
        }
        return (Integer)fila.remove(0);
    }
    
    public Object exibirInicio() {
        return (Integer)fila.get(0);
    }
}
