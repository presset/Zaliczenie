package ZadaniaDomowe.Dziedziczenie;
//Stwórz klasę `Person`, która ma spełniać następujące wymogi:
//1. Mieć prywatne atrybuty:
// * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
// * `firstName` - atrybut określający imię autora,
// * `lastName` - atrybut określający nazwisko autora,
public class Person extends Author{
    public Person(int id, String firsName, String lastName) {
        super(id, firsName, lastName);
    }
//    private int id;
//   private String firstName;
// private  String lastName;



}
