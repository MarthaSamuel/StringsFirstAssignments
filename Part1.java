
/**
 * see README.TXT
 *  N4e
 * @author Dimgba Martha Otisi
 * 2020, January
 * @martha_samuel_
 *
 */
public class Part1 {
public String findSimpleGene(String dna){
    //start code is ATG
    //stop codon is TAA
    String result = "";
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
    result = dna.substring(startIndex,stopIndex+3);
    return result;
}
public void testFindSimpleGene(){
    String dna = "AAAATAGGACAAGTCCATAAGA";
    System.out.println("DNA Strand is" + dna);
    String gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "ACGATGCAATCAGGA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "AGTATCAAGTACGA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "ATCATCATGGTGTTGTTATAAGT";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
    
    dna = "ATGACCGTAA";
    System.out.println("DNA Strand is" + dna);
    gene = findSimpleGene(dna);
    System.out.println("Gene is " + gene);
}
}
 
    
    
    


