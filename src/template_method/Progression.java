package template_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Progression {
    private int first;
    private int last;
    private int h;
    protected List<Integer> progList;

    public Progression(int first, int last, int h) {
        this.first = first;
        this.last = last;
        this.h = h;
        progList = new ArrayList<>();
    }

    public void templateMethod() {
        initializeProgression(first, last, h);
        progress();
        print(progList);
    }

    private void print(List<Integer> progList) {
        System.out.println("Последовательность:");
        for (int item : progList) {
            System.out.print(" " + item);
        }
        System.out.println();
    }

    private void initializeProgression(int a, int b, int h) {
        first = a;
        last = b;
        this.h = h;
    }

    public abstract void progress();

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public List<Integer> getProgList() {
        return progList;
    }

    public void setProgList(List<Integer> progList) {
        this.progList = progList;
    }
}