public class Main {
    public static void main(String[] args) {
    Persona miPersona = new Persona();
    miPersona.setEdad(18);
    miPersona.setNombre("Christian");
    miPersona.setTelefono("+593111111111");
        System.out.println("Hola "+ miPersona.getNombre());
        System.out.println("Tienes " + miPersona.getEdad() + " años");
        System.out.println("y tu telefono es: " + miPersona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}