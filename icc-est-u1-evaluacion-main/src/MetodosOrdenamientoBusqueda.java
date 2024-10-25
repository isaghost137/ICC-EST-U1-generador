import models.Person;

public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            // Intercambiar las posiciones
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
        int tamanio = people.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            // Intercambiar las posiciones
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person personaAux = people[i];
            int j = i - 1;

            // Mueve los elementos mayores que personaAux una posición adelante
            while (j >= 0 && people[j].getAge() > personaAux.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = personaAux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        int tamanio = people.length;
        for (int i = 1; i < tamanio; i++) {
            Person personaAux = people[i];
            int j = i - 1;

            while (j >= 0 && people[j].getHeight() > personaAux.getHeight()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = personaAux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (people[mid].getAge() == age) {
                return mid;
            } else if (people[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // No encontrado
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (people[mid].getHeight() == height) {
                return mid;
            } else if (people[mid].getHeight() < height) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // No encontrado
    }

    // Método que imprime el listado de personas
    public void showPeople(Person[] people) {
        for (Person persona : people) {
            System.out.println(persona);
        }
    }
}
