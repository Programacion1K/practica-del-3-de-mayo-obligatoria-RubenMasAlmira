public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda agendaDePrueba=new Agenda("Prueba");
        Contacto ana=new Contacto("ana");
        Contacto bea=new Contacto("bea");
        Contacto clara=new Contacto("clara");
        agendaDePrueba.anyadirContacto(ana);
        agendaDePrueba.anyadirContacto(bea);
        agendaDePrueba.anyadirContacto(clara);
        agendaDePrueba.anyadirItem(ana,new Item("Teléfono","9999999"));
        agendaDePrueba.anyadirItem(ana,new Item("Dirección","C/ Mayor,8"));
        agendaDePrueba.anyadirItem(bea,new Item("Teléfono","6666666"));
        agendaDePrueba.anyadirItem(bea,new Item("Libro Favorito","El Quijote"));
        agendaDePrueba.anyadirItem(clara,new Item("Comida Favorita","Sushi"));

        System.out.println(agendaDePrueba.listadoCompleto());
        String salida="";
        for(Contacto c:agendaDePrueba.listadoContactos()){
            salida+=c.info()+"(";
            for(Item i:agendaDePrueba.listaItems(c)){
                salida+=i.info()+" ";
            }
            salida+=")\n";
        }
        System.out.println(salida);

    }

}
