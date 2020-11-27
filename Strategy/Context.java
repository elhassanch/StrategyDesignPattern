package strategy;

class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(Produit[] input, String sortBy) {
        strategy.sort(input,sortBy);
    }
}
