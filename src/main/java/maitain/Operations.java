package maitain;

public enum Operations {

    DEPOSIT, WITHDRAW, BALANCE, EXIT;

    public static Operations getOperation(Integer i) {
        switch (i) {

            case 1:
                return BALANCE;

            case 2:
                return DEPOSIT;

            case 3:
                return WITHDRAW;

            case 4:
                return EXIT;

            default:
                throw new IllegalArgumentException();
        }
    }
}
