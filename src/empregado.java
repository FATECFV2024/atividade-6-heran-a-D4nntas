public class empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    public empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf() {
        double aux;
        if (salario < 0) {
            return 0;
        }
        if (salario < 1800) {
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }
        return aux;
    }

    public double calcularInss() {
        if (salario < 0) {
            return 0;
        }
        return (0.11 * salario);
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salário: " + getSalario());
        System.out.println("Imposto de Renda: " + calcularIrpf());
        System.out.println("Inss: " + calcularInss());
        System.out.println("");
    }

}
