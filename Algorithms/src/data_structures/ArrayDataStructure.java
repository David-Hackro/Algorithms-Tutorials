package data_structures;

public class ArrayDataStructure {

    public static void main(String[] args) {

        //When the arrays is declared, its necessary set the size
        int size = 10;
        int[] intArray = new int[size];

        //Array Literal
        //Sometimes you will know the content the array, its possible declare this values ->
        int[] intArrayliteral = {10, 11, 12, 13, 14, 15, 16, 17, 18};

        //The array begin from Zero(0)
        System.out.println("The value of the box [0] is -> " + intArrayliteral[0]);

        //Accessing Java Array Elements using for
        for (int i = 0; i < intArrayliteral.length; i++) {
            System.out.println("Accessing Java Array Elements using for -> " + intArrayliteral[i]);
        }

        //Accessing Java Array Elements using for each
        for (int i : intArrayliteral) {
            System.out.println("Accessing Java Array Elements using for each -> " + i);
        }

        //------------------------------------------------------------------------------------------------//

        // Multidimensional Arrays
        //Declarations
        int[][] intArray2D = new int[5][2]; //a 2D array or matrix

        //init with values
        int[][] intArray2DLiteral = {{11, 12, 13}, {21, 22, 23}}; //a 2D array or matrix

        //Accessing Java Multidimensional Array Elements using for
        for (int column = 0; column < intArray2DLiteral.length; column++) {
            for (int row = 0; row < intArray2DLiteral[column].length; row++) {
                System.out.println("Accessing Java Multidimensional Array Elements using for - column[" + column + "] and row [" + row + "] value -> " + intArray2D[column][row]);
            }
        }

        //Accessing Java Multidimensional Array Elements using for each
        for (int[] column : intArray2DLiteral) {
            for (int row : column) {
                System.out.println("Accessing Java Multidimensional Array Elements using for each - column[" + column + "] and row [" + row + "] value -> " + row);
            }
        }


    }


}
