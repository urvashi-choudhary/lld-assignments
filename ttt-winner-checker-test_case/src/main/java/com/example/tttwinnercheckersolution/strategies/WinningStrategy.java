package com.example.tttwinnercheckersolution.strategies;

import com.example.tttwinnercheckersolution.models.Board;
import com.example.tttwinnercheckersolution.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
