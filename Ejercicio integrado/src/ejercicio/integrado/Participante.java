/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.integrado;

/**
 *
 * @author Aulas Heredia
 */
public class Participante {
    
     public String Nombre;
     
   
    public int Edad;
    public int Tiempoestimado;
    public int Numerocorredor;
   
    
    public Participante(String nombre, String apellidos, String cedula, String codigo) {
        this.Nombre = nombre;
        this.Tiempoestimado = Tiempoestimado;
        this.Numerocorredor = Numerocorredor;
        this.Edad = Edad;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTiempoestimado() {
        return Tiempoestimado;
    }

    public void setTiempoestimado(int Tiempoestimado) {
        this.Tiempoestimado = Tiempoestimado;
    }

    public int getNumerocorredor() {
        return Numerocorredor;
    }

    public void setNumerocorredor(int Numerocorredor) {
        this.Numerocorredor = Numerocorredor;
    }

    public Participante(String Nombre, int Edad, int Tiempoestimado, int Numerocorredor) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Tiempoestimado = Tiempoestimado;
        this.Numerocorredor = Numerocorredor;
    }
    

    
    
    
    
}
