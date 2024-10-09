package Lab3;

public class Lab3Main {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("abcd", 3));
        System.out.println(methods.funnyString("silly", 1));
        System.out.println(methods.halvesReversed("first and second"));
        System.out.println(methods.pigLatin("crikey"));
        System.out.println(methods.removeCharacter("Two Words", 1));
        System.out.println(methods.insertAt("hahaha", "NOT HAHA", "aha"));
        System.out.println(methods.endUp("lowercase", 4));
        System.out.println(methods.yellOrWhisper("Hehehehehehe"));
    }

}
