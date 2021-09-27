public abstract class RemoveAllSpacesFromString {
    public static void main(String[] args) {
        String str = "  j    a    va s   ta   r   ";
        System.out.println(str.replaceAll("\\s", ""));     
     }
}
