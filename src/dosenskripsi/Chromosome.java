package dosenskripsi;
import java.util.Random;
import java.util.Arrays;

public class Chromosome {
    Random r = new Random();
    private int gen[];
    private int kuotaAvailable[];
    private int fitness;
    
    public Chromosome (int length){
        gen = new int[length];
    }
    
    public Chromosome generateChromosome(){
        GA.getNEWHolder();
        
        for(int i=0;i<gen.length;i++){
            int x = r.nextInt(GA.kuotaTMP.length);
            gen[i] = GA.kuotaTMP[x];
            GA.kuotaTMP = GA.removeArrayIndex(GA.kuotaTMP, x);
        }
       
        return this;
    }
    
    public int[] getGen(){
        return gen;
    }
    
    public void fitnessFunc(){
        fitness = GA.target.length;
       for(int i=0;i<gen.length;i++){
           if(gen[i]!= GA.target[i]){
               fitness-=1;
           }
       }

    }
    
    public int getFitness(){
        fitnessFunc();
        return fitness;
    }
    
    //print content of genes
    public String toString(){
        return Arrays.toString(this.gen);
    }

}
