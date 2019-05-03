import java.util.Objects;

public class Item {
    private final String nombreDelItem;
    private String dato;

    Item(String nombreDelItem,String dato){
        this.nombreDelItem=nombreDelItem;
        this.dato=dato;
    }

    public String getDato() {
        return dato;
    }

    public String getNombreDelItem() {
        return nombreDelItem;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Objects.equals(nombreDelItem, item.nombreDelItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDelItem);
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombreDelItem='" + nombreDelItem + '\'' +
                ", dato='" + dato + '\'' +
                '}';
    }

    public String info(){
        return nombreDelItem+"-"+dato;
    }
}
