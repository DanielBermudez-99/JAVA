public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(222);
        Cuenta cuenta2 = new Cuenta(333);
        System.out.println(Cuenta.getTotal());
    }

}
