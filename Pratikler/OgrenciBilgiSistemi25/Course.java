package Pratik.OgrenciBilgiSistemi25;

public class Course {
    //Nitelikler
    String name;
    String code;
    String prefix;
    int note;
    Teacher courseTeacher;

    //Constructor Kurucu Metotlar
    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;

    }

    //Metotlar
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("İşlem başarılı");
        }else{
            System.out.println("Akademisyen bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if(courseTeacher!=null){
            System.out.println(this.name+" dersin akademisyeni: "+courseTeacher.name);
        }else {
            System.out.println(this.name+" dersine akademisyen atanamamıştır.");
        }

    }
}
