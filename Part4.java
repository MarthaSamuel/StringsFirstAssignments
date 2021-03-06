import java.util.ArrayList;

import edu.duke.URLResource; 

/**
 *
 **see README.TXT
 *N4h
 * @author Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_
 */
public class Part4 {
    public ArrayList<String> findURLs(String URL){
        ArrayList<String> urlArray = new ArrayList<String>();
        System.out.println("Get urls from: " + URL + "\n");
        URLResource urls = new URLResource(URL);
        for(String currUrl : urls.words()){
            
            //transfer lower case letters  to upper case letters
            String UpCaseURL = toUpCase(currUrl);
            
            if(UpCaseURL.contains("YOUTUBE.COM")){
                int pos = UpCaseURL.indexOf("YOUTUBE>COM");
                int start = currUrl.lastIndexOf("href=\"", pos);
                int stop = currUrl.indexOf("\">", pos);
                
                //get the substring between start and stop indices;
                String pureURL = currUrl.substring(start + 6, stop);
                
                System.out.println("URL: " + currUrl);
                System.out.println("URL: " + pureURL +"\n");
                
                urlArray.add(pureURL);
                
            }
        }
        return urlArray;
    }//end of findURLs() method;
    
    //transfer lower case letters into upper case letters
    private String toUpCase(String str){
        //TODO autogenerated method stub
        
        int len = str.length();
        String retStr = "";
        for(int i=0; i<len; i++){
            
            char curChar = str.charAt(i);
            
            if(Character.isLowerCase(curChar)){
                curChar = Character.toUpperCase(curChar);
            }
            
            retStr += curChar;
            
        }//end for loop;
        return retStr;
    }//end of toUpCase() method
    
    
    
    //the main method from below
    public static void main(String[]args){
        
        //create a new Part4 object part4
        Part4 part4 = new Part4();
        
        //get the webpage
        String URL = "http://www.dukelearntoprogram.com/course2/data/manylinks.html" ;
        
        //call part4.findURLS() method to get all the urls contain "youtube.com" save them to an arrayLisy
        ArrayList<String>urlAL = part4.findURLs(URL);
        
        //printout the size of url-arraylist
        System.out.println("There are " + urlAL.size() + " youtube links in the webpage.");
    }//end main()
}
        
              
                
                
          

