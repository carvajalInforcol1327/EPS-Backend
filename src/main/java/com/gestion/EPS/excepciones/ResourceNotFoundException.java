package com.gestion.EPS.excepciones;

public class ResourceNotFoundException extends RuntimeException {

	//EN ESTE CASO EL UID NOS PERMITE SERIALIZAR EL OBJETO QUE SE ESTA MANEJANDO 
    //MEDIANTE LA EXCEPCIÓN SE HACE PARA MANTENER UN CONTROL SOBRE LOS CAMBIOS 
    private static final long serialVersionUID = 1L;



    public ResourceNotFoundException(String mensaje) {
        super(mensaje);
    }

	
}
