/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.pitalla.controldeasistencia.entities;

/**
 *
 * @author alumnog
 */
public class Clases {
    
    private int id;
    private Materia materia; //por materia_id
    private Maestro maestro; //por maestro_id
    private String horario;
    private String numeroAula; //numero_aula
    private String diasSemana; //dias_semana
    private double costo;
    private String cicloEscolar; //ciclo_Escolar
    private String modalidad;

    public Clases(int id, Materia materia, Maestro maestro, String horario, String numeroAula, String diasSemana, double costo, String cicloEscolar, String modalidad) {
        this.id = id;
        this.materia = materia;
        this.maestro = maestro;
        this.horario = horario;
        this.numeroAula = numeroAula;
        this.diasSemana = diasSemana;
        this.costo = costo;
        this.cicloEscolar = cicloEscolar;
        this.modalidad = modalidad;
    }

    public Clases() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(String numeroAula) {
        this.numeroAula = numeroAula;
    }

    public String getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(String diasSemana) {
        this.diasSemana = diasSemana;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(String cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "Clases{" + "id=" + id + ", materia=" + materia + ", maestro=" + maestro + ", horario=" + horario + ", numeroAula=" + numeroAula + ", diasSemana=" + diasSemana + ", costo=" + costo + ", cicloEscolar=" + cicloEscolar + ", modalidad=" + modalidad + '}';
    }
    
    
    
}
