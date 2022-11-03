package command;

import maitain.ConsoleOutput;

public class ExitCommand implements Command {


    @Override
    public void execute() {
        ConsoleOutput.writeString("Для выхода из банка введите \" 1 \"  или \" 2\" для отмены действия");

        String answer = ConsoleOutput.readString();
        if(answer.equals("1"))
            ConsoleOutput.writeString("До свидания!");
    }
}
