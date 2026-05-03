public class Cachorro extends Animal{
       
       public Cachorro(String nome, int idade){
              super(nome, idade);
       }

       public String emitirSom(){

        return "Cachorro disse: auau";
       }

       public String realizarComportamento(){

        return "O cachorro correu";
       }
}