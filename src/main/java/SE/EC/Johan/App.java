package SE.EC.Johan;

import SE.EC.Johan.model.Person;

public class App
{
    public static void main( String[] args ) {

        Person a = new Person(1,"Olle", "Polle");
        Person b = new Person(2,"Idnr2", "Hoppasjag");
        System.out.println(a.getFirstName());
        System.out.println(a.getPersonId());

        System.out.println(b.getLastName());
        System.out.println(b.getPersonId());

    }
}
