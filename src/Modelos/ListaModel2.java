/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class ListaModel2 {
    Queue <Pacientes> ListaPaciente = new LinkedList();
    public void EncolarPaciente(String nom, String ape)
    {
       Pacientes nuevoCliente = new Pacientes(ape,nom); 
       this.ListaPaciente.add(nuevoCliente);

    }
    
    public  Queue ListarPaciente()
    {
        return this.ListaPaciente;
    }
    
    public  void DesEncolar()
    { 
        this.ListaPaciente.poll();
        //Pacientes eliminar = ListaPaciente.poll();
    }
}
