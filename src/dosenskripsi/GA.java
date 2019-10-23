package dosenskripsi;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GA {
    
    public static int[] kuotaDosen = {5,10,7,8,3,15};
    public static final int[] target = {5,0,3,4,2,4,5,1,5,0,0,4,5,4,2,3,3,4,1,1,0,4,1,2,3,5,0,1,3,2};
    public static int[] kuotaHolder;
    public static int[] kuotaTMP;
    
    public static int totalKuota=0;
    
    public static void kuotaArray(){
        int indexKodeDosen=0;
        
        for (int i=0; i< kuotaDosen.length;i++){
            totalKuota+=kuotaDosen[i];
        }
        kuotaHolder = new int[totalKuota];
        
        for(int i=0;i<kuotaHolder.length;i++){
           if(kuotaDosen[indexKodeDosen] > 0){
             kuotaHolder[i] = indexKodeDosen;
             kuotaDosen[indexKodeDosen]-=1;
           }
           else {
               indexKodeDosen+=1;
               kuotaHolder[i]=indexKodeDosen;
               kuotaDosen[indexKodeDosen]-=1;
           }
        }
    }
    
    //Pindahin Kuota di kuotaHolder biar yg kepanggil terus si kuota yg satunya 
    public static void transferKuota(){
        kuotaTMP = new int[kuotaHolder.length];
        for(int i =0; i< kuotaTMP.length; i ++){
            kuotaTMP[i] = kuotaHolder[i];
        }
    }
    
    public static int[] getNEWHolder(){
        transferKuota();
        return kuotaTMP;
    }
    
    public static int[] removeArrayIndex(int[] arr, int index){
        if(arr==null || index < 0 || index> arr.length){
           return arr;
        }
        
        int[] anotherArray = new int[arr.length-1];
        
        //Copy the elements except the index
        //from original array to anotherArray
        
        for(int i=0,k=0;i<arr.length;i++){
            //if the index is the removal element index
            if(i==index){
                continue;
            }
            //if the index is not the removal element index
            anotherArray[k++] = arr[i];
        }
        
        
        return anotherArray;
        
    }
    
    
    private Population CrossOver(Population p){
      return p;
    }
    
}
