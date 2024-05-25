import java.util.List;
import java.util.Objects;

public class Pessoa {

private String nome;

private String sexo;

private int idade;

public Pessoa() {

}

public Pessoa(String nome, String sexo, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
}

public Pessoa(Pessoa pessoa) {
this(pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade());
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

public List<Pessoa> populaPessoa() {
    Pessoa pessoa1 = new Pessoa("Douglas", "Masculino", 20);
    Pessoa pessoa2 = new Pessoa("Maria", "Feminino", 22);
    Pessoa pessoa3 = new Pessoa("Antônio", "Masculino", 19);
    Pessoa pessoa4 = new Pessoa("Fernanda", "Feminino", 21);
    Pessoa pessoa5 = new Pessoa("Ana", "Feminino", 19);
    return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(sexo, pessoa.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo, idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}