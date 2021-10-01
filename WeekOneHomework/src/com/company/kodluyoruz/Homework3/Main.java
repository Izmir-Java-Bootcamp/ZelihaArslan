package com.company.kodluyoruz.Homework3;

public class Main {
    public static void main(String[] args) {

        Student student=new Student("Zeliha Arslan",5005,2.81,(new PersonalData(1994,02,05,1239)));
        Student student1=new Student("Hatice Ulusoy",5006,3.25,(new PersonalData(1996,05,31,4589)));
        Student student2=new Student("Fatma Gürel",5007,3.42,(new PersonalData(1993,06,25,1389)));
        Student student3=new Student("Neslihan Tekmen",5008,3.1,(new PersonalData(1992,11,06,1289)));
        Student student4=new Student("Gözde Nur Arslan",5009,3.35,(new PersonalData(1995,12,24,7789)));
        Course course=new Course("K129",3);                              //kurs kapasitesi 3
        course.addStudent(student);
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        System.out.println("---------------------------------");
        System.out.println("Kurstaki öğrenciler: "+course.getName());
        course.list();
        System.out.println("---------------------------------");
        course.increaseCapacity();                                                      //kapasiteyi arttır
        course.addStudent(student3);
        course.addStudent(student4);
        System.out.println("Kurstaki öğrenciler: "+course.getName());
        course.list();
        System.out.println("---------------------------------");
        course.dropStudent(student);                                                   //dizideki öğrenci sayısını 1 azalt
        course.list();
        System.out.println("Kursta kalan öğrenci sayısı: "+course.getNumberOfStudent());
        System.out.println("Kurstaki en iyi öğrencinin doğum yılı: "+course.getBestStudent().getPd().getBirthDate().getYear()); //ortalaması en yüksek olan öğrencinin doğum yılını ekrana getirir
        System.out.println("---------------------------------");
        Course course2=new Course("K130");                                        //yeni bir sınıf oluşturuldu
        for(int i=0;i<course.getNumberOfStudent();i++) {                               //K129 daki tüm öğrenciler K130 a eklenir
            course2.addStudent(course.getStudents()[i]);
        }

        course.clear();                                          //K129 daki tüm öğrencileri kaldır
        course.list();                                           //K129 u listele
        System.out.println("---------------------------------");
        course2.list();                                          //K130 u listele
        course2.dropStudent(course2.getBestStudent());           //K130 da bulunan en iyi öğrenciyi çıkar
        course2.list(); //K130 u listele
        System.out.println("En genç ögrencinin not ortalamasi : " +course2.getYoungestStudent().getGpa());
    }
}
