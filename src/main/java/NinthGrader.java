public class NinthGrader extends Student{ // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String a,String b,int c){
        super(a,b,c);
    }
    public NinthGrader() {
        super("Jazz", "Bruh",2025);
    }
    public void doSomething() {
        System.out.println("I am preparing for a Harkness discussion!");
    }
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", 2025, (Ninth Grader)";
        return str;
    }
}
