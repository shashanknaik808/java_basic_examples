class CommandLineDemoOne
{
   public static void main(String []args)
   {
     System.out.println("Input No.1: " + args[0]);
     System.out.println("Input No.2: " + args[1]);
     System.out.println("Input No.3: " + args[2]);

     String s = args[0] + args[1] + args[2];
     System.out.println(s);
     }
}