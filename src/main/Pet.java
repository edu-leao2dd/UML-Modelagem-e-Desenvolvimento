package main; // Define o pacote onde a classe está localizada

import java.time.LocalDate; // Importa a classe LocalDate para representar datas (nascimento do pet)

public class Pet {
   // Atributos privados que representam as características do pet
   private String nome; // Nome do pet
   private String especie; // Espécie ou raça do pet
   private LocalDate dataNascimento; // Data de nascimento do pet
   private String observacoes; // Observações adicionais sobre o pet
   private Cliente dono; // Referência ao dono do pet (objeto da classe Cliente)

// Construtor sem dono — usado quando o dono será definido depois
   public Pet(String nome, String especie, LocalDate dataNascimento, String observacoes) {
    this.nome = nome;
    this.especie = especie;
    this.dataNascimento = dataNascimento;
    this.observacoes = observacoes;
   }
// Construtor com dono — usado quando já se sabe quem é o dono no momento da criação
   public Pet(String nome, String especie, LocalDate dataNascimento, String observacoes, Cliente dono){
    this.nome = nome;
    this.especie = especie;
    this.dataNascimento = dataNascimento;
    this.observacoes = observacoes; 
    this.dono = dono;
   }

   // Métodos getters — usados para acessar os atributos do pet
   public String getNome() {
    return nome;
   }

   public String getEspecie() {
    return especie;
   }

   public LocalDate getDataNascimento() {
    return dataNascimento;
   }

   public String getObservacoes() {
    return observacoes;
   }
// Métodos setters — usados para modificar os atributos do pet
   public void setNome(String nome) {
    this.nome = nome;
   }

   public void setEspecie(String especie) {
    this.especie = especie;
   }

   public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
   }

   public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
   }
 // Getter e setter para o dono do pet
   public Cliente getDono() {
      return dono;
   }
   public void setDono(Cliente dono) {
      this.dono = dono;
   }
 // Método toString — retorna uma descrição completa do pet
   @Override
   public String toString() {
    return "Pet [nome=" + nome + ", especie=" + especie + ", dataNascimento=" + dataNascimento + ", observacoes="
            + observacoes + ", dono=" + (dono != null ? dono.getNome() : "sem dono") + "]";
   }

   
    
}
