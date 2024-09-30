package Hospital.model;
import javax.swing.*;
import java.awt.*;
public class Paciente extends JFrame {
    private String nombre;
    private String correo;
    private String telefono;
    private String direccion;
    private String fechaNacimiento;
    private String horarioCita;
    private String motivoVisita;
    private String numeroConsultas;
    private String doctor;
    public Paciente(String nombre, String correo, String telefono, String direccion, String fechaNacimiento, String horarioCita, String motivoVisita, String numeroConsultas, String doctor){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.horarioCita = horarioCita;
        this.motivoVisita = motivoVisita;
        this.numeroConsultas = numeroConsultas;
        this.doctor = doctor;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getHorarioCita() {
        return horarioCita;
    }
    public String getMotivoVisita() {
        return motivoVisita;
    }
    public String getNumeroConsultas() {
        return numeroConsultas;
    }
    public String getDoctor() {
        return doctor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setHorarioCita(String horarioCita) {
        this.horarioCita = horarioCita;
    }
    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }
    public void setNumeroConsultas(String numeroConsultas) {
        this.numeroConsultas = numeroConsultas;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String toString() {return "Nombre: " + nombre + ", Correo: " + correo+ ", Telefono: " + telefono+ ", Direccion: " + direccion+ ", Fecha de Nacimiento: " + fechaNacimiento+ ", Horario cita: " + horarioCita+ ", Motivo visita: " + motivoVisita+ ", Numero de Consultas: " + numeroConsultas+ ", Doctor: " + doctor;}
}