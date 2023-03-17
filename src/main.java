
import Controladores.ListaController;
import Modelos.ListaModel;
import Modelos.ListaModel2;
import Vistas.frmVistaDatos;
import Vistas.frmVistaPrincipal;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmVistaPrincipal VistaPrin = new frmVistaPrincipal();
        frmVistaDatos VistaPac = new frmVistaDatos();
        ListaModel ModeloVista = new ListaModel();
        ListaModel2 ModeloVista1 = new ListaModel2(); 
        
        ListaController ControladorLista = new ListaController(VistaPrin,VistaPac, ModeloVista, ModeloVista1);
        
    }
    
}
