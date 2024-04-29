package entities;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    public Cliente(
            String nome,
            String sobrenome,
            String dataNascimento

    ) {
        if(!nome.isEmpty() && !sobrenome.isEmpty() && !dataNascimento.isEmpty()){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.dataNascimento = dataNascimento;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
