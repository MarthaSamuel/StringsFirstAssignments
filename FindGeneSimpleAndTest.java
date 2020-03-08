
/**
 * FIndGeneSimpleAndTest is a practice code for finding gene from dna strands.here we arent considering that genes should be a multiple of 3
 * N4a
 * @author Dimgba Martha Otisi
 * 2020, January
 * @martha_samuel_
 */
public class FindGeneSimpleAndTest {
    //method 
    public String findGeneSimple(String dna){
   //start codon is "ATG"
   String result="";
   int startIndex=dna.indexOf("ATG");
   //we add an if statement so that we dont get an error if the codon is not found
   //no ATG
   if(startIndex==-1){
       return " ";
    }
int stopIndex=dna.indexOf("TAA",startIndex+3);
//no TAA
if(stopIndex==-1){
    return " ";
}
result=dna.substring(startIndex,stopIndex+3);
return result;
}
public void testFindGeneSimple(){
    //this isnt taking into cognisance that genes are in mutiples of 3
    String dna="ATATGCGTAATATGGT";
    System.out.println("DNA Strand is " + dna);
        String gene=findGeneSimple(dna);
    System.out.println("Gene is " + gene);
    
    dna="AATGCTATGGCCACGTATTGGT";
    System.out.println("DNA Strand is " + dna);
        gene=findGeneSimple(dna);
    System.out.println("Gene is " + gene);
    
    dna="TTAGTAGGGTTTAAATAATAG";
    System.out.println("DNA Strand is " + dna);
     gene=findGeneSimple(dna);
    System.out.println("Gene is " + gene);
    
    dna="GTAGGTATGTATAATGGTTGATAAGGT";
    System.out.println("DNA Strand is " + dna);
      gene=findGeneSimple(dna);
    System.out.println("Gene is " + gene);
}
}
