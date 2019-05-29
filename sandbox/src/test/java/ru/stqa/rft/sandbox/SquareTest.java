package ru.stqa.rft.sandbox;

import org.testng.annotations.Test;

public class SquareTest {

    @Test

    public void testArea(){
        Square s = new Square(6);
        assert s.squareArea() ==35;
    }
}
