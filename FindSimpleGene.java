
/**
 *  FIndSImpleGene shows how to extract genes from dna
 * N4b
 * @author Dimgba Martha Otisi
 * 2020, January
 * @martha_samuel_
 */
public class FindSimpleGene {
    public String findGene(String dna){
        //find the first occurence of "ATG" and call its index startIndex,
        int startIndex=dna.indexOf("ATG");
        //if startIndex is -1 then answer is empty string
        if(startIndex==-1){
            return "";
        }
        //find the "TAA" starting from (startIndex+3),call it currIndex
        int currIndex=dna.indexOf("TAA",startIndex+3);
        //as long as currIndex is not equal to -1
        while(currIndex!=-1){
          //check if (currIndex-startIndex) is a multiple of 3
            if((currIndex-startIndex)%3==0){
            //if so the text between startIndex and currIndex+3 is our answer
            return dna.substring(startIndex,currIndex+3);
        }
            //if not update currIndex to the index of the next "TAA" starting from currIndex+1
            else{currIndex=dna.indexOf("TAA",currIndex+1);
           return dna.substring(startIndex,currIndex+3);
        }
        }
      return "";
        }
    
    
        public void testfindGene(){
        String dna="AATGCGTAATTATCG";
        System.out.println("DNA Strand is " + dna);
        String gene=findGene(dna);
        System.out.println("Gene is " + gene);
        
         dna="AGGTTATTATGAATGCCAATAAGCTGATAATAG";
        System.out.println("DNA Strand is " + dna);
        gene=findGene(dna);
        System.out.println("Gene is " + gene);

}
}

