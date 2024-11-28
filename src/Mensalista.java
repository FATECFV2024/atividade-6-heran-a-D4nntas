public class Mensalista extends empregado {

    private String cargo;

    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
    }

    public void setCargo(String c) {
        cargo = c;
    }

    public String getCargo() {
        return cargo;
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else if (cargo.equals("Senior")) {
            salario = 5500;
        } else {
            salario = 0;
        }
    }
}
