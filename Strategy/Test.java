package strategy;

public class Test{
	public static void main(String args[]) throws InterruptedException{
		Product[] prod = { 
            new Product("ball", 50, 354),
            new Product("chair", 200, 123),
            new Product("mouse", 39, 40),
            new Product("sunglasses", 67, 401),
            new Product("tv", 3000, 70),
            new Product("bag", 450, 56),
            new Product("hat", 140, 599),
        };

        Context c =new Context(new QuickSort());
        c.arrange(prod,name);
        System.out.println("\n");

        c =new Context(new BubbleSort());
        c.arrange(prod,price);
        System.out.println("\n");

        c =new Context(new InsertionSort());
        c.arrange(prod,value);
        System.out.println("\n");

        c =new Context(new MergeSort());
        c.arrange(prod,name);
        System.out.println("\n");
	}
}