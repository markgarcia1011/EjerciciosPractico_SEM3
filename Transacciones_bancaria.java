
package transacciones_bancaria;



public class Transacciones_bancaria {
    
 public static void main(String[] args) {
       
        Cuenta_bancaria cuenta =new Cuenta_bancaria();
        Scanner leer = new Scanner(System.in);
        
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        
        double Abono, Retiro;
        System.out.println("Igrese los datos que se le solicita acontinuacion:");
        System.out.println("Nombre del propietario:");
        duiCliente=leer.nextLine();
        
        System.out.println("Numero DUI:");
        nombreCliente=leer.nextLine();
        
        System.out.println("Telefono: ");
        telefonoCliente=leer.nextLong(); 
        
        cliente propietario = new cliente(duiCliente,nombreCliente,telefonoCliente);
        
        System.out.println("Ingrese la cantidad a abonar: ");
        cuenta.abonar(Abono=leer.nextDouble());
        
        System.out.println("Ingrese cantidad a retirar");
        cuenta.retirar(Retiro=leer.nextDouble());
        
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);
        
        
        System.out.println("Datos del propietario : \n" + cuenta.datosPropietarioCuenta());
    }
}
