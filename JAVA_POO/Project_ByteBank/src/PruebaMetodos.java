public class PruebaMetodos {
    public static void main(String[] args) {
        //Deposito en mi cuenta
        Cuenta miCuenta = new Cuenta(1);
        miCuenta.setSaldo(300);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());

        //Retiro en mi cuenta
        miCuenta.retirar(200);
        System.out.println(miCuenta.getSaldo());

        //Deposita de la cuenta de gimena a mi cuenta
        Cuenta cuentaDeJimena = new Cuenta(1);
        cuentaDeJimena.depositar(1000);
        boolean puedeTransferir = cuentaDeJimena.transferir(400, miCuenta);

        //Valido la transferencia
        if (puedeTransferir){
            System.out.println("Transferencia exitosa");
        }else {
            System.out.println("Error de transferencia");
        }
        //Muestro el saldo actual de cada cuenta
        System.out.println(cuentaDeJimena.getSaldo());
        System.out.println(miCuenta.getSaldo());
    }
}
