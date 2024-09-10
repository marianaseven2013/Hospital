package Model;

public class Enfermera {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Especialidad;
    private int SalasAatender;

    public Enfermera(String Nombre, String Apellido, int Edad, String Especialidad, int SalasAatender){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Especialidad = Especialidad;
        this.SalasAatender = SalasAatender;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }
}
