package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelOperaciones;
import view.viewOperacion;
import extras.DataValidation;
public class controllerOperacion implements ActionListener
{
    private final ModelOperaciones modelOperaciones;
    private final viewOperacion viewOperacion;
    private final DataValidation DataValidation;
    public controllerOperacion(viewOperacion viewOperacion, ModelOperaciones modelOperaciones)
    {
        this.viewOperacion = viewOperacion;
        this.modelOperaciones = modelOperaciones;
        DataValidation = new DataValidation();
        viewOperacion.jb_resta.addActionListener(this);
        viewOperacion.jb_suma.addActionListener(this);
        viewOperacion.jb_multiplicacion.addActionListener(this);
        viewOperacion.jb_division.addActionListener(this);
        viewOperacion.jb_modulo.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewOperacion.jb_suma)
       {
           float numero1 = 0.0f;//variable numero1
            float numero2 = 0.0f;//variable numero2
            numero1 = Float.parseFloat(viewOperacion.jtf_numero1.getText());//convierte el texto jtf a flotante y lo guarda en numero1
            numero2 = Float.parseFloat(viewOperacion.jtf_numero2.getText());//convierte el texto jtf a flotante y lo guarda en numeri2
            float resultado = numero1 + numero2;
            viewOperacion.jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperacion.jb_resta)
       {
           float numero1 = 0.0f;
             float numero2 = 0.0f;
             numero1 = Float.parseFloat(viewOperacion.jtf_numero1.getText());
             numero2 = Float.parseFloat(viewOperacion.jtf_numero2.getText());
             float resultado = numero1 - numero2;
             viewOperacion.jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperacion.jb_multiplicacion)
       {
            float numero1 = 0.0f;
            float numero2 = 0.0f;
            numero1 = Float.parseFloat(viewOperacion.jtf_numero1.getText());
            numero2 = Float.parseFloat(viewOperacion.jtf_numero2.getText());
            float resultado = numero1 * numero2; 
            viewOperacion.jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperacion.jb_division)
       {
            float numero1 = 0.0f;
            float numero2 = 0.0f;
            numero1 = Float.parseFloat(viewOperacion.jtf_numero1.getText());
            numero2 = Float.parseFloat(viewOperacion.jtf_numero2.getText());
            float resultado = numero1 / numero2; 
            viewOperacion.jtf_resultado.setText(String.valueOf(resultado));
       }
       if(e.getSource()==viewOperacion.jb_modulo)
       {
           float numero1 = 0.0f;
             float numero2 = 0.0f;
             numero1 = Float.parseFloat(viewOperacion.jtf_numero1.getText());
             numero2 = Float.parseFloat(viewOperacion.jtf_numero2.getText());
             float resultado = numero1 % numero2; 
             viewOperacion.jtf_resultado.setText(String.valueOf(resultado)); 
       }
    }
    private void initView() 
    {
        viewOperacion.setTitle("Operaciones básicas");
        viewOperacion.setLocationRelativeTo(null);
        viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
        viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
        viewOperacion.setVisible(true);
    }
}
