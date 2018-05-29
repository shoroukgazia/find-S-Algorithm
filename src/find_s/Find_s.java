/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_s;

 
public class Find_s {
    
    public static void display(String [] ar,int k){
         System.out.print("h"+k+"= (");
          for(int i=0;i<6;i++){
             System.out.print(ar[i]+"  "); 
          }
          System.out.println(")");
    }
    

  static String [][] arr={{"sunny","warm","normal","strong","warm","same","yes"},
                     {"sunny","warm","high","strong","warm","same","yes"},
                      {"rainy","cold","high","strong","warm","change","no"}, 
                      {"sunny","warm","high","strong","cool","change","yes"}};

    
    
    
    
    public static void main(String[] args) {
       String [] h={"0","0","0","0","0","0"};
       

        for( int i=0;i<4;i++){
           if ("yes".compareTo(arr[i][6])==0){
               
                 for(int j=0;j<6;j++){
                     
                    if(h[j].compareTo("0")==0) //FOR FIRST ETERATION
                        h[j]=arr[i][j];
                   else if(h[j].compareTo(arr[i][j])!=0) //IF THEY AR DIFFERENT PUT ?
                       h[j]="?"; 
                   
                 }
                 display(h,i);
           
           }
        
        
        }
        
        
        
    }
    
}
