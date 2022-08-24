package com.amalozemov;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';

        String result = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(result);
        System.out.println(result);
        System.out.println(result);

        //Задача №2
        double height = 1.96;
        int weight = 110;

        double index = weight / (height * height);
        System.out.println(index);

        //Задача №3
        char [] mass = {'a','b','c','d','e'};
        System.out.println(mass);
        mass[4] = 'h';
        System.out.println(mass);
        // Задание №4
        for(int i = 1; i < 101; i++){
            System.out.println(i + "a");
        }
        // Задание №5
        int ageChildren = 17;
        if(ageChildren < 6){
            System.out.println("пошел в сад");
        }
        else if(ageChildren < 11){
            System.out.println("пошел в младшую школу");
        }
        else if(ageChildren < 17){
            System.out.println("пошел в старшую школу");
        }
        else {
            System.out.println("пошел в университет");
        }

        //Продвинутый уровень
        //Задача №1
        System.out.println(Integer.parseInt("234") + "some_text".length());

        //Задача №2
        int a = 3;
        int b = 5;
        int res1 = (int) Math.pow((a + b), 2);
        System.out.println(res1);

        //Задача №3
        int[] mass1 = {1,2,5,7,10};
        int[] mass2 = {2,3,2,17,15};
        int [] massResult = new int[15];
        int[] massMultiplication = new int[5];
        for(int i = 0; i < massMultiplication.length; i++){
            massMultiplication[i] = mass1[i] * mass2[i];
        }
        System.arraycopy(mass1, 0, massResult, 0,  mass1.length);
        System.arraycopy(mass2, 0, massResult, mass1.length,  mass2.length);
        System.arraycopy(massMultiplication, 0, massResult, mass2.length + mass1.length,  massMultiplication.length);
        Arrays.stream(massResult).forEach(x -> System.out.print(x + " "));
        System.out.println("");

        //Задача №4
        String tmp = "Hello world!";
        System.out.println(tmp.replace("l", "r").toUpperCase().substring(0, 8));

        //Задание №5
        int count = 0;
        double result1 = 0;
        for(; result1 <= 1_000_000; result1+=  0.01123){
            count++;
            if(count < 0){
                break;
            }
        }
        System.out.println(count);

        // Задание №6
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = true;

        if(chicken && vegetables && sour && toast){
            System.out.println("Делаем цезарь");
        }
        else if(vegetables && (sausage || chicken) &&  eggs){
            System.out.println("Делаем оливье");
        }
        else if(vegetables){
            System.out.println("Делаем овощной салат");
        }
        else {
            System.out.println("Салат сделать невозможно");
        }

        //Экспертный уровень
        //Задача №1

        String sensetive = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String sensetiveNoMail = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        String sensetiveNoData = "<client>(Какие то данные)<data></data></client>";

        System.out.println(makeMask(sensetive));
        System.out.println(makeMask(sensetiveNoMail));
        System.out.println(makeMask(sensetiveNoData));
    }

    public static String makeMask(String sensetive){
        String res = "";
        int beginData = sensetive.lastIndexOf("<data>") + 6;
        int endData = sensetive.lastIndexOf("</data>");
        String [] datas = sensetive.substring(beginData, endData).split(";");
        for (int i = 0; i < datas.length; i++) {
            if(datas[i].matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")){
                StringBuilder sb = new StringBuilder(datas[i]);
                datas[i] = String.valueOf(sb.replace(4, 6, "***"));
            }
            else if(datas[i].matches("[a-z]+@[a-z]+.[a-z]*")){
                StringBuilder sb = new StringBuilder(datas[i]);
                int dog = datas[i].lastIndexOf("@");
                int dot = datas[i].lastIndexOf(".");
                datas[i] = String.valueOf(sb.replace(dog - 1, dog, "*").replace(dog + 1, dot, "*".repeat(dot - dog)));
            }
            else if(datas[i].matches("[А-Яа-я]+\\s[А-Яа-я]+\\s[А-Яа-я]+")){
                StringBuilder sb = new StringBuilder(datas[i]);
                String [] name = datas[i].split(" ");
                StringBuilder nameUnmask = new StringBuilder(name[0]);
                name[0] = String.valueOf(nameUnmask.replace(1, name[0].length() - 1, "*".repeat(name[0].length() - 2)));
                StringBuilder secondNameUnmask = new StringBuilder(name[0]);
                name[2] = String.valueOf(nameUnmask.replace(1, name[2].length(), "."));

                datas[i] = name[0] + " " + name[1] + " " + name[2];
            }
            else {

            }
        }
        for (String s : datas) {
            res = res + s + ";";
        }
        StringBuilder maskedString = new StringBuilder(sensetive);
        maskedString.replace(beginData, endData, res.trim().substring(0, res.length() - 1));

        return maskedString.toString();
    }

}