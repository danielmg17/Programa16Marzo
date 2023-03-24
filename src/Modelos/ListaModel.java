
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
        
public class ListaModel {
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
    
    public void DesEncolar()
    { 
        this.ListaPaciente.poll();
    }
}
