package zadatak02;

import java.util.Arrays;

public class StekPrekoNiza implements Stek {
    private int[] elementi;
    private int vrhSteka;               // indeks vrha steka                
    private int kapacitet;           
    
    private static final int INIC_KAPACITET = 3;  

    public StekPrekoNiza() {
        this.kapacitet = INIC_KAPACITET;
        this.elementi = new int[kapacitet];
        this.vrhSteka = -1;
    }

    @Override
    public void push(int element) {
        if (size() == kapacitet) {
            kapacitet *= 2;
            elementi = Arrays.copyOf(elementi, kapacitet);
        }

        elementi[++vrhSteka] = element;
    }

    @Override
    public int pop() {
        if (size() == 0) {
            System.err.println("Stek je prazan!");
            System.exit(1);
        }

        return elementi[--vrhSteka];
    }

    @Override
    public int top() {
        if (size() == 0) {
            System.err.println("Stek je prazan!");
            System.exit(1);
        }

        return elementi[vrhSteka];
    }

    @Override
    public int size() {
        return vrhSteka + 1;
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size(); i++) {
            sb.append(elementi[i]).append(" ");
        }

        return sb.toString();
    }
}
