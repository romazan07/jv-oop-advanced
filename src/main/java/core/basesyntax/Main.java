package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrFigure = new Figure[6];
        for (int i = 0; i < arrFigure.length; i++) {
            if (i != arrFigure.length / 2) {
                arrFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrFigure[i] = figureSupplier.getDefaultFigure();
            }
        }
        System.out.println(Arrays.toString(arrFigure));
    }
}