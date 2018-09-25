public class SelectionSort {
        public static void main(String[] args) {

        int vetor [] = {19,5,4,3,2,1};
          
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            while(j>0 && vetor[j-1] > vetor[j]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j-1];
                    vetor[j-1] = aux;
                j = j-1;
            }
        }
        
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");
        }
        
        System.out.println("");
        
        
    }
}
