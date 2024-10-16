


// Input  : GeeksforGeeks
// Output : for

// Input  : HelloGeeks
// Output : HoGks




public class Print_all_distinct_characters_of_a_string_in_order_GitHub {

      static void allDistinctCharacter(String str, int n){

            for(int i=0; i<n; i++){
                  int flag = 0;
                  for(int j=0; j<n; j++){
                        if(str.charAt(i) == str.charAt(j) && i != j){
                              flag = 1;
                              break;
                        }
                  }
                  if(flag == 0){
                        System.out.print(str.charAt(i));
                  }
            }
      }


      public static void main(String[] main){
            String str = "HelloGeeks";
            int n = str.length();

            allDistinctCharacter(str, n);

      }
}






