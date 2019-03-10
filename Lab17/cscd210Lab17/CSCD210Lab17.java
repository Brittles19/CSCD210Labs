package cscd210Lab17;

import java.io.*;

import java.util.*;
import cscd210Enums.*;
import cscd210Utils.*;
import cscd210Methods.*;
import cscd210Comparators.*;

public class CSCD210Lab17
{
   public static void main(String [] args) throws Exception
   {
      File inf = null;
      int choice, total;
      Month [] myArray = null;
      Scanner fin,kb = new Scanner(System.in);
	   
      if(args.length < 1)
		   throw new IllegalArgumentException("You must pass a filename at the command line");
    	  
      inf = FileUtils.openInputFile(args[0]); 
      fin = new Scanner(inf);
      total = FileUtils.countRecords(fin, 1);
      fin.close();
      
      fin = new Scanner(inf);
      myArray = CSCD210Lab17Methods.fillArray(fin, total);
      fin.close();
      
      do
      {
         choice = CSCD210Lab17Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  CSCD210Lab17Methods.printArray(myArray);
                     break;
            
            case 2:  SortUtils.selectionSort(myArray);
                     CSCD210Lab17Methods.printArray(myArray);
                     break;
                     
            case 3:  Arrays.sort(myArray, new MonthDayOrdinalComparator());
                     CSCD210Lab17Methods.printArray(myArray);
                     break;
                     
            default: System.out.println("All Done");
         
         }// end switch
      
      }while(choice != 4);
   }// end main
}// end class