package calculator.view;

import calculator.presenter.Presenter;
import calculator.util.Command;

import java.util.Scanner;

public class View {
    private Presenter presenter;
    private Scanner in;

    public View(Presenter presenter) {
        this.presenter = presenter;
        this.in = new Scanner(System.in);
    }


    public void print(double value) {
        System.out.printf("Результат: %s\n", value);
    }

    public void run() {
        Command com;
        double a = getNumb("a: ");
        presenter.log("a: " + a);
        while (true) {
            String command = prompt("Введите команду: (SUM/DIFF/PROD/DIV/SQRT/POW/CLEAR/EXIT)\n");
            presenter.log("input command: " + command);
            commandValidation(command);
            com = Command.valueOf(command);
            if (com == Command.EXIT) return;
            if (com == Command.CLEAR) {
                a = 0;
                print(a);
                continue;
            }
            if (com == Command.SQRT) {
                a = presenter.sqrt(a);
                print(a);
                continue;
            }
            double b = getNumb("b: ");
            presenter.log("b: " + b);
            switch (com) {
                case SUM:
                    a = presenter.sum(a, b);
                    print(a);
                    break;
                case DIFF:
                    a = presenter.diff(a, b);
                    print(a);
                    break;
                case PROD:
                    a = presenter.prod(a, b);
                    print(a);
                    break;
                case DIV:
                    a = presenter.div(a, b);
                    print(a);
                    break;
                case POW:
                    a = presenter.pow(a, b);
                    print(a);
                    break;
            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine().toUpperCase();
    }

    private double getNumb(String text) {
        try {
            System.out.println(text);
            return Double.parseDouble(in.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Вы ввели не число");
        }
    }

    private boolean commandValidation(String action) {
        try {
            Enum.valueOf(Command.class, action);
            return true;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Unexpected command! ");
        }

    }

    public void getHistory() {
        System.out.println("Operations list: ");
        presenter.getHistory();
    }

    public void getDisplayHistory() {
        System.out.println("\nDisplay input operations history: ");
        presenter.getDisplayHistory();
    }
}
