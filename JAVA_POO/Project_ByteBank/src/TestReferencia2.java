public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("32534534");
        diego.setTelefono("7165321");

        Cuenta cuentaDeDiego = new Cuenta(1);
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setTitular(diego);

        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);
    }
}
