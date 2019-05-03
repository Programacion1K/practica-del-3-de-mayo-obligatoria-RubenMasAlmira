import java.util.Objects;

public class Contacto {
    private final String nombre;
    Contacto(String nombre){
        this.nombre=nombre.substring(0,1).toUpperCase()+nombre.substring(1);
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String info(){
        return nombre;
    }

    public static void main(String[] args) {
        Contacto contacto1=new Contacto("eepe");
        System.out.println(contacto1);
    }

}
