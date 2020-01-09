package SE.EC.Johan.data;

import SE.EC.Johan.model.Person;
import SE.EC.Johan.model.Todo;

import java.util.Arrays;

public class TodoItems {

    private static Todo[] todoArray = new Todo[0];

    public int size(){
        return todoArray.length;
    }

    public Todo[] findAll(){
        return todoArray;
    }

    public Todo findById(int todoId){

        for(int i = 0; i < todoArray.length; i++){
            if (todoArray[i].getTodoId() == todoId){
                return todoArray[i];
            }
        }
        return null;
    }

    public static Todo createTodo(String description){
        Todo newTodo = new Todo(TodoSequencer.nextTodoId(),description);
        int offSet = todoArray.length;
        todoArray = Arrays.copyOf(todoArray,todoArray.length + 1);
        todoArray[offSet] = newTodo;

        return newTodo;
    }




    public void clear(){
        Todo[] emptyArray = new Todo[0];
        todoArray = emptyArray;
    }

    //---------------------------------------------------------------//

    public Todo[] findByDoneStatus(boolean doneStatus){

        return null;
    }


}
