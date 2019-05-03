import java.util.*;


public class Agenda {
    private String nombre;
    Map<Contacto, ArrayList<Item>>listaDeContactos=new TreeMap<>();

    Agenda(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void anyadirContacto(Contacto nuevoContacto){
        listaDeContactos.put(nuevoContacto,new ArrayList<>());
    }

    public void anyadirContacto(Contacto nuevoContacto,ArrayList<Item> listaDeItems){
        listaDeContactos.put(nuevoContacto,listaDeItems);
    }

    public List<Item> listaItems(Contacto c){
        return listaDeContactos.get(c);
    }

    public String listado(){
        String salida="";
        for (Contacto c:listaDeContactos.keySet()) {
            salida+=c.info()+": ";
            for(Item i:listaItems(c)){
                salida+=i.info()+", ";
            }
            salida+="\n";
        }
        return salida;
    }


    public void anyadirItem(Contacto contacto,Item nuevoItem){
        try {
            listaDeContactos.get(contacto).add(nuevoItem);
        }catch (NullPointerException npe){
                throw new NullPointerException("El contacto no existe");
        }
    }

}
