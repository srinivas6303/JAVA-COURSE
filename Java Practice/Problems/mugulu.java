public class mugulu {
    public static void main(String[] args) {
        /*

         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         */


//        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

 //------------------------------------------------------------------

////NO Space at end
        /*

         *-*-*-*-*
         *-*-*-*-*
         *-*-*-*-*
         *-*-*-*-*
         *-*-*-*-*

         */
//
//        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//
//                if(j!=n-1){
//                    System.out.print("-");
//                }
//
//            }
//            System.out.println();
//        }


        ////or


//        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//
//                if(j==n-1){
//                    System.out.print("");
//                }
//                else{
//                    System.out.print("-");
//                }
//
//            }
//            System.out.println();
//        }


//------------------------------------------------------------------

        /*
         removing end space
         *-*-*-*-*-*-*-*-*-*
         *-*-*-*-*-*-*-*-*-*
         *-*-*-*-*-*-*-*-*-*

        */
//        int r=3;
//        int c=10;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print("* ");
//                if(j!=c-1){
//                    System.out.print("_");
//                }


//
//            }
//            System.out.println();
//       }
// ------------------------------------------------------------------

        /*

         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*
         *-*-*


         */

//
//        int r=10;
//        int c=3;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print("* ");
//                if(j!=c-1){
//                    System.out.print("_");
//                }
//
//            }
//            System.out.println();
//        }



//-----------------------------------------------

        /*

         * * * * *
         *       *
         *       *
         *       *
         * * * * *


         */
//        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i==0 || j==0 || i==n-1 || j==n-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//
//                }
//            }
//            System.out.println();
//        }



//--------------------------------------------------------
        /*

         * * * * * * * * * *
         *                 *
         *                 *
         *                 *
         * * * * * * * * * *


         */
//        int r=5;
//        int c=10;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if(i==0 || j==0 || i==r-1 || j==c-1){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//
//                }
//            }
//            System.out.println();
//        }

//--------------------------------------------------

        /*

         * * * *
         * * *
         * *
         *


         */
//        int n=4;
//        for (int i = 0; i <n; i++) {
//            for (int j = i; j <n; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }



//-----------------------------------------
        /*
    ****
   ****
  ****
 *****
        */

//        int n=4;
//        for (int i = 0; i <n; i++) {
//            for (int j = i; j <n; j++) {
//
//                System.out.print(" ");
//
//            }
//            for(int k=0;k<n;k++){
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }


        //------------------------------------------------

//        ----*
//        ---**
//        --***
//        -****
//
//        int n = 4;
//
//        for (int i = 0; i < n; i++) {
//
//            for (int j = i; j < n ; j++) {
//                System.out.print("-");
//            }
//
//            for (int k = 0; k <= i; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//-------------------------------------------------------------------


        /*

         *  *  *  *  *
         *           *
         *     *     *
         *           *
         *  *  *  *  *

         */

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if(i==1 || j==1 || i==n || j==n  || (i==3 && j==3)) {
//                    System.out.print("*  ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//
//        }

//------------------------------------------------------

        /*

*  *  *  *  *
*  *     *  *
*     *     *
*  *     *  *
*  *  *  *  *

         */


//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if(i==1 || j==1 || i==n || j==n  || i+j==n+1 || i==j) {
//                    System.out.print("*  ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//
//        }

//-----------------------------------------------------------

   /*

*           *
*  *     *  *
*     *     *
*  *     *  *
*           *

    */


//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if( j==1 || j==n ||  i+j==n+1 || i==j) {
//                    System.out.print("*  ");
//                }
//                else{
//                    System.out.print("   ");
//                }
//
//            }
//            System.out.println();
//
//        }
//--------------------------------------------------------------------
//            Triangles
 //

 /*
     *
    ***
   *****
  *******
 *********


  */

//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = i; j <=n ; j++) {
//
//                System.out.print(" ");
//
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//
//            for(int k=2;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

      //  -----------------------------------------------
        /*

         *********
          *******
           *****
            ***
             *


         */
//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print(" ");
//
//            }
//
//            for (int k = i; k <=n; k++) {
//                System.out.print("*");
//            }
//
//            for (int l = i; l <=n-1; l++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }




        //-----------------------------------------------

        /*

         *
         **
         ***
         ****
         *****
         */

//        int  n=5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }

 //---------------------------------------------------------
 /*

  *****
  ****
  ***
  **
  *

  */
//        int  n=5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = i; j <=n ; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//------------------------------------------------------
    }
}
