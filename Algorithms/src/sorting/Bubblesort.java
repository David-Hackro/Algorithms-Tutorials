package sorting;

public class Bubblesort {

    private Integer[] numbersArray;

    public Bubblesort() {
        initValues();
    }

    public static void main(String args[]) {
        Bubblesort bs = new Bubblesort();
        bs.BubbleSortMethod();
        bs.printResult();
    }

    private void initValues() {
        numbersArray = new Integer[]{64, 34, 25, 12, 22, 11, 90};
    }

    private void BubbleSortMethod() {
        for (int indiceX = 0; indiceX < numbersArray.length; indiceX++) {

            for (int indiceY = 0; indiceY < numbersArray.length; indiceY++) {

                if (HasNext(indiceY)) {

                    int current = numbersArray[indiceY];
                    int next = numbersArray[indiceY + 1];

                    if (current > next) {
                        numbersArray[indiceY] = next;
                        numbersArray[indiceY + 1] = current;
                    }
                }
            }
        }
    }

    private boolean HasNext(Integer position) {
        if (position != numbersArray.length - 1) return true;
        return false;
    }

    private void printResult() {
        for (Integer value : numbersArray) {
            System.out.println(value);
        }
    }
}
