public class HelloApp {
    public static void main(String[] args) {
        
        // using stringBuilder concepts
        StringBuilder nameBuilder = new StringBuilder();

        for (int i=0; i<args.length; i++){
            nameBuilder.append(args[i]);

            if(i < args.length - 1){
                nameBuilder.append(", ");
            }
        }

        System.out.println(nameBuilder.toString());

    }
}