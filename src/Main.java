public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1:");
        int varInt = 0;
        System.out.println("Значение переменной с типом int равно"+ varInt);
        byte varByte = -128;
        System.out.println("Значение переменной с типом byte  равно"+ varByte);
        short varShort = - 32768;
        System.out.println("Значение переменной с типом short равно "+ varShort);
        long varLong = -92233L;
        System.out.println("Значение переменной с типом long равно "+ varLong);
        float varFloat = 1.1f;
        System.out.println("Значение переменной с типом float равно "+ varFloat);
        double varDouble = -5.55;
        System.out.println("Значение переменной с типом double равно "+ varDouble);

        // Задача 2
        System.out.println("Задача 2:");
        float first = 27.12f;
        System.out.println(first);
        long second = 987_678_965_549L;
        System.out.println( second);
        float third =  2.786f;
        System.out.println(third);
        boolean fourth =  false;
        System.out.println(fourth);
        short fifth =  569;
        System.out.println(fifth);
        short sixth = -159;
        System.out.println(sixth);
        short seventh = 27897;
        System.out.println(seventh);
        byte eighth =  67;
        System.out.println(eighth);

        //Задача 3
        System.out.println("Задача 3:");
        byte studentLP = 23;
        byte studentAA = 27;
        byte studentEA = 30;
        byte totalStudent = (byte) (studentLP + studentAA + studentEA);
        short totalPaper = 480;
        int paperPerPerson =  totalPaper / totalStudent;
        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n", paperPerPerson);

        //Задача 4
        System.out.println("Задача 4:");
        byte bottle = 16;
        byte time1 = 2;
        int bottlePerTime = bottle / time1;
        short time2 = 20;
        System.out.printf( "За 20 минут машины произвела бутылок %d штук\n", bottlePerTime*time2);
        int time3 = 24 * 60;
        System.out.printf( "За 1 сутки машины произвела бутылок %d штук\n", bottlePerTime*time3);
        int time4 = time3*3;
        System.out.printf( "За 3 дня машины произвела бутылок %d штук\n", bottlePerTime*time4);
        int time5 = time3*30;
        System.out.printf( "За 1 месяц машины произвела бутылок %d штук\n", bottlePerTime*time5);

        //Задача 5
        System.out.println("Задача 5:");
        byte totalCans = 120;
        byte whiteCansPerClass = 2;
        byte brownCansPerClass = 4;
        int cansPerClass = (whiteCansPerClass+brownCansPerClass);
        int totalClass = totalCans / cansPerClass;
        int totalWhiteCans = totalClass * whiteCansPerClass;
        int totalBrownCans = totalClass * brownCansPerClass;
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n", totalClass, totalWhiteCans, totalBrownCans);

        //Задача 6
        System.out.println("Задача 6:");
        byte weightBanana = 80;
        byte totalBanana = 5;
        byte weightMilk = 105;
        byte totalMilk = 2;
        short weightIce = 200;
        byte totalIce = 2;
        byte weightEgg = 70;
        byte totalEgg = 4;
        int weightMix = weightIce * totalIce + weightBanana * totalBanana + weightEgg * totalEgg + weightMilk * totalMilk;
        float weightMixKg = (float) weightMix / 1000;
        System.out.println(weightMixKg);

        //Задача 7
        System.out.println("Задача 7:");
        short weightDelta = 7000;
        short weightPerDay1 = 250;
        short weightPerDay2 = 500;
        int possibility1 =  weightDelta / weightPerDay1;
        int possibility2 =  weightDelta / weightPerDay2;
        System.out.printf("Для похудения на 7 кг по  %d грамм в день потребуется %d дней, по %d грамм - %d дней\n", weightPerDay1, possibility1, weightPerDay2, possibility2);

        //Задача 8
        System.out.println("Задача 8:");
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        int prem = 10;
        int salaryMNew = salaryM + salaryM * prem / 100;
        int salaryDNew = salaryD + salaryD * prem / 100;
        int salaryKNew = salaryK + salaryK * prem / 100;
        int salaryMPerYear = salaryM * 12;
        int salaryDPerYear = salaryD * 12;
        int salaryKPerYear = salaryK * 12;
        int salaryMPerYearNew = salaryMNew * 12;
        int salaryDPerYearNew = salaryDNew * 12;
        int salaryKPerYearNew = salaryKNew * 12;
        System.out.printf( "Маша теперь получает %d рублей. Годовой доход вырос на %d рублей\n",salaryMNew, salaryMPerYearNew-salaryMPerYear );
        System.out.printf( "Денис теперь получает %d рублей. Годовой доход вырос на %d рублей\n",salaryDNew, salaryDPerYearNew-salaryDPerYear );
        System.out.printf( "Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей\n",salaryKNew, salaryKPerYearNew-salaryKPerYear );


    }
}