
public class Students {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Students(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(double mat, double fizik, double kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;

        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addBulkOralExamNote(double mat,double fizik,double kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.oralExamNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.oralExamNote = fizik;

        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.oralExamNote = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
       double fizAvrg=this.fizik.note*0.8+this.fizik.oralExamNote*0.2;
       double kimAvrg=this.kimya.note*0.7+this.kimya.oralExamNote*0.3;
       double matAvrg=this.mat.note*0.6+this.mat.oralExamNote*0.4;
       this.avarage=(fizAvrg+kimAvrg+matAvrg)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralExamNote);
        System.out.println("Fizik Notu Sözlü: " + this.fizik.oralExamNote);
        System.out.println("Kimya Notu Sözlü : " + this.kimya.oralExamNote);
    }


}
