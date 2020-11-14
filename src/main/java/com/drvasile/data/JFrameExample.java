package com.drvasile.data;

import javax.swing.*;

public class JFrameExample {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        String input = JOptionPane.showInputDialog(jFrame, "Type smth...");
        System.out.println(input);
    }
}
