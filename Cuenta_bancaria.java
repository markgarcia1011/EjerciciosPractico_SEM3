
package cuenta_bancaria;


public class Cuenta_bancaria {
   long numeroCuenta;
     cliente propietarioCuenta;
   double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta+= cantidad; 
    }
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo Insuficiente");
        }
        saldoCuenta-= cantidad;
    }
    public String datosPropietarioCuenta(){
        String informacion="";
        informacion += "Dui: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n";
        informacion += "Telefóno: " + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    }
    
}
