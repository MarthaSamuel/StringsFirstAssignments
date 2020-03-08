
/**
 * FindMultipleGenes will show us how to extract many genes from a set of dna String
 *N4d
 *@author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 
 */
import edu.duke.*;
public class FindMultipleGenes {
public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
    //find the stopcodon starting from startindex+3,call this currindex
    int currIndex=dnaStr.indexOf(stopCodon,startIndex+3);
    //as long as curr index is !-1
    while(currIndex!=-1){
        //check if currindex-startindex is a multiple of 3
        int diff=currIndex-startIndex;
    
        if(diff%3==0){
            //currIndex is the answer
            return currIndex;
        }
        //if not update currIndex to the index of the next "TAA" starting from currIndex+1
        //starting from currIndex+1
        else{
            currIndex=dnaStr.indexOf(stopCodon,currIndex+1);
        }
            
            //if we exit loop we didnt find stopCodon
            //so return dnaStr.length()
        }
       // return dnaStr.length(); or
       return -1; //then change the dex!=26 to -1
       //the two lines above show same thing.that nothing was found
    }

        public void testfindStop(){
            String dna="ATTGGATCTAAACCTCAGTATAACG";
            int dex=findStopCodon(dna,0,"TAA");
            if(dex!=9) System.out.println("error on 9");
            dex=findStopCodon(dna,9,"TAA");
            if(dex!=21) System.out.println("error on 21");
             dex=findStopCodon(dna,1,"TAA");
            if(dex!=-1) System.out.println("error on 26");
             dex=findStopCodon(dna,0,"TAA");
            if(dex!=-1) System.out.println("error on 26TAG");
            System.out.println("test finished");
            }
            public String findGene(String dna,int where){
                //find the first occurence of "ATG" and call its index startIndex,
                int startIndex=dna.indexOf("ATG",where);
                        //if startIndex is -1 then answer is empty string
        if(startIndex==-1){
            return "";
        }
        //use taaIndex to store findStopCodon( dnaStr,startIndex, "TAA")
        int taaIndex=findStopCodon(dna,startIndex,"TAA");
         //use tagIndex to store findStopCodon(dnaStr,startIndex,"TAg");  
          int tagIndex=findStopCodon(dna,startIndex,"TAG");
          //use tgaINdex to store findStopCodon(dnaStr,startIndex,"TGA");  
        int tgaIndex=findStopCodon(dna,startIndex,"TGA");  
        //take the smallest taaInde,tagIndex and tgaIndex call it minIndex
        /*//int minIndex=Math.min(taaIndex,Math.min(tagIndex,tgaIndex); or
        int temp=Math.min(taaIndex,tagIndex);
        int minIndex=Math.min(temp,tgaIndex);*/
        //ignoring the 3 lines above,we will consider that one of the stopcodons might be -1 and restructure our code
        //if taaIndex==-1 or
        int minIndex=0;
        if(taaIndex==-1||
        //if tgaIndex!=-1 AND tgaIndex<taaIndex
        (tgaIndex!=-1&&tagIndex<taaIndex)){
            //then set minIndex to tgaIndex
            minIndex=tgaIndex;
        }
            //else set minIndex to taaIndex
            else{minIndex=taaIndex;
            }
           //if minIndex==-1 or
           if(minIndex==-1||
           //if tagindex!=-1 and tagindex<minindex
           (tagIndex!=-1&& tagIndex<minIndex)){
               //then set minindex to tagindex
               minIndex=tagIndex;
            }
            //if minindex==-1,return ""
            if(minIndex==-1){
                return "";
            }
            
        /*//if minindex is dnastr.length(),answer is empty string
        if(minIndex==dna.length()){
            return "";
        }*/
            //our answer is substring from startIndex to minIndex+3
            return dna.substring(startIndex,minIndex+3);
        }
    
   /*public void printAllGenes(String dna){
       //set startindex to 0
      int startIndex=0;
       //repeat the following steps/if the condition of the loop is true
       
       while(true){
           //find the next gene after startindex
           String currentGene=findGene(dna,startIndex);
           //if no gene was found leave the loop
           if(currentGene.isEmpty()){
               break;
            }
            //print that gene out
            System.out.println(currentGene);
            //set the startindex to just past the end of the gene
            startIndex=dna.indexOf(currentGene,startIndex)+currentGene.length();
        }
    }*/
    //because we may want to carry out an action on these genes when we get them we getGenes 
    //instead of printAllGenes.getGenes puts our extracted genes in a storage resource class
//this storage resource stores these genes as a list in a file which we can call any method on.
 public StorageResource getAllGenes(String dna){
     //create an empty SR and call it geneList
     StorageResource geneList=new StorageResource();
     //set startindex to 0
     int startIndex=0;
     //repeat the following steps
     while(true){
         //find the next gene after the startindex
         String currentGene=findGene(dna,startIndex);
        
         //if no gene is found leave this loop
         if(currentGene.isEmpty()){
             break;
            }
            //add that gene to the geneList
            geneList.add(currentGene);
            //set the startindex to just past the end of the gene
            startIndex=dna.indexOf(currentGene,startIndex)+currentGene.length();
        }
        //your answer is geneList
        return geneList;
    }
    /*public void testOn(String dna){
        System.out.println("Testing printAllGenes on" + dna);
        printAllGenes(dna);
    }*/
    

public void testOn(String dna){
        System.out.println("Testing gettAllGenes on" + dna);
        StorageResource genes=getAllGenes(dna);
        for(String g:genes.data()){
            System.out.println(g);
        }
    }
    
    public void test(){
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        testOn(" ");
        testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
    }

       
       /* public void testfindGene(){
       String dna="ATGCCCGGGAAATAACCC";
       String gene=findGene(dna);
       if(!gene.equals("ATGCCCAGGGAAATAA")){
           System.out.println("error");
        }
        System.out.println("test finished");
    }
    */
    }
    





