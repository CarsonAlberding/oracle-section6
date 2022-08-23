public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
//        int i = 0;
//        do {
//
//            i++;
//        } while (i <= height);


        for (int g = 0; g<width; g++){
            System.out.print("x");
        }

        for (int i = 0; i<=(height-2); i++){
            System.out.println();
            for (int z = 0; z<=1; z++){
                System.out.print("x");
                for (int k = 0; k<(width-1); k++){
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int g = 0; g<width; g++){
            System.out.print("x");
        }
        
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        
        
    }
}
