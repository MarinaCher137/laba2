package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tasks {
    public void task1(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №1");
        double a;
        double b;
        double c;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z1.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + a);
            b = scanner.nextInt();
            System.out.println("Ввод b из файла, b=" + b);
            c = scanner.nextInt();
            System.out.println("Ввод c из файла, c=" + c);
            scanner.close();
        }
        System.out.println("Результат равен "+ ((b+Math.sqrt((b*b)+(4*a*c)))/(2*a)-a*a*a*c+(1/(double)(b*b))));}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
            System.out.println("Результат равен "+ ((b+Math.sqrt((b*b)+(4*a*c)))/(2*a)-a*a*a*c+(1/(double)(b*b))));}
    }
    public void task2(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №2");
        double a;
        double b;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z2.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + a);
            b = scanner.nextInt();
            System.out.println("Ввод b из файла, b=" + b);
            scanner.close();
        }
        System.out.println("P= "+ (a+b+Math.sqrt((a*a)+(b*b))));
        System.out.println("S= "+(a*b/2));}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("P= "+ (a+b+Math.sqrt((a*a)+(b*b))));
            System.out.println("S= "+(a*b/2));}
    }
    public void task4(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №4");
        double a;
        double b;
        double c;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z4.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + a);
            b = scanner.nextInt();
            System.out.println("Ввод b из файла, b=" + b);
            c = scanner.nextInt();
            System.out.println("Ввод c из файла, c=" + c);
            scanner.close();
        }
        if(a<b&&b<c){
            a=a*2;
            b=b*2;
            c=c*2;
        }
        else {
            a=Math.abs(a);
            b=Math.abs(b);
            c=Math.abs(c);
        }
        System.out.println("a= "+ a + " b= " + b + " c= " + c);}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
            if(a<b&&b<c){
                a=a*2;
                b=b*2;
                c=c*2;
            }
            else {
                a=Math.abs(a);
                b=Math.abs(b);
                c=Math.abs(c);
            }
            System.out.println("a= "+ a + " b= " + b + " c= " + c);}
    }
    public void task3(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №3");
        double a;
        double b;
        double c;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z3.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + a);
            b = scanner.nextInt();
            System.out.println("Ввод b из файла, b=" + b);
            c = scanner.nextInt();
            System.out.println("Ввод c из файла, c=" + c);
            scanner.close();
        }
        if(a>0){
            a=a*a;
        }
        else {
            a= (int) Math.pow(a,4);
        }
        if(b>0){
            b=b*b;
        }
        else {
            b= (int) Math.pow(b,4);
        }
        if(c>0){
            c=c*c;
        }
        else {
            c= (int) Math.pow(c,4);
        }
        System.out.println("a= "+ a + " b= " + b + " c= " + c);}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
            if(a>0){
                a=a*a;
            }
            else {
                a= (int) Math.pow(a,4);
            }
            if(b>0){
                b=b*b;
            }
            else {
                b= (int) Math.pow(b,4);
            }
            if(c>0){
                c=c*c;
            }
            else {
                c= (int) Math.pow(c,4);
            }
            System.out.println("a= "+ a + " b= " + b + " c= " + c);}
    }
    public void task5(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №5");
        int a;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z5.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + a);
            scanner.close();
        }
        switch (a) {
            case 1: System.out.println("5 уроков");
                break;
            case 2: System.out.println("7 уроков");
                break;
            case 3: System.out.println("6 уроков");
                break;
            case 4: System.out.println("8 уроков");
                break;
            case 5: System.out.println("9 уроков");
                break;
            case 6: System.out.println("3 урока");
                break;
            case 7: System.out.println("4 урока");
                break;
            default:
                break;
        }}catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            switch (a) {
                case 1: System.out.println("5 уроков");
                    break;
                case 2: System.out.println("7 уроков");
                    break;
                case 3: System.out.println("6 уроков");
                    break;
                case 4: System.out.println("8 уроков");
                    break;
                case 5: System.out.println("9 уроков");
                    break;
                case 6: System.out.println("3 урока");
                    break;
                case 7: System.out.println("4 урока");
                    break;
                default:
                    break;
            }}
    }
    public void task6(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №6");
        int n;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z6.txt";
            Scanner scanner = new Scanner(new File(path));
            n = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + n);
            scanner.close();
        }
        int summ=0;
        summ=n%10;
        do {
            n = n / 10;
        }
        while (n>10);
        summ = summ + n;
        System.out.println("summ= "+ summ );}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
            int summ=0;
            summ=n%10;
            do {
                n = n / 10;
            }
            while (n>10);
            summ = summ + n;
            System.out.println("summ= "+ summ );}
    }
    public void task7(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №7");
        int n;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z7.txt";
            Scanner scanner = new Scanner(new File(path));
            n = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + n);
            scanner.close();
        }
        int i;
        int f=1;
        n=n/3;
        for(i=0; i<n; i++)
        {
            f=f*2;
            }
        System.out.println("амеб " + f );}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
            int i;
            int f=1;
            n=n/3;
            for(i=0; i<n; i++)
            {
                f=f*2;
            }
            System.out.println("амеб " + f );}

        }

    public void task8(int workingMode) throws FileNotFoundException {
        System.out.println("Задача №8");
        int n;
        try{
        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\lifirenko\\z8.txt";
            Scanner scanner = new Scanner(new File(path));
            n = scanner.nextInt();
            System.out.println("Ввод a из файла, a=" + n);
            scanner.close();
        }
        int i=1;
        float res=1;
        while (i<=n) {
            res *= (float) (2 * i) / (2 * i + 1);
            i++;
        }
        System.out.println("результат " + res );}
        catch (Exception ex){
            System.out.println("К сожалению указанный файл не был найден, пожалуйста введите данные в ручную");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            n = scanner.nextInt();
            int i=1;
            float res=1;
            while (i<=n) {
                res *= (float) (2 * i) / (2 * i + 1);
                i++;
            }
            System.out.println("результат " + res );

        }
    }}
