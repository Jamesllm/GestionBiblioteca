package Clases;

/**
 *
 * @author Alex
 */
public class Usuario {

    private String codigo, nombre, apellidos, dni;
    private String userName, password;
    private boolean estado;

    public Usuario(String codigo, String nombre, String apellidos, String dni, String userName, String password, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.userName = userName;
        this.password = password;
        this.estado = estado;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + "nombre: " + nombre
                + "Apellido: " + apellidos
                + "DNI: " + dni;

    }
}
