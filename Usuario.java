public class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getID() { return  id;}
    public String getNombre() { return  nombre;}
    public String getEmail() { return  email;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return id + "," + nombre + "," + email;
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}

