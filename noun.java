public class noun {
    private String spelledNoun;
    private String gender;
    public noun(String n){
        spelledNoun = n;
        gender = this.makeGender();
    }
    public String makeGender(){
        char temp = spelledNoun.charAt(spelledNoun.length() - 1);
        if (temp == 'o') return ("Feminine");
            else if (temp == 'a') return ("Masculine");
                else return ("Neutral");
    }
    public String getGender(){
        return gender;
    }
    public String getSpelledNoun(){
        return spelledNoun;
    }
}
