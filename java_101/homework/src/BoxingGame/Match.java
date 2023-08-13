package BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Fighter empty;


    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        if (whoIsFirst()) {
            this.f1 = f1;
            this.f2 = f2;
        } else {
            this.f1 = f2;
            this.f2 = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {

            while (this.f1.health > 0 && this.f2.health > 0) {
                f2.health = f1.hit(f2);
                if (f2.health <= 0) {
                    System.out.println(f2.name + " hayatını kaybetti.");
                    System.out.println("=====================================");
                    System.out.println("Dövüşün kazananı ===> " + f1.name);
                    break;
                } else {
                    System.out.println(f2.name + " adlı dövüşcünün canı : " + f2.health);
                    System.out.println("-----------------------------------------");
                }
                f1.health = f2.hit(f1);
                if (f1.health <= 0) {
                    System.out.println(f1.name + " hayatını kaybetti.");
                    System.out.println("=====================================");
                    System.out.println("Dövüşün kazananı ===> " + f2.name);
                    break;
                } else {
                    System.out.println(f1.name + " adlı dövüşcünün canı : " + f1.health);
                    System.out.println("-----------------------------------------");

                }
            }

        } else {
            System.out.println("Sporcu sikletleri uyumlu değil maç iptal!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean whoIsFirst() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= 50 ? true : false;
    }

}
