package Model;

public class Usuario {
    private int idUsuario;
    private  String Nombre;

    public int getIdUsuario() {
        return idUsuario;
    }

    public Usuario() {
    }

    public Usuario(String nombre, int idUsuario) {
        Nombre = nombre;
        this.idUsuario = idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
