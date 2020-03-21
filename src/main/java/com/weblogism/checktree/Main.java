package com.weblogism.checktree;

import javax.swing.*;
import javax.swing.tree.*;

public class Main extends JFrame {

    public Main() {
        super();
        setSize(500, 500);

        final JCheckBoxTree cbt = new JCheckBoxTree();
        this.getContentPane().add(cbt);

        cbt.addCheckChangeEventListener(event -> {
            System.out.println("event");
            TreePath[] paths = cbt.getCheckedPaths();
            for (TreePath tp : paths) {
                for (Object pathPart : tp.getPath()) {
                    System.out.print(pathPart + ",");
                }
                System.out.println();
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        final Main m = new Main();

        SwingUtilities.invokeLater(() -> {
            m.setVisible(true);
        });
    }
}
