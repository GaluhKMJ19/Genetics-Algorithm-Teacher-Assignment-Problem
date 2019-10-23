package dosenskripsi;
import java.util.Arrays;
import java.util.Scanner;

public class DosenSkripsi {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
       System.out.println("-------------------------------------------------------");
       System.out.println("Kuota Dosen: " + Arrays.toString(GA.kuotaDosen));
        System.out.println("Input Jumlah Kromosom dalam Populasi: " );
       int x = s.nextInt();
       
       
       GA.kuotaArray();
       Population p = new Population(x).generatePopulation();
       System.out.println("-------------------------------------------------------");
       printPopulation(p, "Target Chromosome: " + Arrays.toString(GA.target));
       
} 
    
    
    public static void printPopulation(Population p, String heading){
    System.out.println(heading);
    System.out.println("-------------------------------------------------------");
    for(int i=0; i<p.getChrom().length;i++){
        System.out.println("Chromosome #" + (i+1) + " : " + Arrays.toString(p.getChrom()[i].getGen()) + 
                " | Fitness: " + p.getChrom()[i].getFitness());
    }
    }
}

