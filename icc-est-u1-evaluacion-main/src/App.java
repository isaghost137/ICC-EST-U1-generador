import models.Person;
import models.PersonasGenerator;
import models.MetodosOrdenamientoBusqueda;
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        
        PersonasGenerator generator = new PersonasGenerator();
        Person[] persons = generator.generarPersons();

        System.out.println("Listado de personas generadas:");
        for (Person persona : persons) {
            System.out.println(persona);
        }

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        mOB.sortByAgeWithInsertion(persons);
        mOB.showPeople(persons);

        int ageToSearch = 78;
        int result = mOB.searchBinaryByAge(persons, ageToSearch);
        if (result == -1) {
            System.out.println("No encontró la persona con edad " + ageToSearch);
        } else {
            System.out.println("Encontró en la posición " + result + " -> " + persons[result]);
        }

        CarrosGenerator generator2 = new CarrosGenerator();
        Carro[] carros = generator2.generarCarros();
        System.out.println("Listado de carros generados:");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}
