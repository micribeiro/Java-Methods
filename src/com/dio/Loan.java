package com.dio;

public class Loan {
		public static int getTwoInstallments() {
			return 2;
		}
		
		public static int getThreeInstallments() {
			return 3;
		}
		
		public static double getTwoInstallmentsFee() {
			return 0.3;
		}
		
		public static double getThreeInstallmentsFee() {
			return 0.45;
		}
		
		public static void calculate(double money, int installments) {
			if (installments == 2) {
				double finalPayment = money + (money * getTwoInstallmentsFee());
				System.out.println("Loan final payment for 2 installments: R$" + finalPayment);
			} else if (installments == 3) {
				double finalPayment = money + (money * getThreeInstallmentsFee());
				System.out.println("Loan final payment for 3 installments: R$ " + finalPayment);
			} else {
				System.out.println("Installments quantity not allowed.");
			}
		}
}
