//Braille I/O Challenge
//ICS4U1, Dip Tandel
//Oct 18, 2021

import java.util.Scanner;
import java.io.File;
public class Braille{
  public static void main(String[] args) throws java.io.FileNotFoundException{ 
    Scanner file = new Scanner(new File("Braille1.txt"));
    
    String letter = ""; //these variables will be used later
    String line = ""; 
    String[] arr = new String[3];
    
    while (file.hasNext()){ //go until the end
      //Seperate every 3 lines
      for (int h = 0; h < 3; h++) {
        line = file.next();
        arr[h] = line;  //add each line to the array which will make up the first line/phrase
      }
      for (int k = 0; k < line.length(); k=k+2) {  //skips 2 because of braille structure
        for (int i = 0; i <=2; i++) { //goes through the lines which were added to the array
          letter = letter + arr[i].substring(k,k+2); //adds up each substring
        }
        System.out.print(check(letter)); //goes to the method and finds corresponding letter
        letter = ""; //reset for next letter
      }
      System.out.println(); //next line/phrase
    }
  }
  public static String check(String letter) {
    //code each braille letter and if there is a match, then convert braille to ordinary english
    
    //the alphabet
    String space = "oooooo";
    String a = "xooooo"; 
    String b = "xoxooo"; 
    String c = "xxoooo"; 
    String d = "xxoxoo"; 
    String e = "xooxoo"; 
    String f = "xxxooo";
    String g = "xxxxoo"; 
    String h = "xoxxoo"; 
    String i = "oxxooo"; 
    String j = "oxxxoo"; 
    String k = "xoooxo"; 
    String l = "xoxoxo"; 
    String m = "xxooxo"; 
    String n = "xxoxxo"; 
    String o = "xooxxo"; 
    String p = "xxxoxo"; 
    String q = "xxxxxo"; 
    String r = "xoxxxo"; 
    String s = "oxxoxo"; 
    String t = "oxxxxo"; 
    String u = "xoooxx"; 
    String v = "xoxoxx"; 
    String w = "oxxxox"; 
    String x = "xxooxx"; 
    String y = "xxoxxx"; 
    String z = "xooxxx";
    
    //match checker
    if (letter.equals(space)) {
      letter = " ";
    }
    if (letter.equals(a)) {
      letter = "a";
    }
    if (letter.equals(b)) {
      letter = "b";
    }
    if (letter.equals(c)) {
      letter = "c";
    }
    if (letter.equals(d)) {
      letter = "d";
    }
    if (letter.equals(e)) {
      letter = "e";
    }
    if (letter.equals(f)) {
      letter = "f";
    }
    if (letter.equals(g)) {
      letter = "g";
    }
    if (letter.equals(h)) {
      letter = "h";
    }
    if (letter.equals(i)) {
      letter = "i";
    }
    if (letter.equals(j)) {
      letter = "j";
    }
    if (letter.equals(k)) {
      letter = "k";
    }
    if (letter.equals(l)) {
      letter = "l";
    }
    if (letter.equals(m)) {
      letter = "m";
    }
    if (letter.equals(n)) {
      letter = "n";
    }
    if (letter.equals(o)) {
      letter = "o";
    }
    if (letter.equals(p)) {
      letter = "p";
    }
    if (letter.equals(q)) {
      letter = "q";
    }
    if (letter.equals(r)) {
      letter = "r";
    }
    if (letter.equals(s)) {
      letter = "s";
    }
    if (letter.equals(t)) {
      letter = "t";
    }
    if (letter.equals(u)) {
      letter = "u";
    }
    if (letter.equals(v)) {
      letter = "v";
    }
    if (letter.equals(w)) {
      letter = "w";
    }
    if (letter.equals(x)) {
      letter = "x";
    }
    if (letter.equals(y)) {
      letter = "y";
    }
    if (letter.equals(z)) {
      letter = "z";
    }
    //return translated
    return letter;
  }
}