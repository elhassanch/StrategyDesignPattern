package strategy;

class InsertionSort implements Strategy {

    public void sort(Produit[] prod, String sortBy) {
    	int n =prod.length;
    	for (int i=1;i<n;i++ ) {
    		Product key = prod[i];
    		int j =i-1;
    		while ( (j >=0) && ( prod[j].compareToBy(key,sortBy) >=1 ) ) {  
                prod [j+1] = prod [j];  
                j--;  
            }
            prod[j+1] = key; 
    	}

	    System.out.println("Ssorting array using INSERTION SORT strategy");
	    for (int i=0;i<n ;i++ ) {
	    	System.out.println("Produit N" +(i+1)+ ": "+prods[i].name+" "+prods[i].price+" "+prods[i].value);

	    }
	}
}
