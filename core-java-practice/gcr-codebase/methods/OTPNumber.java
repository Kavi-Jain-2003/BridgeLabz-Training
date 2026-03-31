//Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same

public class OTPNumber {
	public static void main(String[] args) {
		int[] otps = new int[10];

		// Generate 10 OTPs
		System.out.println("Generated OTPs:");
		for (int i = 0; i < 10; i++) {
			otps[i] = generateOTP();
			System.out.println(otps[i]);
		}

		// Check if OTPs are unique
		if (areOTPsUnique(otps)) {
			System.out.println("All OTPs are unique.");
		} else {
			System.out.println("Duplicate OTPs found.");
		}

	}

	// generate otp number
	public static int generateOTP() {
		return 100000 + (int) (Math.random() * 900000);
	}

	// method to check if all otps are uniue in the array
	public static boolean areOTPsUnique(int[] otps) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (otps[i] == otps[j]) {
					return false;
				}
			}
		}
		return true;

	}
}