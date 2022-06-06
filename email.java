import java.util.Scanner;
import java.lang.Boolean;

class Main {
  public static void main(String[] args) {
   Scanner wczytaj = new Scanner(System.in);
   boolean flag = false, check = true; 
      while(!flag)
      {
      flag = true;
      check = true;
      String email = wczytaj.nextLine();
      int dl = email.length();
      char f = email.charAt(0);
      char l = email.charAt(dl-1);
      int at = email.indexOf('@'), at2 = email.lastIndexOf('@');
      int znaki = 0;
      char temp=' ';
        try{
           if(!email.contains("@"))
           {
            check = false; flag = false;
            throw new Exception("Email nie zawiera @");
          }
          if(email.contains(" "))
          {
            check = false; flag = false;
            throw new Exception("Email zawiera spacje");
          }
          if(f=='@' || l=='@')
          {
            check = false; flag = false;
          throw new Exception("Znak @ na pierwszym lub ostatnim miejcu");
          }
          for(int i = 0; i<dl; i++)
          {
            temp = email.charAt(i);
            if (temp == '@')
                znaki++;
          }
          if(znaki>1)
          { 
            check = false; flag = false;
            throw new Exception("Dwa lub wiecej znakow @");
          }
        }catch(Exception e){
          System.out.println(e.toString());
        }
      }
      if(check)
       System.out.println("OK");
      wczytaj.close();
  }
}