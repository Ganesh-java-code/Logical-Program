package in.ganesh.test.exceptions;

public class ExceptionExamples {

    public static void main(String[] args) {
        try {
            int a = 10/0;
//            String s=null;
//            System.out.println( s.length());
//            int[] arr = new int[]{1,2,3,4,5};
//            for (int i=0;i<arr.length+1;i++){
//                int i1 = arr[i];
//                System.out.println(i1);
//            }
            System.out.println(a);
//            Object o = new Object();
//            String s= (String) o;
//            System.out.println(s);
//            int[] arr = new int[1231231231];
//            System.out.println(arr.length);

//        }catch (ClassCastException cce){
//            System.out.println("class cast exception...");
//        }catch (ArithmeticException ae){
//            System.out.println("Arithmetic Exception Executed...");
//            ae.printStackTrace();
//        }catch (NullPointerException ne){
//            System.out.println("Null pointer executed..");
//        }catch (ArrayIndexOutOfBoundsException aie) {
//            System.out.println("Array index out of bounds exception...");
//        } catch (Exception e){
//            System.out.println("Exception executed...");
//            e.printStackTrace();
//        }catch (OutOfMemoryError oome){
//            System.out.println("out of memory error..");
//        }catch (Throwable t) {
//            System.out.println("Throwable executed...");
//            t.printStackTrace();
       }finally {
            System.out.println("finally block always executed..");
        }
    }

}
