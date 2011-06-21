package ru.iteco.tddexample.notdd;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumberFinder {
	public static boolean isPerfect(int number) {
		// �������� ��������
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		factors.add(number);
		for (int i = 2; i < Math.sqrt(number); i++)
			if (number % i == 0) {
				factors.add(i);
				if (number / i != i)
					factors.add(number / i);
			}

		// ��������� ����� ���������
		int sum = 0;
		for (Integer i : factors)
			sum += i;
		// ���������, �������� �� ����� �����������
		return sum - number == number;
	}

	public static void main(String[] args) {
		System.out.println("�������� �� ����� " + args[0] + " �����������?");
		String answer = PerfectNumberFinder
				.isPerfect(Integer.parseInt(args[0])) ? "��������"
				: "�� ��������";
		System.out.println("�����: " + answer);
	}
}
