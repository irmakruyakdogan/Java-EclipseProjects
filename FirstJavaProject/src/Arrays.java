public class Arrays {

    public static void main(String[] args){

        //Arrays

        String student = "Student X";
        String student1 = "Student Y";
        String student2 = "Student Z";

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);

        String[] students = new String[3];

        students[0] = "Irmak";
        students[1] = "Luna";
        students[2] = "Rüya";

        for (int i = 0; i < students.length; i++){

            System.out.println(students[i]);

        }

        for (String ogrenci:students){

            System.out.println(ogrenci);

        }

    }

}
