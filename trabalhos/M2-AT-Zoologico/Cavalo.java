public class Cavalo extends Animal{
       
       public Cavalo(String nome, int idade){
              super(nome, idade);
       }

       public String emitirSom(){

        return "Cavalo disse: cavaalo";
       }

       public String realizarComportamento(){

        return "O cavalo correu";
       }
}