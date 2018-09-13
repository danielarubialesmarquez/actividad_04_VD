
package main;

import view.viewOperacion;
import model.ModelOperaciones;
import controller.controllerOperacion;
import extras.DataValidation;

public class Main {
    private static viewOperacion viewOperacion;
    private static ModelOperaciones modelOperaciones;
    private static controllerOperacion controllerOperacion;
    private static DataValidation Datavalidation;

    public static void main(String[] args)
    {
        viewOperacion = new viewOperacion();
        modelOperaciones = new ModelOperaciones();
        controllerOperacion = new controllerOperacion(viewOperacion, modelOperaciones);
        Datavalidation = new DataValidation();
    }
}
    