package Hospital.model;

public class DoctorGeneral {
    private String nombre;
    private String correo;
    private String especialidad;
    private String usuario;
    private String contraseña;

    public DoctorGeneral(String nombre, String correo, String especialidad, String usuario, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getContraseña() {
        return contraseña;
    }
}