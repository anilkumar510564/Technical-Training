package com.torryharris.driver;

import com.torryharris.testing.ChangeStringCase;

public class ChangeStringCaseDemo {
    public static void main(String[] args) {
        ChangeStringCase cs=new ChangeStringCase();
        cs.toCapitalLetter("research and analysis wing");
        cs.toSmallLetter("INTELLIGENCE BUREAU");
    }
}
