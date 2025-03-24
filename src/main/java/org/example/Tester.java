package org.example;

public class Tester {
    public String name;
    public String surname;
    public int expirienceInYears;
    public int englishLevel;
    public double salary;

    public Tester(String name, String surname, int expirienceInYears, int englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester(String name,String surname){
        this(name,surname,0,0,0.0);
    }
    public Tester(){

    }
    public void primiya(double per){
        this.salary += this.salary*(per*100);
    }
    public void premiya(){
        primiya(10);
    }
    public void setEnglishLevel(int newLevel) {
        if (newLevel >= 0 && newLevel <= 10) {
            this.englishLevel = newLevel;
        }
    }
    public void setEnglishLevel() {
        setEnglishLevel(this.englishLevel + 1);
    }
    public void setExpirienceInYears(){
        this.expirienceInYears+=1;
    }
    public void setExpirienceInYears(int stag){
        this.expirienceInYears+=stag;
    }
    public void setExpirienceInYears(int stag,boolean salary){
        setExpirienceInYears(stag);
            if(salary){
                this.salary*=(1+0.05*stag);
        }
    }
    public static Tester sravni(Tester t1, Tester t2){
        if(t1.expirienceInYears > t2.expirienceInYears){

            return t1;
        }

        else if(t2.expirienceInYears > t1.expirienceInYears){
            return t2;
        }
        return null;
    }
}
