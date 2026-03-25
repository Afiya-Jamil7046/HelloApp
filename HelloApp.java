public class HelloApp {
    public static void main(String[] args) {
        
        // using stringBuilder concepts
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if (!first) {
                nameBuilder.append(" ");
            }
            nameBuilder.append(name);
            first = false;
        }
        String name = nameBuilder.toString();   
        System.out.println(name);
    }

}