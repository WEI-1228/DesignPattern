package cn.anlper.state;

public class Main {
    public static void main(String[] args) {
        InitState initState = new InitState();
        FirstState firstState = new FirstState();
        SecondState secondState = new SecondState();
        EndState endState = new EndState();

        Context context = new Context();
        initState.doAction(context);
        System.out.println(context.getState());
        System.out.println();

        firstState.doAction(context);
        System.out.println(context.getState());
        System.out.println();

        secondState.doAction(context);
        System.out.println(context.getState());
        System.out.println();

        endState.doAction(context);
        System.out.println(context.getState());

    }
}
