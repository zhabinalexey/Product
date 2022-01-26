public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple ("Fruits","Only red", 20);
        Eggs eggs  = new Eggs("Fruits"," Only round",30);
        Potato potato = new Potato ("Fruits", "Potato is very delicious",8);

        Products [] fruits = {apple,eggs,potato};
        Products [] withprice20 = new Products[fruits.length];
        Products [] withprice30 = new Products[fruits.length];

        for (int i = 0; i< fruits.length; i++) {
            if (fruits[i].getClass().equals(withprice20)) {
                 withprice20[i] = fruits[i];
            }
            if (fruits[i].getClass().equals(withprice30)) {
                withprice30[i] = fruits[i];

            }

    }
}

