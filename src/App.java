import main.Cliente;
import main.Pet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
     
        Cliente cliente = new Cliente ("Eduardo luis","09055555555","021998888888");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate nascimento1 = LocalDate.parse("06/07/2025", formatter);
        LocalDate nascimento2 = nascimento1.minusYears(2);

            Pet pet1 = new Pet("Marron", "Vira Lata", nascimento1, "Cão macho de pelo marrom e estava usando camisa do Flamengo.");
            Pet pet2 = new Pet("Miau", "Bombaim", nascimento2, "Gato lindo, escuro como a noite");
              
            cliente.adicionarPet(pet1);
            cliente.adicionarPet(pet2);

      System.out.println("Cliente:" + cliente.getNome());
       for (Pet pet : cliente.getPets()) {
            System.out.println("Pet: " + pet.getNome() + ", Especie: " + pet.getEspecie() + ", Dono: " + pet.getDono().getNome());
       }

    }
}
