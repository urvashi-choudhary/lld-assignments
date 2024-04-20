package com.example.tttundosolution.strategies;

import com.example.tttundosolution.models.Board;
import com.example.tttundosolution.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
