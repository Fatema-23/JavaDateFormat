/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javadateformat;

import java.util.Date;
import java.time.Instant;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class JavaDateformat {

    public static void main(String[] args) throws ParseException {
     // System.out.println(System.currentTimeMillis());
        
     // Date date = new Date(1674065465886L);
       /* Date now = new Date();
       
       System.out.println(date);
       System.out.println(now);  
       */
      
      //Date now = new Date();
      // System.out.println(now.getTime());
      //System.out.println(now.before(date));
     // System.out.println(now.after(date));
       //System.out.println(now.compareTo(date));        ///compare r belay 1st obje big & 2nd object small hole pos value return korbe//// 1st obj small & 2nd obj big hole neg data return korbe ar 1st=2nd obj hole 0 return korbe
    /*     Instant instant = Instant.now();
    Date newDate= Date.from(instant);
            //newDate = variable name or object name
    System.out.println(instant);
    System.out.println(newDate);   */
    
    //////create Simple Date format/////
    
   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
   
   /* String dateString = "2023-2-19";
   
   Date date = simpleDateFormat.parse(dateString);
                            ///parse method///
      System.out.println(date);  */
   
   Date date = new Date();
   System.out.println(simpleDateFormat.format(date));
    }
}
