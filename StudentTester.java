public class StudentTester {
    public static void main(String[] args) {
        Student jimmy = new Student();
        Student alex = new Student(15, 20, 17);

        System.out.println(jimmy.toString());
        System.out.println(alex.toString());
        
        if (jimmy.validateData() == " "){
            System.out.println(jimmy.toString());
        }
        else System.out.println("For Jimmy:\n" + jimmy.validateData());

        if(alex.validateData() == " "){
            System.out.println(alex.toString());
        }
        else System.out.println("For Alex:\n" + alex.validateData()); 
    }
}
