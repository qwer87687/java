package lesson2;

public class LowPassFilterCalculate
    // Вычисляем частоту среза ФНЧ 2-го порядка
    // по формуле F=0.707/(2π*R*C)
    // С измеряем в фарадах, R - в омах,
    {
        public static void main(String[]args) {
            System.out.println("Частота среза фильтра в герцах: ");
        System.out.println(calculate(2, 6));
    }

        public static double calculate(int varC, int varR) {
        // результат формулы кладем в переменную result
        double result = 0.707/(6.28*varC*varR);
        return result;
    }
    }