import java.util.*;


public class Agenda {
    private String nombre;
    private Map<Contacto, ArrayList<Item>>listaDeContactos=new TreeMap<>();

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

    public List<Contacto> listadoContactos(){
        List<Contacto> contactosEnLaLista=new ArrayList<>();
        for (Contacto c:listaDeContactos.keySet()){
            contactosEnLaLista.add(c);
        }
        return contactosEnLaLista;
    }

    public String listadoCompleto(){
        String salida="";
        for (Contacto c:listaDeContactos.keySet()) {
            salida+=c.info()+": ";
            for(Item i:listaItems(c)){
                salida+=i.info()+" ";
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

    public List<Contacto> listaInformacion(String i){
        Item itemAMirar=new Item(i,"");
        List<Contacto> contactosConElItem=new ArrayList<>();
        for (Contacto c:listaDeContactos.keySet()){
            if(listaDeContactos.get(c).contains(itemAMirar)){
                contactosConElItem.add(c);
            }
        }
        return contactosConElItem;
    }

}
