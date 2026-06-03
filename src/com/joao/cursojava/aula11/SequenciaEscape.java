package com.joao.cursojava.aula11;

public class SequenciaEscape {

    static void main(String[]args){

        //"Hello, World!"
        System.out.print("\"Hello, World!\"\n\r");
        //println é o mesmo que fazer isso \"\n\r"
        //1\4
        System.out.println("1\\4");
    }
}
