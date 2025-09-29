package main; // Define o pacote onde a classe está localizada

import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas
import java.util.List; // Importa a interface List, usada para declarar a lista de pets

public class Cliente {
    // Atributos privados que representam os dados do cliente
    private String nome;
    private String cpf;
    private String contato;
    private List<Pet> pets; // Lista de pets que pertencem ao cliente

    // Construtor que inicializa os dados do cliente e cria uma lista vazia de pets
    public Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
        this.pets = new ArrayList<>(); // Inicializa a lista de pets como vazia
    }
    // Métodos getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(     
    String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Pet> getPets(){
        return pets; // Retorna a lista de pets do cliente
    }

    // Método que retorna uma representação textual do cliente
        @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", contato=" + contato + "]";
    }

    public void adicionarPet(Pet pet) {
        pet.setDono(this); // Define este cliente como dono do pet
        pets.add(pet); // Adiciona o pet à lista

    }
    
}
