public class Person {

    private String name;
    private String surname;
    int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTicket() {
        return ticket;
    }
}
