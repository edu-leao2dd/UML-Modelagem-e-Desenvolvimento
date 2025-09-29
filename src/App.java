import main.Cliente; // Importa a classe Cliente do pacote main
import main.Pet; // Importa a classe Pet do pacote main
import java.time.LocalDate; // Importa a classe para trabalhar com datas
import java.time.format.DateTimeFormatter; // Importa o formatador de datas

public class App {
    public static void main(String[] args) throws Exception {
     
        // Cria um cliente com nome, CPF e contato
        Cliente cliente = new Cliente ("Eduardo luis","09055555555","021998888888");
        
        // Define o formato da data como dia/mês/ano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Cria uma data de nascimento a partir de uma string formatada
        LocalDate nascimento1 = LocalDate.parse("06/07/2025", formatter);
        // Cria uma segunda data de nascimento, dois anos antes da primeira
        LocalDate nascimento2 = nascimento1.minusYears(2);

        // Cria o primeiro pet com nome, espécie, data de nascimento e observações
            Pet pet1 = new Pet("Marron", "Vira Lata", nascimento1, "Cão macho de pelo marrom e estava usando camisa do Flamengo.");
            // Cria o segundo pet com nome, espécie, data de nascimento e observações
            Pet pet2 = new Pet("Miau", "Bombaim", nascimento2, "Gato lindo, escuro como a noite");
              
            // Adiciona os pets ao cliente e define o dono de cada pet
            cliente.adicionarPet(pet1);
            cliente.adicionarPet(pet2);
            
        // Exibe o nome do cliente no console
      System.out.println("Cliente:" + cliente.getNome());
       for (Pet pet : cliente.getPets()) {
            System.out.println("Pet: " + pet.getNome() + ", Especie: " + pet.getEspecie() + ", Dono: " + pet.getDono().getNome());
       }

    }
}
