public class Main {
    public static void main(String[] args) {

        int eatrs = 5; //сколько людей будут есть
        int water = 3000; //сколько миллилитров воды
        int potatoes = 5; //картофелин
        int chicken =6; //бедер куриных
        int spices = 10; //ложек специй

        System.out.println("Сварили суп.На одного человека вышло:");
        System.out.println((water / eatrs)+"миллитров воды");
        System.out.println((potatoes / eatrs)+ "картофелин(а)");
        System.out.println((chicken / eatrs)+ "куриных (ое) бедер (о)");
        System.out.println((spices / eatrs)+"ложек (ка) специй");


    }
}
