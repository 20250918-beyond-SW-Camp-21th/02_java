package com.ohgiraffers.io.note.run;

import com.ohgiraffers.io.note.controller.FileController;
import com.ohgiraffers.io.note.view.NoteMenu;

public class Application {
    public static void main(String[] args) {
        NoteMenu nm = new NoteMenu();
        nm.viewMenu();
    }
}
