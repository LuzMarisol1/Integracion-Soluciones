//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.22 at 02:04:22 p. m. CDT 
//


package me.tell.ventas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idproducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precioU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idproducto",
    "precioU"
})
@XmlRootElement(name = "ModificarVentaRequest")
public class ModificarVentaRequest {

    protected int idproducto;
    protected int precioU;

    /**
     * Gets the value of the idproducto property.
     * 
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * Sets the value of the idproducto property.
     * 
     */
    public void setIdproducto(int value) {
        this.idproducto = value;
    }

    /**
     * Gets the value of the precioU property.
     * 
     */
    public int getPrecioU() {
        return precioU;
    }

    /**
     * Sets the value of the precioU property.
     * 
     */
    public void setPrecioU(int value) {
        this.precioU = value;
    }

}