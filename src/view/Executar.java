package view;

import controller.ThreadId;

public class Executar {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new ThreadId();
            thread.start();
        }
    }
}
