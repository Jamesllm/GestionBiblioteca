package Clases;

/**
 *
 * @author Alex
 */
public class Usuario {
   
    private String codigo, nombre, apellidos, dni, email;
    private String userName, password;
    private boolean estado;
    private int rol;

    public Usuario(String codigo, String nombre, String apellidos, String dni, String email, String userName, String password, boolean estado, int rol) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.estado = estado;
        this.rol = rol;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getRol() {
        return rol;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + "nombre: " + nombre
                + "Apellido: " + apellidos
                + "DNI: " + dni;

    }
}
