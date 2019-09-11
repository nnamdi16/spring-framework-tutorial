package com.spellChecker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spell {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spell.xml");
        TextEditor textEditor = (TextEditor) context.getBean("spellChecker");
        textEditor.spellCheck();
    }
}
