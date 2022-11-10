import com.enrique.Biblioteca.*;

public class Main {
    public static void main(String[] args) {
        Autor Cervantes = new Autor();
        Cervantes.setId(1);
        Cervantes.setNombre("Miguel de Cervantes");
        Cervantes.setApellidos("Martin");
        Cervantes.setFechanacimiento("2-10-2000");
        Cervantes.setLocalidad("Andorra");
        System.out.println(Cervantes.getId());
        System.out.println(Cervantes.getApellidos());
        System.out.println(Cervantes.getFechanacimiento());

        Genero Parodia = new Genero();
        Parodia.setId(2);
        Parodia.setNombre("Don quitoje");
        Parodia.setDescripcion("Libro inspirado en ...");
        System.out.println(Parodia.getId());
        System.out.println(Parodia.getDescripcion());
        System.out.println(Parodia.getDescripcion());

        Usuario users = new Usuario();
        users.setId(3);
        users.setNombre("Ramon");
        users.setApellidos("Martin");
        users.setDni("13455445A");
        users.setTelefono(632899832);
        users.setDireccion("Calle los arcos 15");
        users.setPoblacion("Ávila");
        System.out.println(users.getId());
        System.out.println(users.getNombre());
        System.out.println(users.getApellidos());
        System.out.println(users.getDni());
        System.out.println(users.getTelefono());
        System.out.println(users.getDireccion());
        System.out.println(users.getPoblacion());

        Libro quijote = new Libro();
        quijote.setId(4);
        quijote.setTitulo("Don Quijote");
        quijote.setIsb(1024945698);
        quijote.setAutor("Miguel de cervantes");
        quijote.setGenero("Parodia");
        quijote.setFechapublicacion("12-10-2002");
        System.out.println(quijote.getId());
        System.out.println(quijote.getTitulo());
        System.out.println(quijote.getIsb());
        System.out.println(quijote.getAutor());
        System.out.println(quijote.getGenero());
        System.out.println(quijote.getFechapublicacion());

        Prestamos lend = new Prestamos();
        lend.setId(5);
        lend.setLibro();
        lend.setUsuario();
        lend.setFechadevolucion("12-10-2024");
        lend.setFechaprestamo("12-11-2022");
        System.out.println(lend.getId());
        System.out.println(lend.getLibro());
        System.out.println(lend.getUsuario());
        System.out.println(lend.getFechadevolucion());
        System.out.println(lend.getFechaprestamo());

    }
}