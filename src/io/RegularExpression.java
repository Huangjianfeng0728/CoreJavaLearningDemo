package io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("[\\w\\W]*(\\d{4})(-\\d){2}\\w*");
        Matcher matcher = compile.matcher("6000|1996-1-1dad");
        if (matcher.matches()){
            System.out.println(matcher.group(1));
        }

    }
}
