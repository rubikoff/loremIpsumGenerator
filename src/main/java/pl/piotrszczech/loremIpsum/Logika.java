package pl.piotrszczech.loremIpsum;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

public class Logika {


    public static String kalkuluj(String a, String b, int c){

        Lorem lorem = LoremIpsum.getInstance();

        String first = "Lorem. ";
        String second = "Lorem ipsum. ";
        String third = "Lorem ipsum dolor. ";
        String fourth = "Lorem ipsum dolor sit. ";

        if(a.equals("lorem") && b.equals("akapit") && c >0){

            StringBuilder words = new StringBuilder();
            String start = "  Lorem ipsum dolor sit amet, ";
            words.append(start);
            for(int k= 0; k <=c-1; k++){
                words.append(lorem.getWords(70,250));
                words.append("\n");
                words.append("\n");
                words.append("\n");
            }
            return String.valueOf(words);
        }
        if (a.equals("lorem") && b.equals("słowa") && c ==5){
            return "Lorem ipsum dolor sit amet. ";
        }
        if (a.equals("lorem") && b.equals("słowa") && c ==4){
            return fourth;
        }
        if (a.equals("lorem") && b.equals("słowa") && c ==3){
            return third;
        }
        if (a.equals("lorem") && b.equals("słowa") && c ==2){
            return second;
        }
        if (a.equals("lorem") && b.equals("słowa") && c ==1){
            return first;
        }
        if (a.equals("lorem") && b.equals("słowa") && c >5){
            return "Lorem ipsum dolor sit amet, " + lorem.getWords(c-5);
        }
        if (a.equals("x") && b.equals("akapit") && c > 0){

            StringBuilder words = new StringBuilder();
            String start="";
            for(int k= 0; k <=c-1; k++){
                words.append(lorem.getWords(70,250));
                words.append("\n");
                words.append("\n");
                words.append("\n");
            }
            return String.valueOf(words);
        }
            return lorem.getWords(c);
    }
}
