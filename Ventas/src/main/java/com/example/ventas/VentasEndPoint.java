/*package com.example.ventas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class VentasEndPoint {
    @Autowired
    private VentasEndPoint isaludadores;

    //@PayloadRoot(namespace = "http://www.example.org/ventas", localPart = "SaludarRequest")

    /*@ResponsePayload
    public V dameSaludo(@RequestPayload SaludarRequest peticion){
        SaludarResponse respuesta  = new SaludarResponse();
        respuesta.setRespuesta("Hola " + peticion.getNombre());

        Saludadores saludadores = new Saludadores();
        saludadores.setNombre(peticion.getNombre());
        isaludadores.save(saludadores);

        return respuesta;
    }

    @PayloadRoot(namespace = "http://tell.me/mensajes", localPart = "BuscarSaludosRequest")

    @ResponsePayload
    public BuscarSaludosResponse dameSaludadores(@RequestPayload BuscarSaludosRequest peticion){
        BuscarSaludosResponse respuesta = new BuscarSaludosResponse();
        Iterable<Saludadores>listaSaludadores = isaludadores.findAll();
        
        for(Saludadores ls : listaSaludadores){
            BuscarSaludosResponse.Saludador saludador = new  BuscarSaludosResponse.Saludador();
            saludador.setNombre(ls.getNombre());
            saludador.setId(ls.getId());
            respuesta.getSaludador().add(saludador);
        }
        return respuesta;
    }
}
*/
