package test.day06;

public class Q2_KelimedekiHarflerinSayilariniBulma {

    /*
     * Interview question
     *
     * write a return method that can find the frequency of characters (with case
     * sensitivity)
     * (karakterin sıklığını bulan bir dönüş yöntemi yazın) (büyük küçük harf duyarlı)
     *
     * Input = AAABBCDD output = A3B2C1D2
     */

    static String bosKova="";

    public static void main(String[] args) {

        String kelime= "Gulhayat";
        System.out.println(frequency(kelime)); // G1u1l1h1a2y1t1
        System.out.println(bosKova); // G1u1l1h1a2y1t1
    }

    public static String frequency (String str) {

        int count=0;


        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                if (str.substring(i,i+1).equals(str.substring(j,j+1))){

                    count++;
                }
            }
            if (!bosKova.contains(str.substring(i,i+1))){
                bosKova=bosKova+str.charAt(i)+count;
            }
            count=0;
        }

    return bosKova;
    }
}
