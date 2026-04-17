package exercicio_PedidoComposition.entities;

import java.time.LocalDate;

public class Cliente
{
   private String nome;
   private String email;
   private LocalDate localDate;

   //Gets and Setters

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

   public LocalDate getLocalDate() {
      return localDate;
   }

   public void setLocalDate(LocalDate localDate) {
      this.localDate = localDate;
   }

   //Construtores


   public Cliente(String nome, String email, LocalDate localDate) {
      this.nome = nome;
      this.email = email;
      this.localDate = localDate;
   }
}
