package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {
    /*
        문제. Color 객체 5개를 담을 수 있는 배열을 생성하여
             #CA848A, Brandied Apricot
             #FFBE98, Peach Fuzz
             #964F4C, Marsala
             #A78C7B, Almondine
             #D8c88D, Almond peach
             색상 데이터를 저장 한 후에 for문을 사용하여 배열에 들어와있는 모든 생상 정보를 printInfo()로 호출하여 출력한다.
             이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
             이때 null로 바꿀때에는 반복문을 사용한다.
     */
//        Color color = new Color();
        Color[] c = new Color[5];

        c[0] = new Color("#CA848A", "Brandied Apricot");
        c[1] = new Color("#FFBE98", "Peach Fuzz");
        c[2] = new Color("#964F4C", "Marsala");
        c[3] = new Color("#A78C7B", "Almondine");
        c[4] = new Color("#D8c88D", "Almond peach");

        Color[] cc = new Color[]{
                new Color("#CA848A", "Brandied Apricot"),
                new Color("#FFBE98", "Peach Fuzz"),
                new Color("#964F4C", "Marsala"),
                new Color("#A78C7B", "Almondine"),
                new Color("#D8c88D", "Almond peach")
        };

        for (Color color : c) {
            color.printInfo();
        }

        for (Color color : cc) {
            color.setCode(null);
            color.setName(null);
        }

//        for(int i = 0; i<cc.length; i++){
//            cc[i].printInfo();
//        }

        for (Color color : cc) {
            color.printInfo();
        }
    }
}

