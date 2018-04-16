/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class AceptaElRetoEl_pan_de_bodas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int tamaño;
        int sol=0;        
        boolean seguir=true;       
   while(seguir==true)
   {  
       tamaño=sc.nextInt();
       
       if(tamaño==0)
        {
            seguir=false;
        }
       else
       {
           
      String sillas;
      
      
      sillas=sc.nextLine();/*cantidad de comensales*/
      
     for(int i=0;i<tamaño;i++)
     {
         if(sillas.charAt(i)=='D'||sillas.charAt(i)=='I')/* encontrar primera letra D o I */
         {
             for(int j=i+1;j<tamaño;j++)
             {
                 if(sillas.charAt(i)=='D'&&sillas.charAt(j)=='D')
                 {
                     sol=1;
                 }
                 if(sillas.charAt(i)=='D'&&sillas.charAt(j)=='I')
                 {
                     sol=0;
                 }
                 if(sillas.charAt(i)=='I'&&sillas.charAt(j)=='I')
                 {
                     sol=1;
                 }
                 if(sillas.charAt(i)=='I'&&sillas.charAt(j)=='D')
                 {
                     sol=0;
                 }
                 else{sol=1;}
             }
             
         }
         if(sillas.charAt(i)=='.'&&(sillas.charAt(i+1)=='D'||sillas.charAt(i+1)=='I')&&(sillas.charAt(i-1)=='D'||sillas.charAt(i-1)=='I'))
         {
            sol=0; 
         }
     }
     
      if(sol==0)
      {System.out.println("ALGUNO NO COME");
      }
      if(sol==1)
      { System.out.println("TODOS COMEN");
      }
      
          
      }

      
       }
      
   }
        
}
    
