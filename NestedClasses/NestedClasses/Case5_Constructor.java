package NestedClasses;

    class outer3{
        outer3(){
            System.out.println("Outer class constructor"); // Executed third
        }
        {
            System.out.println("Outer class instance blocks"); // Executed second
        }
        static{
            System.out.println("Outer class static blocks"); // executed first
        }
            class inner3{
                inner3(){
                    System.out.println("inner class constructor"); // executed fifth.
                }
                {
                    System.out.println("inner class instance blocks"); // Executed fourth
                }
            }
    }
        
class Case5_Constructor {

    public static void main(String[] args) {
            new outer3().new inner3();
    }

}
