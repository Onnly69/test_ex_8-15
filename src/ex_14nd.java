public class ex_14nd extends ex14 {
    @Override
    public void viteza() {
        System.out.println("Intel > AMD ;) XD");
    }

    public static void main(String[] args) {
        ex14 cpu = new ex14();
        cpu.setDenumire("i9 9900k");
        cpu.socket="LGA";
        cpu.companie="Intel";

        System.out.println(cpu.getDenumire() + " socket " + cpu.socket + "" +
                " de la compania=> " + cpu.companie);
        cpu.viteza();

    }

}
