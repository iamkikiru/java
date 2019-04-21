package com.game5;

public class Drawman {
	
		public void draw(int numOfFailed) {
			System.out.println("\n     ┌────┐   ");
			System.out.println("     │    │   ");

			switch(numOfFailed) {
				case 0:
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					break;		 
				case 1:
					System.out.println    ("     ?    │   ");	
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");		
					break;		  
				case 2:
					System.out.println    ("     ?    │   ");	
					System.out.println    ("    ??    │   ");	
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");		
					break;	
				case 3:
					System.out.println    ("     ?    │   "); 
					System.out.println    ("    ???   │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");	
					System.out.println    ("          │   ");
					break;	
				case 4:
					System.out.println    ("     ?    │   ");
					System.out.println    ("    ???   │   ");	
					System.out.println    ("     ?    │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");
					System.out.println    ("          │   ");	
					System.out.println    ("          │   ");		
					break;	
				case 5:
					System.out.println    ("     ?    │   ");
					System.out.println    ("    ???   │   ");	
					System.out.println    ("     ?    │   ");
					System.out.println    ("    ??    │   ");	
					System.out.println    ("    ?     │   ");	
					System.out.println    ("          │   ");	
					System.out.println    ("          │   ");		
					break;
				case 6:
					System.out.println    ("     ?    │   ");
					System.out.println    ("    ???   │   ");	
					System.out.println    ("     ?    │   ");
					System.out.println    ("    ???   │   ");	
					System.out.println    ("    ? ?   │   ");	
					System.out.println    ("          │   ");	
					System.out.println    ("          │   ");	
					break;
			}
		}


}
