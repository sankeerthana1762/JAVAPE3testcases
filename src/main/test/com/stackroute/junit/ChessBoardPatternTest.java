package com.stackroute.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class ChessBoardPatternTest {
    ChessBoardPattern obj=new ChessBoardPattern();



    @Test
    public void givenStringShouldReturnVowelsandConsonants() {

         obj.chessBoard();

    }
}