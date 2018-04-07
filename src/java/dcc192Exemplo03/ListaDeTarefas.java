package dcc192Exemplo03;


import java.util.ArrayList;
import java.util.List;


public class ListaDeTarefas {
    private static List<Tarefas> tarefas;
    
    public static List<Tarefas> getInstance(){
        if(tarefas == null){
            tarefas = new ArrayList<>();
            tarefas.add(new Tarefas("Estudar Java", "Estudar Java quando der tempo!!!"));
            tarefas.add(new Tarefas("Estudar Delphi", "Estudar Delphi quando der tempo!!!"));
            tarefas.add(new Tarefas("Estudar HTML", "Estudar HTML quando der tempo!!!"));                    
        }
        return tarefas;
    }
}
