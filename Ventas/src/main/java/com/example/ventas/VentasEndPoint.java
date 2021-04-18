package com.example.ventas;

import org.example.ventas.RealizarVentaRequest;
import org.example.ventas.RealizarVentaResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class VentasEndPoint {
  @Autowired
  private iventas iventas;

  @PayloadRoot(namespace = "http://tell.me/ventas", localPart = "RealizarVentaRequest")

  @ResponsePayload
  public RealizarVentaResponse guardaVenta(@RequestPayload RealizarVentaRequest peticion) {
    RealizarVentaResponse respuesta = new RealizarVentaResponse();
    respuesta.setRespuesta("Venta realizada ");

    ProductosV productosv = new ProductosV();
    productosv.setIdproducto(peticion.getIdproducto());
    productosv.setNombre(peticion.getNombre());
    productosv.setDescripcion(peticion.getDescripcion());
    productosv.setPrecioU(peticion.getPrecioU());
    productosv.setEnStock(peticion.getEnStock());
    iventas.save(productosv);

    return respuesta;
  }
}
