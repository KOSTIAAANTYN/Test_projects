import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professorAlex = new Professor("Alex", "B.", 2);
        professorAlex.setSurname("A.");
        String mail = professorAlex.mail("Hello world!");
        String mail1 = professorAlex.mail("Hello world!");
        String mail2 = professorAlex.mail("Hello world!");
        System.out.println(mail);
        System.out.println(mail1);
        System.out.println(mail2);

        System.out.println(professorAlex.getMsgSent());

        Student studentVasil = new Student("Vasil", "W.", 23, 3);
        String Studentmail= studentVasil.mail("Hi,Im new student!");
        System.out.println(Studentmail);
        System.out.println();

        String profMSG=professorAlex.mail("How are u?", studentVasil.getSurname());
        System.out.println(profMSG);
        String profMSG2=professorAlex.mail(5,studentVasil.getSurname());
        System.out.println(profMSG2);


        List<User> userList=new ArrayList<>();
        userList.add(professorAlex);
        userList.add(studentVasil);
        System.out.println(userList);

       



    }
}