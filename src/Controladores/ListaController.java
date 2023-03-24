
package Controladores;

import Modelos.Pacientes;
import Modelos.ListaModel;
import Modelos.ListaModel2;
import Vistas.frmVistaPrincipal;
import Vistas.frmVistaDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
        
public class ListaController implements ActionListener {
    frmVistaPrincipal VistaLista;
    frmVistaDatos VistaPacientes;
    ListaModel ModeloLista;
    ListaModel2 ModeloLista1;

    public ListaController(frmVistaPrincipal VistaLista, frmVistaDatos VistaPacientes, ListaModel ModeloLista, ListaModel2 ModeloLista1) {
        this.VistaLista = VistaLista;
        this.VistaPacientes = VistaPacientes;
        this.ModeloLista = ModeloLista;
        this.ModeloLista1 = ModeloLista1;
        
        this.VistaLista.btnMedicoA.addActionListener(this);
        this.VistaLista.btnMedicoB.addActionListener(this);
        this.VistaPacientes.btnAtenderA.addActionListener(this);
        this.VistaPacientes.btnAtenderB.addActionListener(this);
        this.VistaLista.btnListaPacientes.addActionListener(this);
        
        //PONER A LA ESCUCHA LA VISTA        
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }


    
    


    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaLista.btnMedicoA){
            this.ModeloLista.EncolarPaciente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
            //mostrar los datos en el text area
            Queue <Pacientes>listaLocal = this.ModeloLista.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPaciente: listaLocal)
            {
               Cadena = Cadena + MiListaPaciente.getApellidos()+" "+MiListaPaciente.getNombre()+"\n";
               this.VistaPacientes.txtListaPacienteA.setText(Cadena);
            }
                this.VistaLista.txtApellidos.setText("");
                this.VistaLista.txtNombre.setText("");
        }

        if(e.getSource() == this.VistaLista.btnMedicoB){
            this.ModeloLista1.EncolarPaciente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
            //mostrar los datos en el text area
            Queue <Pacientes>listaLocal = this.ModeloLista1.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPaciente: listaLocal)
            {
               Cadena = Cadena + MiListaPaciente.getApellidos()+" "+MiListaPaciente.getNombre()+"\n";
               this.VistaPacientes.txtListaPacienteB.setText(Cadena);  
            }
                this.VistaLista.txtApellidos.setText("");
                this.VistaLista.txtNombre.setText("");
        }
        
        if(e.getSource() == this.VistaPacientes.btnAtenderA)
        {
            this.ModeloLista.DesEncolar();
             this.ModeloLista1.EncolarPaciente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
            //mostrar los datos en el text area
            Queue <Pacientes>listaLocal = this.ModeloLista1.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPaciente: listaLocal)
            {
               Cadena = Cadena + MiListaPaciente.getApellidos()+" "+MiListaPaciente.getNombre()+"\n";              
            }
            this.VistaPacientes.txtListaPacienteB.setText(Cadena);  
            JOptionPane.showMessageDialog(null, "Paciente atendido!!!");
            
        }
        
        if(e.getSource() == this.VistaPacientes.btnAtenderB)
        {
            this.ModeloLista1.DesEncolar();
            this.VistaPacientes.txtListaPacienteB.setText("");
            JOptionPane.showMessageDialog(null, "Paciente atendido!!!");
            
        }
        
        if(e.getSource() == this.VistaLista.btnListaPacientes)
        {
            this.VistaPacientes.setLocationRelativeTo(null);
            this.VistaPacientes.setVisible(true);          
        }
            
    }
}
