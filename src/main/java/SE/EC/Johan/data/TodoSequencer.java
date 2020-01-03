package SE.EC.Johan.data;

public class TodoSequencer {

    private static int todoId = 0;

    public static int nextTodoId(){
        return ++todoId;
    }

    public static int reset(){
        return todoId = 0;
    }

}
