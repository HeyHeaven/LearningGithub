public class Student {
    private String name;
    private char Gender;
    boolean isPresent;
    void goSchool(){
        System.out.println("Ok, bye!");
    }
    void setGender(char x){
        this.Gender=x;
    }
    public void setName(String x){
        this.name=x;
    }
    public void getName(){
        System.out.print(this.name);
    }
    public void getGender(){
        System.out.print(this.Gender);
    }
}
