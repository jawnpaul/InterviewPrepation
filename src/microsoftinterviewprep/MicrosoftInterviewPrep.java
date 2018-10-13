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
        
        String check = " a  bc    de fgh ";
        isUnique(check);
        
    }
    public static boolean isUnique(String s){
    boolean isUnique = true;
    s = s.trim();
    int length = s.length();
    char [] sArray = s.toCharArray();
        
        for(int i = 0; i<length; i++){
        
            for(int j= 0; j<length; j++){
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
    
}
