class NameParser {
    public String parse(String[] names) {
      
      StringBuilder result = new StringBuilder();
       
      for (String obj: names){
        
        String firstName = obj.split(" ")[0];
            result.append(firstName).append(", ");
        }
      
        String result1 = result.toString().trim();
      
          int r = result1.length();

         if (result1.isBlank()){

             return result1;
         }
      
          return result1.substring(0,r-1);
      
      
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}