package HashCode;

import java.util.Objects;

public class Cliente
{
    private String nome;
    private String email;

    //Construtor

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //HeshCode


    @Override
    public boolean equals(Object o) // è uma op lenta porem é sempre correta
    {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() // Resposta mas rapida porem não e semrpe correta
    {
        return Objects.hashCode(nome);
    }
}
