package strategy;

class BubbleSort implements Strategy {
    public void sort(Produit[] prod, String sortBy) {

    	int n = prod.length;
    	Produit temp =null;
    	for (int i=0;i<n ;i++ ) {
    		for (int j=1;j<(n-i) ;j++ ) {
    			if (prod[j - 1].compareToBy(prod[j],sortBy) >=1{

    				temp = prod[j-1];
    				prod[j-1]=prod[j];
    				prod[j]=temp;
    			}
    			
    		}
    		
    	}

    	System.out.println("Sorting array using BUBBLE SORT STRATEGY:");
	        for(int i=0;i<n;i++){
	        	System.out.println("Produit N" +(i+1)+ ": "+prods[i].name+" "+prods[i].price+" "+prods[i].value);
	        }
    }
}
