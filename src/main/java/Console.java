import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    private static BufferedReader readFromConsole =
            new BufferedReader(new InputStreamReader(System.in));


    // output in console
    public static void writeString(String  string){
        System.out.println(string);
    }

    //read

    public static String readString(){
        String inputStr = "";

        try {
            inputStr = readFromConsole.readLine();
            if(inputStr.equalsIgnoreCase("exit")) ;
                // дописать логику выхода
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputStr;
    }

public static Operations inputPoint(){
        while (true) {
            writeString("Введите какую оперцаю необходимо выполнить?" + "1- Проверить баланс счета" +
                    "2- Положить деньги на счет" +
                    "3- Снять деньги со счета" +
                    "4- Завершить обслуживание");

            try {
                Integer i = Integer.parseInt(readString());
                return Operations.getOperation(i);
            } catch (IllegalArgumentException e) {
                writeString("Операции не существует");
            }
        }
}

}
