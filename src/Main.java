public class Main {
    public static void main(String[] args) {
        SmartPhonePrice smartPhonePrice1 = new SmartPhonePrice("euro",500.00);
        SmartPhonePrice smartPhonePrice2 = new SmartPhonePrice("dollaro", 450.50);
        SmartPhonePrice smartPhonePrice3 = new SmartPhonePrice("sterline",666.00);
        SmartPhonePrice smartPhonePrice4 = new SmartPhonePrice("yen",777.00);

        SmartPhone smartPhone1 =new SmartPhone("note","samsung",5000,smartPhonePrice1,smartPhonePrice2);
        SmartPhone smartPhone2= new SmartPhone("mi11t", "xiaomi",5000,smartPhonePrice3,smartPhonePrice4);

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);

        if (smartPhone1.equals(smartPhone2)){
            System.out.println("gli smartphone sono uguali");
        }else {
            System.out.println("gli smartphone sono diversi");
        }
        SmartPhone smartPhoneclone =null;

        try {
            smartPhoneclone = (SmartPhone)smartPhone2.clone();
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
            System.out.println("smartphone non clonabile");
            System.exit(1);

        }

        System.out.println(smartPhoneclone);

        if (smartPhoneclone.equals(smartPhone2)){
            System.out.println("il clone è uguale a smartphone2");
        } else {
            System.out.println("il clone non è uguale al smartphone2");
        }
    }
}