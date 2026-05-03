public class Zoologico {

       private Animal[] jaula;
       private int qtdAnimais;

       public Zoologico() {
              this.jaula = new Animal[10];
              this.qtdAnimais = 0;
       }

       public void inserirAnimal(Animal animal) {
              if (qtdAnimais >= 10) {
                     System.out.println("Jaula lotada!");
              }

              this.jaula[qtdAnimais++] = animal;

              System.out.println("Sucesso, " + qtdAnimais + "º animal inserido!");
       }

       public void percorrer() {
              for (Animal animal : jaula) {
                     if (animal != null) {
                            System.out.println(animal.realizarComportamento());
                     }
              }
              System.out.println("Fim de percorrer a jaula.");
       }

}