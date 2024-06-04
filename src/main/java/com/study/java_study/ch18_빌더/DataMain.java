package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 0, 1.1, null);
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(1.23);

        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(2)
                .data4("@")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("A")
                .data2(2)
                .data3(3.2)
                .data4("c")
                .build();
    }


}
