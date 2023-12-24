package org.example;

import java.util.ArrayList;
import java.util.List;

public class SmileFaces {

        public static int countSmileys(List<String> arr) {

            List reducedNumberOfSmileys = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length()== 2) {
                if (arr.get(i).startsWith(":") || arr.get(i).startsWith(";")) {
                    if (arr.get(i).endsWith(")") || arr.get(i).endsWith("D")) {
                        reducedNumberOfSmileys.add(arr.get(i));
                    }
            }
            }

            }
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).length()== 3) {
                if (arr.get(i).startsWith(":") || arr.get(i).startsWith(";")) {
                    if (arr.get(i).endsWith(")") || arr.get(i).endsWith("D")) {
                        if (arr.get(i).contains("-") || arr.get(i).contains("~")) {
                            if (arr.get(i).length() <=3) {
                                reducedNumberOfSmileys.add(arr.get(i));
                            }
                        }
                    }
                }
            }
            }
            return reducedNumberOfSmileys.size();
        }
}


/*
            List reducedNumberOfSmileys = new ArrayList<>();

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).startsWith(":") || arr.get(i).startsWith(";")) {
                    if (arr.get(i).endsWith(")") || arr.get(i).endsWith("D")) {
                        if (arr.get(i).contains("-") || arr.get(i).contains("~") || arr.get(i).contains("")) {
                            if (arr.get(i).length() <=3) {
                                reducedNumberOfSmileys.add(arr.get(i));
                            }
                        }
                    }
                } else {
                }
            }
            return reducedNumberOfSmileys.size();
        }
}

can´t pass test:
The Array [;~D, ;oD, :), ;D, ;)] has expected:<4> but was:<5>
 */