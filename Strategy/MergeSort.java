package strategy;

class MergeSort implements Strategy {

    public void sort(Produit[] prod, String sortBy) {
		int n=prod.length;
    	mSort(prod,0,n-1,sortBy);

        System.out.println("Sorting array using MERGE SORT strategy");
        for (int i=0;i<n ;i++ ) {
	    	System.out.println("Produit N" +(i+1)+ ": "+prods[i].name+" "+prods[i].price+" "+prods[i].value);
	    }
    }

    public void mSort(Produit prod[],int l, int r, String sortBy){
    	if (l<r) {
			int m = (l+r)/2;

			mSort(prod,l,m,sortBy);
			mSort(prod,m+1,r,sortBy);

			merge(prod,l,m,r,sortBy);  		
    	}
    }

    public void merge (Produit prod[], int l, int m, int r, String sortBy){
    	int n1 = m - l + 1;
        int n2 = r - m;

        Produit L[] = new Produit[n1];
        Produit R[] = new Produit[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = prod[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = prod[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareToBy(R[j],sortBy) <= -1) {
                prod[k] = L[i];
                i++;
            }
            else {
                prod[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
        	prod[k]=L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prod[k] = R[j];
            j++;
            k++;
        }
    }

}
