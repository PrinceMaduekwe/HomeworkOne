public class Main {

    public static void main(String[] args) {

        Polynomial polyTest1 = new Polynomial();
        Polynomial polyTest2 = new Polynomial();
        Polynomial polyTest3 = new Polynomial();


        polyTest1.addTerm(3,4);
        polyTest1.addTerm(2,2);
        polyTest1.addTerm(3,7);

        polyTest2.addTerm(2,3);
        polyTest2.addTerm(4,5);

        polyTest3.addTerm(3,4);
        polyTest3.addTerm(2,3);
        polyTest3.addTerm(2,2);
        polyTest3.addTerm(7,12);




        System.out.println(polyTest1);
        System.out.println(polyTest2);
        System.out.println(polyTest3);


    }
}
