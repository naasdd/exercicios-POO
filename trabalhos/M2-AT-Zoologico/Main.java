public class Main{
        public static void main(String[] args){
            System.out.println("> Iniciando sistema do zoológico");
            
            Cachorro dog = new Cachorro("joseDOG", 5);
            Cavalo cavalo = new Cavalo("joseCAVALO", 12);
            Preguica pigiça = new Preguica("josePREGUICA", 33);

            System.out.println(dog.emitirSom());
            System.out.println(cavalo.emitirSom());
            System.out.println(pigiça.emitirSom());
            
            System.out.println(dog.realizarComportamento());
            System.out.println(cavalo.realizarComportamento());
            System.out.println(pigiça.realizarComportamento());


            Veterinario vet = new Veterinario("jose", 19);
            System.out.println(vet.examinar(dog));
            System.out.println(vet.examinar(cavalo));
            System.out.println(vet.examinar(pigiça));


            Zoologico zoo = new Zoologico();
            zoo.inserirAnimal(pigiça);
            zoo.inserirAnimal(dog);
            zoo.inserirAnimal(cavalo);

            zoo.percorrer();
        }
}