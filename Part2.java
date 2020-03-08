
/**
 *see README.TXT
 *N4f
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_ 
 *
 */
public class Part2 {

public String findSimpleGene(String dna, String StartCodon, String StopCodon){
    //start code is ATG
    //stop codon is TAA
    String resultTemp = "";
    int startIndex = dna.indexOf("ATG");
    if (startIndex == -1)//no ATG
    {
        return "";
    }
    int stopIndex = dna.indexOf("TAA", startIndex+3);
    if (stopIndex == -1)//no TAA
    {
        return "";
    }
    resultTemp = dna.substring(startIndex,stopIndex+3);
    String result = resultTemp.toLowerCase();
    int compare = result.length()% 3;
    if (compare==0){
    return result;
}
else{
    return "";
}
 }


public void testFindSimpleGene(){
    String dna = "AAAATAGGACAAGTCCATAAGA";
    String StartCodon = "ATG";
    String StopCodon = "TAA";
    System.out.println("DNA Strand is" + dna);
    String gene = "";
    gene = findSimpleGene(dna, StartCodon, StopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "ACGATGCAATCAGGA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna, StartCodon, StopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "AGTATCAAGTACGA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna, StartCodon, StopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "ATCATCATGGTGTTGTTATAAGT";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna, StartCodon, StopCodon);
    System.out.println("Gene is " + gene);
    
    dna = "ATGACCGTAA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna, StartCodon, StopCodon);
    System.out.println("Gene is " + gene);
}
}

