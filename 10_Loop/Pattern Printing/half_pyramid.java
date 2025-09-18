// public class half_pyramid {
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//2. inverted half pyramid
// public class half_pyramid {
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//3. inverted half pyramid rotated by 180 degree

 public class half_pyramid {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}