import java.util.PropertyResourceBundle;

public class Client {

    public static void main(String[] args) {
        Prototype student = new Student("Gyan","BSBE","Umiam",150106020);
        System.out.println(student);

        Prototype studentClone = student.clone();
        System.out.println(studentClone);

        Prototype quadr = new Quadrilaternal(5,4,6,8);
        System.out.println(quadr);

        Prototype quadrClone = quadr.clone();
        System.out.println(quadrClone);
    }



}
