/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microsoftinterviewprep;

/**
 *
 * @author john
 */
public class MicrosoftInterviewPrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //String check = " a  bc    de fgh ";
        //isUnique(check);
        
        String firstString = "abcdefghijka b";
        String secondString = "dcf eghikjabab";
        
        isPermutation(firstString, secondString);
        
    }
    public static boolean isUnique(String s){
    boolean isUnique = true;
    
    //Trim to remove the whitespace before or after the string
    s = s.trim();
    int length = s.length();
    char [] sArray = s.toCharArray();
        
        for(int i = 0; i<length; i++){
        
            for(int j= 0; j<length; j++){
                
                //This is to ensure that the endexes aren't the same and also white spaces in between the string are ignored.
                if(i!=j && sArray[i] != ' ' && sArray[j] != ' ' ){
              
                 if(sArray[i] == sArray[j]){
                 //System.out.println(sArray[i] + " " + sArray[j]);
                 isUnique = false;
                 }
                }
               
            }
        }
    
        System.out.println(isUnique);
    return isUnique;
    }
    
    public static boolean isPermutation(String firstString, String secondString){
    boolean isPermutation = false;
    
    //Trim the String for white spaces before of after
    firstString.trim();
    secondString.trim();
    
    //First condition makes sure that the length of the strings are equal
     if(firstString.length() == secondString.length()){
         char[] firstCharArray = firstString.toCharArray();
         char[] secondCharArray = secondString.toCharArray();
         for(int i = 0; i<firstString.length(); i++){
             for(char a : secondCharArray){
                 //Compare each character in the first array with the second array and ignore white space
                 if(a == firstCharArray[i] && a != ' ' && firstCharArray[i] != ' '){
                 isPermutation = true;
                 }
             
             }
         
         }
     
     }
    
        System.out.println(isPermutation);
    return isPermutation;
    }
    
}
