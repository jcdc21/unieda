package hw0;

/*
 * Tiempo empleado: 45 minutos
 */
public class HW00_0 {

	public static int gcd(int[] values) {
		if (values.length == 1)
			return values[0];
		int num = gcd(values[0], values[1]);
		for (int i = 2; i < values.length; i++) {
			num = (values[i] < num) ? gcd(num, values[i]) : gcd(values[i], num);
		}
		return num;
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static int freqs(int[] data, int[] buffer, int[] freqs) {
		if (data.length == 0)
			return 0;
		ordenar(data);
		int n = 1;
		buffer[0] = data[0];
		freqs[0] = 1;
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i - 1]) {
				freqs[n - 1]++;

			} else {
				buffer[n] = data[i];
				freqs[n] = 1;
				n++;
			}
		}
		return n;
	}

	private static void ordenar(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			intercambio(a);
		}
	}

	private static void intercambio(int[] a) {
		for (int j = 0; j < a.length - 1; j++) {
			if (a[j] > a[j + 1]) {
				int tmp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = tmp;
			}
		}
	}

}
