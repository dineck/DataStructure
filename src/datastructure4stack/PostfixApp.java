package datastructure4stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PostfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        
        while(true) {
            System.out.print("Exnter postfix: ");
            System.out.flush();
            input=getString();
            if(input.equals(""))
                break;
            ParsePost aParser=new ParsePost(input);
            output=aParser.doParse();
            System.out.println("Evaluates to "+output);
        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
}
