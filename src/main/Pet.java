package main;

import java.time.LocalDate;

public class Pet {
   private String nome;
   private String especie;
   private LocalDate dataNascimento;
   private String observacoes;
   private Cliente dono;


   public Pet(String nome, String especie, LocalDate dataNascimento, String observacoes) {
    this.nome = nome;
    this.especie = especie;
    this.dataNascimento = dataNascimento;
    this.observacoes = observacoes;
   }

   public Pet(String nome, String especie, LocalDate dataNascimento, String observacoes, Cliente dono){
    this.nome = nome;
    this.especie = especie;
    this.dataNascimento = dataNascimento;
    this.observacoes = observacoes; 
    this.dono = dono;
   }

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

   public Cliente getDono() {
      return dono;
   }
   public void setDono(Cliente dono) {
      this.dono = dono;
   }

   @Override
   public String toString() {
    return "Pet [nome=" + nome + ", especie=" + especie + ", dataNascimento=" + dataNascimento + ", observacoes="
            + observacoes + ", dono=" + (dono != null ? dono.getNome() : "sem dono") + "]";
   }

   
    
}
