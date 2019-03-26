/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muqingyan
 */
public class test1 {

    public static void main(String[] args) {
        String line_1 = "line1";
        String[] list_1 = {"line1#potential", "line2#potential"};
        for (String list_line : list_1) {
            if (list_line.contains(line_1)) {
                System.out.println(list_line + " Contains " + line_1);
            }
        }

        String line_2 = " ";
        System.out.println(line_2.length());
        if (line_2.equals(" ")) {
            System.out.println("Empty");
        }
        String keys ="chr24";
        String key = keys.replaceAll("(?i)chr", "");
        
        System.out.println(key);
    }
}
