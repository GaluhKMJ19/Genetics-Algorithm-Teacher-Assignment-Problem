package dosenskripsi;

import java.util.Arrays;

public class Population {
    
    private Chromosome chrom[];
    
    public Population (int length){
        chrom = new Chromosome[length];
    }
    
    public Population generatePopulation(){
      for(int i=0;i<chrom.length;i++){
          
          //Chromosome index i = Kromosom ke i
          chrom[i] = new Chromosome(GA.target.length).generateChromosome();
          
      }
      
      return this;
  }
    
    public Chromosome[] getChrom(){
        return chrom;
    }
    
}
