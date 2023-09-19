package template_method;

class GeometricProgression extends Progression {
    private int multiplier;
    private int numberOfTerms;

    public GeometricProgression(int a, int r, int n) {
        super(a, 0, 0); // В данном контексте, last и h не используются
        multiplier = r;
        numberOfTerms = n;
    }

    @Override
    public void progress() {
        int currentTerm = getFirst();
        for (int i = 0; i < numberOfTerms; i++) {
            progList.add(currentTerm);
            currentTerm *= multiplier;
        }
    }
}
