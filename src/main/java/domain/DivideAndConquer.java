package domain;

public class DivideAndConquer {

    public static ArrayMinMax findMinMax(int[] a, int low, int high){
        //Caso base, solucion un solo elemento
        if(low==high){
            return new ArrayMinMax(a[low], a[high]);
        }
        //Case base 2, solucion con 2 elementos
        if(high == low+1){
            //new ArrayMinMax(Math.min(a[low], a[high]), Math.max(a[low], a[high]));
            new ArrayMinMax(util.Utility.min(a[low], a[high]), util.Utility.max(a[low], a[high]));
        }
        //Casos recursivos

        return null; //esto se debe cambiar a lo que corresponde
    }

}
