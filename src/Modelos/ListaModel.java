
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
       
       JOptionPane.showMessageDialog(null,"Paciente agregado a la lista!!!");       
    }
    
    public  Queue ListarPaciente()
    {
        return this.ListaPaciente;
    }
    
    public void DesEncolar()
    { 
        Pacientes eliminar = ListaPaciente.poll();
       
        //this.ListaPaciente.poll();
    }
}
