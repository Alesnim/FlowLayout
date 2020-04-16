package com.javalesson.graphic.layout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}


class FlowLayoutTest extends JFrame
{
    public FlowLayoutTest()
    {
        super("FlowLayout");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(300, 120);
        // Панель содержимого
        Container container = getContentPane();
        /*
         * Определение последовательного расположения
         * с выравниванием компонентов по центру
         */
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        // добавляем компоненты
        container.add( new JButton("Школа"   ));
        container.add( new JButton("Институт"));
        container.add( new JButton("Академия"));
        // Открываем окно
        setVisible(true);
    }

}