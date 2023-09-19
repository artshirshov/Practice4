package template_method;

import template_method.Progression;

class ArithmeticProgression extends Progression {
    public ArithmeticProgression(int f, int l, int h) {
        super(f, l, h);
    }

    @Override
    public void progress() {
        int fF = getFirst();
        do {
            progList.add(fF);
            fF = fF + getH();
        } while (fF < getLast());
    }
}