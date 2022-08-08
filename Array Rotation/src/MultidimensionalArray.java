
public class MultidimensionalArray {

	public static void main(String[] args) {
		
//		// TODO Auto-generated method stub
//		// create a 2d array
//        int[][] a = {
//            {1, 2, 3}, 
//            {4, 5, 6, 9}, 
//            {7}, 
//        };
//      
//        // calculate the length of each row
//        System.out.println("Length of row 1: " + a[0].length);
//        System.out.println("Length of row 2: " + a[1].length);
//        System.out.println("Length of row 3: " + a[2].length);
//        
//        
//        //Print all elements of 2d array Using Loop
////        for(int i=0;i<a.length;i++){
////        	for(int j=0;j<a[i].length;j++) {
////        		System.out.println(a[i][j]);
////        	}
////        }
////        
//        //using for each loop
//        for( int[] innerArray:a) {
//         for(int data:innerArray) {
//        	 System.out.println(data);
//         }
//        }
        
        //3D arrays
        int test[][][]={
                {
                    {1, -2, 3}, 
                    {2, 3, 4}
                  }, 
                  { 
                    {-4, -5, 6, 9}, 
                    {1}, 
                    {2, 3}
                  } 
              };

              // for..each loop to iterate through elements of 3d array
              for (int[][] array2D: test) {
                  for (int[] array1D: array2D) {
                      for(int item: array1D) {
                          System.out.println(item);
                      }
                  }
              }
	}

}

