package command;

import maitain.ConsoleOutput;
import resources.AllowedCard;


public class LoginCommand implements Command {
    AllowedCard allowedCard = new AllowedCard();

    /**
     * Login class check allowed cardholders of bank
     */
    @Override
    public void execute() {
        while (true) {
            ConsoleOutput.writeString("Введите номер карты:");

            String cardNumber = ConsoleOutput.readString();
            if (allowedCard.BaseOfCards().containsKey(cardNumber)) {
                ConsoleOutput.writeString("Введите pin-code");
                String pin = ConsoleOutput.readString();
//                if (allowedCard.BaseOfCards().containsValue(pin)) {
                if (allowedCard.BaseOfCards().get(cardNumber).equals(pin)) {
                    ConsoleOutput.writeString("Добро пожаловать!");
                    break;
                } else ConsoleOutput.writeString("Неверный pin-code");
            } else ConsoleOutput.writeString("Неверный номер карты");
        }
        }
    }
