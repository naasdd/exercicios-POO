public class Veterinario {

       private String nome;
       private int idade;

       public Veterinario(String nome, int idade) {
              this.nome = nome;
              this.idade = idade;

       }

       public String examinar(Animal animal) {

              return "O médico examinou e " + animal.emitirSom();
       }
       
}