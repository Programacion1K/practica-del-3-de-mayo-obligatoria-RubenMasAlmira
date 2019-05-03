import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Agenda {
    Map<Contacto, ArrayList<Item>>listaDeContactos=new HashMap<>();

    Agenda(){}
    Agenda(Contacto contacto,Item item){
        listaDeContactos.put(contacto,new ArrayList<>());
        listaDeContactos.get(contacto).add(item);
    }
    Agenda(Contacto contacto,ArrayList<Item> listaDeItems){
        listaDeContactos.put(contacto,listaDeItems);
    }

    public void anyadirContacto(Contacto nuevoContacto){
        listaDeContactos.put(nuevoContacto,new ArrayList<>());
    }

    public void anyadirContacto(Contacto nuevoContacto,ArrayList<Item> listaDeItems){
        listaDeContactos.put(nuevoContacto,listaDeItems);
    }

    public void anyadirItem(Contacto contacto,Item nuevoItem){
        listaDeContactos.get(contacto).add(nuevoItem);
    }
}
