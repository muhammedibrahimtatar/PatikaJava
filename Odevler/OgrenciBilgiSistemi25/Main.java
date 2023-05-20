package Pratik.OgrenciBilgiSistemi25;

public class Main {
    public static void main(String[] args) {
        Course mat =new Course("Matematik","MAT101","MAT");
        Course fizik=new Course("Fizik","FZK101","FZK");
        Course kimya=new Course("Kimya","KMY101","KMY");

        Teacher t1=new Teacher("Mahmut Hoca","432535","MAT");
        Teacher t2=new Teacher("Badi Ekrem","123523","FZK");
        Teacher t3=new Teacher("Zühtü Hoca","3252352","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("İnek Şaban",4,"214124124",mat,fizik,kimya);
        s1.addBulkExamNote(50,29,59);
        s1.isPass();

        Student s2=new Student("Güdük Necmi",4,"2155524",mat,fizik,kimya);
        s2.addBulkExamNote(70,50,80);
        s2.isPass();

        Student s3=new Student("Hayta İsmail",4,"12524124",mat,fizik,kimya);
        s3.addBulkExamNote(90,20,69);
        s3.isPass();
    }
}
