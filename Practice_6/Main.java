public class Main {
    public static void main(String[] args) {
        practice1();
        practice2();
        practice3();
        practice4();
    }
    private static void practice1() {
        System.out.println("Практика #1");

        String originalString = "Hello World!";
        String base64Encoded = java.util.Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println(base64Encoded);

        byte[] decodedBytes = java.util.Base64.getDecoder().decode(base64Encoded);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);

        String urlOriginal = "Hello World!";
        String urlEncoded = java.net.URLEncoder.encode(urlOriginal, java.nio.charset.StandardCharsets.UTF_8);
        System.out.println(urlEncoded);

        try {
            String decodedUrlString = java.net.URLDecoder.decode(urlEncoded, "UTF-8");
            System.out.println(decodedUrlString);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static void practice2() {
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = Boolean.valueOf(false);
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("false");
        boolean primitiveBool = true;
        Boolean bool5 = primitiveBool;

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        System.out.println("bool5: " + bool5);
    }

    private static void practice3() {
        Integer nullInteger = null;
        try {
            int value = nullInteger;
        } catch (NullPointerException e) {
            System.out.println("Исключение: " + e); // NullPointerException
        }
    }

    private static void practice4() {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));
        System.out.println("a1==b1 " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}
