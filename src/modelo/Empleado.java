/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gusta
 */
public abstract class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado (String nombre,String apellido, String nss){
        primerNombre=nombre;
        apellidoPaterno=apellido;
        numeroSeguroSocial=nss;
    }
    
    public void establecerPrimerNombre (String nombre){
        primerNombre= nombre;
    }
    public String ObtenerPrimerNombre (){
        return primerNombre;
    }
       public void establecerApellidoPaterno (String apellido){
        apellidoPaterno= apellido;
    }
    public String ObtenerApellidoPaterno (){
        return apellidoPaterno;
    }
       public void establecerNumeroSeguroSocial (String nss){
       numeroSeguroSocial= nss;
    }
    public String ObtenerNumeroSeguroSocial (){
        return numeroSeguroSocial;
    }
    @Override
    public String toString(){
     return String.format("%s %s/nnumero de seguro social: %s",
   ObtenerPrimerNombre(),ObtenerApellidoPaterno(),ObtenerNumeroSeguroSocial() );
    }
    public abstract double ingresos ();
}

