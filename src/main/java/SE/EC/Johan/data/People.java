package SE.EC.Johan.data;

import SE.EC.Johan.model.Person;

import java.util.Arrays;

public class People {

    private static Person[] personArray = new Person[0];

    public int size(){
        return personArray.length;
    }

    public Person[] findAll(){
        return personArray;
    }

    public Person findById(int personId){

        for(int i = 0; i < personArray.length; i++){
            if (personArray[i].getPersonId() == personId){
                return personArray[i];
            }
        }
        return null;
    }

    public Person createNewPerson(String firstName, String lastName){
        Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
        int offSet = personArray.length;
        personArray = Arrays.copyOf(personArray, personArray.length + 1);
        personArray[offSet] = newPerson;
        return newPerson;
    }

    public void clear(){
        Person[] emptyArray = new Person[0];
        personArray = emptyArray;
    }

}
