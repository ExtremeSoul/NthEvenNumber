package pl.sdacademy.java7krk;

public class NthEvenNumber {
    private int evenNumber;
    private int count;
    private int counter;
    private int range = 2 * count;
//  private boolean isEven = false;

    public NthEvenNumber(int count) {
        this.count = count;
    }

    public int returnNthEvenNumber() {
        for (int i = 2; i < 100; i++) {
            if (count > counter) {
                if (i % 2 == 0) {
                    counter++;
                    evenNumber = i;
                }

            } else if (count == counter) {
                System.out.println("evenNumber = " + evenNumber);
            } else {
                break;
            }
        }
        System.out.println("evenNumber = " + evenNumber);
        return evenNumber;
    }
}
