
/**
 **see README.TXT
 *N4g
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_ 
 *
 */
public class Part3 {
    public boolean twoOccurences (String stringa, String stringb){
        int occurence = stringb.indexOf(stringa);
        if (occurence == -1){
        return false;
    }   
    else{
      System.out.println("occurence= "+ occurence);
      return true;
    }  

}

public String lastPart(String stringa, String stringb){
    int occurence= stringb.indexOf(stringa);//this tells you there is an occurence and where
    int startFrom = stringa.length();//this tells you the length of the occurence
    String finalPart = stringb.substring(startFrom+occurence);//the length of the occurence + where the occurence starts,gives the solution
    if (occurence == -1){
        return stringb;
    }
    else{
        //System.out.println("estringalength="+startFrom");...this command helped find solution  just for test purposes
        //System.out.println("occurence="+occurence);....same reason above
        return finalPart;
    }
}

public void testing(){
    String stringa = "by";
    String stringb = "A story by Abby Long";
    System.out.println("stringa= "+ stringa + "and stringb = "+ stringb);
    System.out.println(twoOccurences(stringa, stringb));
    
    stringa = "a";
    stringb = "banana";
    System.out.println(twoOccurences(stringa, stringb));
    System.out.println(twoOccurences(stringa, stringb));

    stringa ="a";
    stringb = "melocoton";
    System.out.println(twoOccurences(stringa, stringb));
    System.out.println(twoOccurences(stringa, stringb));
    
}

    

public void testingLastPart(){
    String stringa = "an";
    String stringb = "banana";
    System.out.println("The part of the string after "+ stringa +"in" + stringb +" is "+ lastPart(stringa,stringb));
    
    
    stringa = "rest";
    stringb = "deforestation";
    System.out.println("The part of the string after "+ stringa +"in" + stringb +" is "+ lastPart(stringa,stringb));

    stringa = "cio";
    stringb = "deforestation";
    System.out.println("The part of the string after "+ stringa +"in" + stringb +" is "+ lastPart(stringa,stringb));
    
    stringa = "zoo";
    stringb = "forest";
    System.out.println("The part of the string after "+ stringa +"in" + stringb +" is "+ lastPart(stringa,stringb));
}
}