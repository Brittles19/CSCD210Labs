package cscd210Lab14;

import cscd210Classes.Author;
import cscd210Utils.FileUtils;
import cscd210Utils.ArrayUtils;
import cscd210Utils.SortUtils;
import cscd210Lab14Methods.CSCD210Lab14Methods;
import java.util.Scanner;
import java.io.File;

/**
 * The class that contains main for Lab 14
 *
 * @NOTE all parameters will be passed as final and all preconditions will be checked
 */
public class CSCD210Lab14
{
   public static void main(String [] args)throws Exception
   {
      File inf = null;
      int choice, count;
      Author [] array = null;
      Scanner kb = new Scanner(System.in);
      
      if(args.length < 1) // check to see if the input file was passed on the command line
         inf = FileUtils.openInputFile(kb);
      
      else
         inf = FileUtils.openInputFile(args[0]);  // open the file from the command line
    
      Scanner fin = new Scanner(inf);
      count = FileUtils.countRecords(fin, 1);
      fin.close();
      
      fin = new Scanner(inf);
      array = new Author[count];      
      CSCD210Lab14Methods.fillArray(fin, array);
      fin.close();
      
      SortUtils.selectionSort(array);
      
      do
      {
         choice = CSCD210Lab14Methods.menu(kb);
         switch(choice)
         {
            case 1:	ArrayUtils.printArray(array, System.out);
   					break;
                     
            case 2:	array = CSCD210Lab14Methods.add(array, kb);
                    SortUtils.selectionSort(array);
                    break;
    			      			      
         }// end switch
      
      }while(choice != 3);
    
   }// end main
   
}// end class