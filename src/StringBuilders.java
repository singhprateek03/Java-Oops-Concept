class StringBuilderExample{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string -> yeah senetence ko last main add karta hai
        sb.append(" world");
        System.out.println(sb);

        // Insert a string
        sb.insert(5,",");
        System.out.println(sb);

        // delete a string
        sb.delete(5,6);
        System.out.println(sb);

        // Reverse a string
        sb.reverse();
        System.out.println(sb);

    }
}