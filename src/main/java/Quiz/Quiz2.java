package Quiz;

public class Quiz2 {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++){
            for(int j = 5; j > 0; j--){
                if(i < j){
                      System.out.printf(" ");
                  }else{
                      System.out.printf("*");
                  }
              }
              System.out.println();
        }

        for (int i = 1; i > 6; i++){
            for (int j = 5; j > 0; j--){
                if (i > j){
                    System.out.printf(" ");
                }else{
                    System.out.printf("*");
                }
                System.out.println();
            }
        }

    }

//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i < 6; i++){
//            for (int j = 5; j > i; j--){
//                System.out.printf("*");
//            }
//            System.out.println();
//        }
//    }
}