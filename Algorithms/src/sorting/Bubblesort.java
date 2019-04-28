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
        for (int x = 0; x < numbersArray.length; x++) {

            for (int y = 0; y < numbersArray.length; y++) {

                if (HasNext(y)) {

                    int current = numbersArray[y];
                    int next = numbersArray[y + 1];

                    if (current > next) {
                        numbersArray[y] = next;
                        numbersArray[y + 1] = current;
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
