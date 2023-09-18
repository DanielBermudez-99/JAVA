
class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total = 0;
    public Cuenta(int agencia){

        if (agencia <= 0) {
            System.out.println("No se permiten valores menores o iguales a 0");
            this.agencia = 1;
        }else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }


    //No retorna Valor
    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Retiro exitoso");
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.saldo -= valor;
            cuenta.depositar(valor);
            System.out.println("Transaccion Exitosa");
            return true;
        }else {
            System.out.println("Transaccion Fallida");
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0) {
            this.agencia = agencia;
        }else {
            System.out.println("No esta permitido valores negativos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(Cliente cliente) {

        this.titular = cliente;
    }
    public Cliente getTitular() {

        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
