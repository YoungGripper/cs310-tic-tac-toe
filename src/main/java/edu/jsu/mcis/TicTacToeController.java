package edu.jsu.mcis;

//Author Tony White

//import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

import edu.jsu.mcis.TicTacToeModel.Mark;

public class TicTacToeController implements ActionListener {

    private final TicTacToeModel model;
    private final TicTacToeView view;
    
    /* CONSTRUCTOR */

    public TicTacToeController(final int width) {

        /* Initialize model, view, and width */

        model = new TicTacToeModel(width);
        view = new TicTacToeView(this, width);

    }

    public String getMarkAsString(final int row, final int col) {
        System.out.println(model.getMark(row, col).toString());
        return (model.getMark(row, col).toString());
    }

    public TicTacToeView getView() {
        return view;
    }

    @Override
    public void actionPerformed(final ActionEvent event) {
        String evt = event.toString();
        evt = evt.substring(evt.length() - 2);
        final int num = Integer.parseInt(evt);
        final int first = num / 10;
        final int second = num % 10;
        model.makeMark(first, second);
        view.updateSquares();
        if(!model.getResult().equals(TicTacToeModel.Result.NONE)){
            view.showResult(model.getResult().toString());
            view.disableSquares();
        }
    }

}