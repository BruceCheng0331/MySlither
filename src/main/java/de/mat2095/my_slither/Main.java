package de.mat2095.my_slither;

import javax.swing.*;


public final class Main {

    public static void main(String[] args) {

        System.setProperty("sun.java2d.opengl", "true");

        // workaround to fix issue on linux: https://github.com/bulenkov/Darcula/issues/29
        UIManager.getFont("Label.font");
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarculaLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        new MySlitherJFrame().setVisible(true);
        //test if I can push

    }
}
