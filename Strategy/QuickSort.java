package strategy;

class QuickSort implements Strategy {

    public void sort(Produit[] prod, String sortBy) {
    	int n=prod.length;
    	qSort(prod,0,n-1, sortBy);

    	System.out.println("Sorting array using QUICK SORT strategy");
	    for (int i=0;i<n ;i++ ) {
	    	System.out.println("Produit N" +(i+1)+ ": "+prods[i].name+" "+prods[i].price+" "+prods[i].value);
	    }

    }

    public int partition(Produit prod[], int low, int high, String sortBy){
    	Produit p=prod[high];
    	int i =low-1;
    	for (int j=low;j<high ;j++ ) {
    		if (prod[j].compareToBy(p,sortBy)<=-1) {
    			i++;
    			Produit temp = prod[i];
    			prod[i]=prod[j];
    			prod[j]=temp;
    		}
    	}

    	Produit temp=prod[i+1];
    	prod[i+1]=prod[high];
    	prod[high]=temp;

    	return i+1;

    }

    public void qSort(Produit prod[], int low, int high, String sortBy){
    	if(low<high){
    		int d=partition(prod,low,high,sortBy);

    		qSort(prod, low,d-1,sortBy);
    		qSort(prod,d+1,high,sortBy);
    	}
    }


}
