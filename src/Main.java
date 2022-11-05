import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Person> queueForTheAttraction = new LinkedList<>(generateClients());

        while (!queueForTheAttraction.isEmpty()) {
            Person attraction = queueForTheAttraction.poll();
            attraction.ticket = attraction.ticket - 1;
            if (attraction.ticket > 0) {
                queueForTheAttraction.add(attraction);
            }
            //System.out.println(" ------------------------------------------------------------- ");
            System.out.println(attraction.getName() + " " + attraction.getSurname() + " прокатился на аттракционе " +
                    "у него осталось(ся) " + attraction.ticket + " билет(а)");
        }
    }
    public static List<Person> generateClients() {

        return List.of(
                new Person("Алексей", "Алексеев", 2),
                new Person("Александр", "Васильев", 1),
                new Person("Аендрей", "Иванов", 3),
                new Person("Антон", "Сергеев", 4)
        );
    }
}
