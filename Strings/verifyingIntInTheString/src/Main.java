public class Main {

    static void modifier(String data)
    {
       int i=0,size = data.length();
       while (i!=size){
           if(data.charAt(i)>='0'&& data.charAt(i)<='9'){

               i++;
           }else{
               System.out.println("Not An Integer String");
               System.exit(0);
           }

       }
        System.out.println("Integer String");
    }

    public static void main(String[] args) {
        modifier("1234500");
    }
}