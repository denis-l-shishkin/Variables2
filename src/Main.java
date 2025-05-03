public class Main {
    public static void main(String[] args) {
        int varInt;
        byte varByte;
        short varShort;
        long varLong;
        float varFloat;
        double varDouble;
        varInt = 10000000;
        varByte = 100;
        varShort = 10000;
        varLong = 10000000000L;
        varFloat = 10000000.1234567f;
        varDouble = 10000000000.123456789101112;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        System.out.println("--End of task 1--\n");
        float varFloat2 = 27.12f;
        long varLong2 = 987678965549L;
        float varFloat21 = 2.786f;
        short varShort2 = 569;
        short varShort21 = -159;
        short varShort22 = 27897;
        byte varByte2 = 67;
        System.out.println(varFloat2);
        System.out.println(varLong2);
        System.out.println(varFloat21);
        System.out.println(varShort2);
        System.out.println(varShort21);
        System.out.println(varShort22);
        System.out.println(varByte2);
        System.out.println("--End of task 2--\n");
        byte pupilOfLudmila = 23;
        byte pupilOfAnna = 27;
        byte pupilOfEkaterina = 30;
        short totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + (totalSheets / (pupilOfLudmila + pupilOfAnna + pupilOfEkaterina)) + " листов бумаги.");
        System.out.println("--End of task 3--\n");
        byte efficiencyPerMinute = 8; //16 bottles per 2 minutes
        byte minutesPerHour = 60;
        byte hoursPerDay = 24;
        byte daysPerMonth = 30;
        byte periodOfTime2 = 1; //1 day
        byte periodOfTime3 = 3; //3 days
        byte periodOfTime4 = 1; //1 month
        byte periodOfTime1Minutes = 20; //20 minutes
        short periodOfTime2Minutes = (short) (periodOfTime2 * hoursPerDay * minutesPerHour); //1 day
        short periodOfTime3Minutes = (short) (periodOfTime3 * hoursPerDay * minutesPerHour); //3 days
        int periodOfTime4Minutes = (periodOfTime4 * daysPerMonth * hoursPerDay * minutesPerHour); //1 month
        short outputPerTime1 = (short) (periodOfTime1Minutes * efficiencyPerMinute);
        short outputPerTime2 = (short) (periodOfTime2Minutes * efficiencyPerMinute);
        int outputPerTime3 = (periodOfTime3Minutes * efficiencyPerMinute);
        int outputPerTime4 = (periodOfTime4Minutes * efficiencyPerMinute);
        System.out.println("За 20 минут машина произвела " + outputPerTime1 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + outputPerTime2 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + outputPerTime3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + outputPerTime4 + " штук бутылок.");
        System.out.println("--End of task 4--\n");
        byte totalPaint = 120;
        byte usedWhitePaint = 2; //for one classroom
        byte usedBrownPaint = 4; //for one classroom
        byte totalUsedPaint = (byte) (usedWhitePaint + usedBrownPaint); //for one classroom
        byte totalClassroom = (byte) (totalPaint / totalUsedPaint);
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + (totalClassroom * usedWhitePaint) + " банок белой краски и " + (totalClassroom * usedBrownPaint) + " банок коричневой краски.");
        System.out.println("--End of task 5--\n");
        System.out.println("""
                
                 Рецепт спортзавтрака:
                
                 Бананы — 5 штук (1 банан — 80 грамм).
                 Молоко — 200 мл (100 мл = 105 грамм).
                 Мороженое-пломбир — 2 брикета по 100 грамм.
                 Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
                
                 Смешать все в блендере - и готово!
                """);
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int oneBananaWeight = 80;
        float milkWeight100Ml = 105;
        int oneIceCreamWeight= 100;
        int oneEggWeight = 70;
        float milkWeight1Ml = (milkWeight100Ml / 100);
        short grPerKg = 1000;
        int bananasWeight = bananas * oneBananaWeight;
        float milkWeight = milk * milkWeight1Ml;
        int iceCreamWeight = iceCream * oneIceCreamWeight;
        int eggsWeight = eggs * oneEggWeight;
        float totalWeightGr = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float totalWeightKgr = (bananasWeight + milkWeight + iceCreamWeight + eggsWeight) / grPerKg;
        System.out.println("Общий вес спортзавтрака составляет: \n" +
                totalWeightGr + " грамм или " + totalWeightKgr + " килограмм.");
        System.out.println("--End of task 6--\n");
        short weightLoss1Gr = 250;
        short weightLoss2Gr = 500;
        short totalLossKgr = 7;
        short totalLossGr = (short) (totalLossKgr * grPerKg);
        short dayLoss1 = (short) (totalLossGr / weightLoss1Gr);
        short dayLoss2 = (short) (totalLossGr / weightLoss2Gr);
        short averageNumberOfDay = (short) ((dayLoss1 + dayLoss2) / 2);
        System.out.println(dayLoss1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.\n" +
                dayLoss2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.\n" +
                "\n" +
                averageNumberOfDay + " дней может потребоваться в среднем, чтобы добиться результата похудения.");
        System.out.println("--End of task 7--\n");
        int salaryOfMasha = 67760;
        int salaryOfDenis = 83690;
        int salaryOfKristina = 76230;
        float increase = 0.1f;
        float increaseMasha = salaryOfMasha * increase;
        float increaseDenis = salaryOfDenis * increase;
        float increaseKristina= salaryOfKristina* increase;
        float newSalaryOfMasha = salaryOfMasha + increaseMasha;
        float newSalaryOfDenis = salaryOfDenis + increaseDenis;
        float newSalaryOfKristina= salaryOfKristina + increaseKristina;
        System.out.println("Маша теперь получает " + newSalaryOfMasha + " рублей. Годовой доход вырос на " + (increaseMasha * 12) + " рублей");
        System.out.println("Денис теперь получает " + newSalaryOfDenis + " рублей. Годовой доход вырос на " + (increaseDenis * 12) + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryOfKristina + " рублей. Годовой доход вырос на " + (increaseMasha * 12)  + " рублей");
        System.out.println("--End of task 8--\n");

    }
}