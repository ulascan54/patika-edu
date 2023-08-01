package Giris;

public class IfElse {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 6;

        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);

        float saltRatio = 0.9f;
        if(saltRatio >= 0.8) {
            System.out.println("yüksek derecede tuzlu");
        }
        else if(0.5 < saltRatio && saltRatio < 0.8 ) {
            System.out.println("orta derecede tuzlu");
        }
        else {
            System.out.println("düşük derecede tuzlu");
        }

        int i=20;
        if(i==10){
            System.out.println("i nin degeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i nin degeri 10'dan kücüktür.");
        }
        else{
            System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");
        }


        int age=25;
        int weight=48;

        if(age>=18){

            if(weight>=48){
                System.out.println("Kan verebilirsiniz");
            }
            else{
                System.out.println("Kan veremezsiniz");
            }

        }
        else{
            System.out.println("Kan verebilmek için yaşınız 18'den büyük olmalıdır.");
        }

    }
}
