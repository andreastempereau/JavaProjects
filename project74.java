public class project74 {
   public String getLetterGrade(int grade){
      if (grade<100 && grade>95){
         return "A+";
      }
      if (grade<96 && grade>91){
         return "A";
      }
      if (grade<92 && grade>89){
         return "A-";
      }
      if (grade<90 && grade>87){
         return "B+";
      }
      if (grade<87 && grade>81){
         return "B";
      }
      if (grade<82 && grade>79){
         return "B-";
      }
      if (grade<80 && grade>75){
         return "C+";
      }
      if (grade<76 && grade>71){
         return "C";
      }
      if (grade<72 && grade>69){
         return "C-";
      }
      if (grade<70 && grade>65){
         return "D+";
      }
      if (grade<66 && grade>61){
         return "D";
      }
      if (grade<62 && grade>59){
         return "D-";
      }
      else return "F";
   }
}
