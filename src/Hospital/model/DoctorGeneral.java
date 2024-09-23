package Hospital.model;

public class DoctorGeneral {

    private String nombre;
    private String usuario;
    private String correo;
    private String contraseña;
    private String especialidad;

    public DoctorGeneral(String nombre, String correo, String especialidad, String usuario, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



}